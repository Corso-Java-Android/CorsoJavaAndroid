drop table if exists clienti;
create table
		clienti ( 
		id int primary key,
		nome varchar(50),
		cognome varchar(50),
		email varchar(50),
		indirizzo varchar(100),
		citta varchar(50),
		provincia varchar(4),
		cap int );

insert into clienti VALUES (1,'Giuseppe','Verdi','gverdi@aol.com','Roncole Verdi','Busseto','PR',43011);
insert into clienti VALUES (2,'Gioacchino','Rossini','gioacchino@libero.it','Via del Duomo','Pesaro','PU',61122);
insert into clienti VALUES (3,'Giacomo','Puccini','gpuccini@gmail.com','Corte San Lorenzo, 9 ','Lucca','LU',55100);
insert into clienti VALUES (4,'Gaetano','Donizetti','gaetano@walla.com','Via Don Luigi Palazzolo, 88','Bergamo','BG',24122);
insert into clienti VALUES (5,'Vincenzo','Bellini','bellini@bellini.org','Piazza San Francesco d’Assisi, 3','Catania','CT',95100);

drop table if exists ordini;

create table ordini (id_ordine int primary key, data date,valore decimal(10,2),id_cliente int);
insert into ordini values (1, str_to_date('10/10/2018', '%d/%m/%Y') ,345.67,1);
insert into ordini values (2, str_to_date('31/12/2017', '%d/%m/%Y') ,176.00,3);
insert into ordini values (3, str_to_date('01/01/2019', '%d/%m/%Y') ,33.88,2);
insert into ordini values (4, str_to_date('24/11/2018', '%d/%m/%Y') ,4589.00,3);
insert into ordini values (5, str_to_date('13/07/2018', '%d/%m/%Y') ,230.00,10);
insert into ordini values (6, str_to_date('01/06/2018', '%d/%m/%Y') ,144.00,9);

select sysdate(), now() from dual;

select str_to_date('10/10/2018', '%d/%m/%Y') from dual;


-- prodotto cartesiano 
select c.id, c.nome, o.id_ordine, o.valore
from clienti c, ordini o;

-- inner join
select
clienti.nome,clienti.cognome,o.data,o.valore
from clienti 
inner join ordini o 
on clienti.id = o.id_cliente
;

-- inner join con where clauses
select
c.nome,c.cognome,o.data,o.valore
from clienti c, ordini o 
where c.id = o.id_cliente
;

-- left join
select
nome,cognome,data,valore
from clienti a
left join ordini b on a.id = b.id_cliente
;

-- left join con esclusione della inner
select
nome,cognome,data,valore
from clienti a
left join ordini b on a.id = b.id_cliente
where data is null
;

-- right join
select
nome,cognome,data,valore
from clienti a
right join ordini b on a.id = b.id_cliente
;

-- right join con esclusione della inner
select
nome,cognome,id_ordine,data,valore
from clienti a
right join ordini b on a.id = b.id_cliente
where nome is null
;

-- right join ottenuta con inversione delle tabelle
select
nome,cognome,id_ordine,data,valore
from ordini b
left join clienti a on a.id = b.id_cliente
;

-- full outer join
select
nome,cognome,data,valore
from clienti a
left join ordini b on a.id = b.id_cliente
union
select
nome,cognome,data,valore
from clienti a
right join ordini b on a.id = b.id_cliente
;

-- full outer join senza inner
select
nome,cognome,data,valore
from clienti a
left join ordini b on a.id = b.id_cliente
where data is null
union
select
nome,cognome,data,valore
from clienti a
right join ordini b on a.id = b.id_cliente
where nome is null
;

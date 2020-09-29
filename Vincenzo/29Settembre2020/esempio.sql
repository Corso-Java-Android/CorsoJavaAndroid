select 100 + 300 / 2 from dual;

drop table if exists tab01;

create table if not exists tab01(id int, descrizione varchar(200), valore decimal(13, 2));

insert into tab01 (id, descrizione, valore) values (1, 'Descrizione di prova', 100.30);

insert into tab01 (id, descrizione, valore) values (2, 'Descrizione 001', 2370);

insert into tab01 (id, descrizione, valore) values (3, 'Descrizione riga 003', 735.76);

insert into tab01 (id, descrizione, valore) values (4, 'Riga numero 4', 655.43);

delete from tab01 where id = 3;

update tab01 set valore = 5000, descrizione = 'Valore aggiornato' where id = 2;

select * from tab01;

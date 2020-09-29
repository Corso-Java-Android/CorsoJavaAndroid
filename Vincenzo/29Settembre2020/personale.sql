drop table if exists personale;

create table if not exists personale(matricola int, nome varchar(50), cognome varchar(50), stipendio double(10, 2));

insert into personale (matricola, nome, cognome, stipendio) values (1, 'Vincenzo', 'Santoro', 1500);

insert into personale (matricola, nome, cognome, stipendio) values (2, 'Enrico', 'Macrì', 840);

insert into personale (matricola, nome, cognome, stipendio) values (3, 'Danis', 'Moretta', 1000.30);

select * from personale

drop table if exists tab01;

CREATE TABLE tab01
(
   id integer DEFAULT NULL,
   descrizione varchar(200) DEFAULT NULL,
   valore DECIMAL DEFAULT NULL
);

INSERT INTO tab01 (id,descrizione,valore) VALUES (1,'Descrizione di prova',100.30);
INSERT INTO tab01 (id,descrizione,valore) VALUES (2,'Valore aggiornato',5000.00);
INSERT INTO tab01 (id,descrizione,valore) VALUES (4,'Riga numero 4',655.43);
INSERT INTO tab01 (id,descrizione,valore) VALUES (5,'Riga numero 5',655.43);
INSERT INTO tab01 (id,descrizione,valore) VALUES (6,'Riga numero 6',null);
INSERT INTO tab01 (id,descrizione,valore) VALUES (7,'Riga numero 7',null);
INSERT INTO tab01 (id,descrizione,valore) VALUES (8,'Riga numero 8',null);
INSERT INTO tab01 (id,descrizione,valore) VALUES (10,'Descrizione linea 10',77.98);
INSERT INTO tab01 (id,descrizione,valore) VALUES (11,'Descrizione linea 11',4567.89);

select id, nome as regione_nome from regioni where nome = 'Lazio';

select id_regione, id, nome, sigla_automobilistica from province where id_regione = 12;

/*SEMI JOIN*/
select id_regione, id, nome, sigla_automobilistica from province t1 where exists (select id, nome as regione_nome from regioni t2 where nome = 'Lazio' AND t1.id_regione = t2.id);

/*INNER JOIN*/
select
p.id_regione, r.nome, p.id, p.nome, p.sigla_automobilistica
from province p, regioni r 
where r.nome = 'Lazio' and p.id_regione = r.id
;

select count(*) from comuni where id_provincia = 70;

select * from province where id=70;

-- quale è il nome della provincia 70 ovvero nome provincia, numero comuni
select p.nome, count(*) as numero_comuni
from comuni c, province p
where c.id_provincia = 70 AND p.id = 70
;

select * from regioni where nome = 'Puglia';

select count(*) from comuni where id_regione = 16;

-- quanti sono i comuni della puglia
select count(*)
from comuni c, regioni r
where c.id_regione = r.id AND r.nome = 'Puglia'
;

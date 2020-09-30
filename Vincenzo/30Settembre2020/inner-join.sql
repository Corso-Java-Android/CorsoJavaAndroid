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

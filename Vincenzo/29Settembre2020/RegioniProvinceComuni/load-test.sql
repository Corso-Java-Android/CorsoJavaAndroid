select "Regioni:", count(*) from regioni as totali
union
select "Province:", count(*) from province
union
select "Comuni:", count(*) from comuni
;

select nome from regioni order by nome desc;

select nome, capoluogo_provincia, codice_catastale from comuni where id_provincia = 70 OR id_provincia = 12;

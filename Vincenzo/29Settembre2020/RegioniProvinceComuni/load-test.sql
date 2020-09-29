select "Regioni:", count(*) from regioni as totali
union
select "Province:", count(*) from province
union
select "Comuni:", count(*) from comuni
union
select "Comuni extended:", count(*) from comuni_italiani;
;
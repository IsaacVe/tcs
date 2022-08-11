insert into currency(CURRENCYID, NAME, SYMBOL) values
(1, 'sol peruano', 'PEN'),
(2, 'dolar estadounidense', 'USD');

insert into currency_exchange(CURRENCYEXCHANGEID, SOURCECURRENCYID, TARGETCURRENCYID, CURRENCYRATE) values
(1, 1,2, 0.25),
(2, 2,1, 3.93),
(3, 1,1, 1),
(4, 2,2, 1);

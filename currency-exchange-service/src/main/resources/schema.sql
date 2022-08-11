CREATE TABLE IF NOT EXISTS currency
(
    CURRENCYID INTEGER PRIMARY KEY,
    NAME varchar(64) NOT NULL,
    SYMBOL varchar(3) NOT NULL
);

CREATE TABLE IF NOT EXISTS currency_exchange
(
    CURRENCYEXCHANGEID INTEGER PRIMARY KEY, 
    SOURCECURRENCYID INTEGER,
    TARGETCURRENCYID INTEGER,
    CURRENCYRATE NUMERIC
);
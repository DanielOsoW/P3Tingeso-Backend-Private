\! clear;
\c postgres;
drop database if exists diplomadosdb;
\i createDB.sql;    
\i loadData.sql;
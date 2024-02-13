use classicmodels;
select * from jammer;
set sql_safe_updates=0;
/*first run this, then run below code;
START TRANSACTION;
SAVEPOINT S1;

DELETE FROM jammer where id=2;
SAVEPOINT S2;
select * from jammer;

->This deletes the data and creates two savepoints before and after it.
*/

ROLLBACK TO S1;
select * from jammer;

/*Rolling back to first savepoint*/
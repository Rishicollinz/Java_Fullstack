use classicmodels;

START TRANSACTION ;
Delete from jammer where id=1;
COMMIT;
select * from jammer;
END TRANSACTION;

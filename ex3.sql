use classicmodels;
/*--Rollback:*/
Insert into jammer(id,username,pin,email) values (1,'rishi',1234,'rish@gmail.com');
Insert into jammer(id,username,pin,email) values (2,'mouli',1234,'mouli@gmail.com');
Insert into jammer(id,username,pin,email) values (3,'jammer',1234,'jammer@gmail.com');

START TRANSACTION ;
Delete from jammer where id=1;
ROLLBACK;
select * from jammer;

/*--Data is not deleted by roll back;*/
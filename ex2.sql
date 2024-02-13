use Registration;
create table jammer(id int primary key auto_increment, username varchar(20),pin int(4));
insert into reset(username,pin) values('Rishi','1234');
select * from reset;
use ClassicModels;
create table mouli(id int(10),username varchar(15),pin int(4));
select * from mouli;
ALTER TABLE mouli ADD Email varchar(255);
Insert into mouli(id,username,pin) values ('1','mouli','1234');
UPDATE `mouli` SET `username`='rishi',`pin`='12345',`Email`='rishi@gmail.com' WHERE id=1;

SET SQL_SAFE_UPDATES = 0;
truncate table mouli;

Insert into moudlis(id,username,pin) select id,username,pin from moudli where id=1;

select * from moudlis;
use  classicmodels;
drop table moudlis;
drop table moudli;

select * from mouli;

SET @idss=121;
Insert into mouli(id,username,pin,email) values (@idss,'joy','12212','joy@gal.com');

-- delete:
DELETE FROM mouli WHERE id=121;

-- user creation for db:

CREATE USER rishi@localhost IDENTIFIED BY 'abcd';

--Granting permissions for a user:


CREATE USER rishi@localhost IDENTIFIED BY 'abcd';
CREATE USER mouli@localhost IDENTIFIED BY 'abcd';

SHOW GRANTS FOR rishi@localhost;
GRANT SELECT  ON jammer TO 'rishi'@'localhost';

revoke SELECT  ON jammer From 'rishi'@'localhost';

Drop user rishi@localhost;
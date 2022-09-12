create database local;
create database dev;
create database prod;

SET SQL_SAFE_UPDATES = 0;
 
 -- Local Schema
use local;
create table User
(
id integer,
username varchar(255)
);
insert into User(id,username) values(1,"local_user");
select * from local.User;

-- Dev Schema
use dev;
create table User
(
id integer,
username varchar(255)
);
insert into User(id,username) values(1,"dev_user");
select * from dev.User;

delete from User where username = "local_user";

-- Prod Schema
use prod;
create table User
(
id integer,
username varchar(255)
);
insert into User(id,username) values(1,"prod_user");
select * from prod.User;
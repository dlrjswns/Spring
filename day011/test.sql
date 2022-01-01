select * from all_tables;

create table board1(
   bid int primary key,
   title varchar(20),
   writer varchar(10),
   content varchar(50),
   bdate date default sysdate,
   cnt int default 0
);

create table member1(
	mid varchar(10) primary key,
	password varchar(10),
	name varchar(10),
	role varchar(10)
);
select * from all_tables;

create table board1(
   bid int primary key,
   title varchar(20),
   writer varchar(10),
   content varchar(50),
   bdate date default sysdate,
   cnt int default 0
);
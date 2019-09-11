create table login_user (
id number(10) primary key ,
login_name varchar2(20) not null,
login_password varchar2(20) not null,
phone number(20) not null,
maile VARCHAR2(50) not null,
role number(4) not null
);

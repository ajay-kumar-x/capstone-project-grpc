# GoConsult



Auth Service   -> 8080

Counselor Service -> 8081

User Service  -> 8082

Notification Service -> 8083

Search Service  -> 8084

Booking Service  -> 8085

.........................DataBase requirement.............................

DatabaseName -> capstone
usrname-> root
password-> root



........................ To run all the Instance(Container) of Images...........
command --------->  docker-compose up -d








---------------------NEW---TABLE STRUCTURE-----------------------

-------AUTH Table------
create table if not exists AUTH(
    uid int primary key generated always as identity,
    user_type varchar(10) not null,
	email varchar(50) not null unique,
	password varchar(20) not null
);

select * from AUTH;


-------USERDATA TABLE-----------
create table if not exists USERDATA(
	user_id int primary key,
	user_name varchar(50) not null,
	contact varchar(10) not null,
	address varchar(50) not null,
	dob date not null,
	gender varchar(10),
	occupation varchar(20),
	FOREIGN KEY (user_id) REFERENCES AUTH(uid)
);
select * from USERDATA;


------COUNSELOR table-------
create table if not exists COUNSELOR(
	counselor_id int primary key,
	counselor_name varchar(50) not null,
	contact varchar(20) not null,
	address varchar(50) not null,
	dob date not null,
	gender varchar(10),
	specialization varchar(50) not null,
	experience int not null,
	fees int not null,
	FOREIGN KEY (counselor_id) REFERENCES AUTH(uid)
);

select * from COUNSELOR;



-------SLOT Table--------------
create table if not exists SLOT(
	slot_id int primary key generated always as identity,
	counselor_id int not null,
	date date not null,
	from_time time not null,
	to_time time not null,
	FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id)
);

select * from SLOT;

--------BOOKING table----------
create table if not exists BOOKING(
	booking_id int primary key generated always as identity,
	slot_id int not null UNIQUE,
	user_id int not null,
	total_amount int not null,
	FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),
	FOREIGN KEY (slot_id) REFERENCES SLOT(slot_id)
);
select * from BOOKING;


----------REVIEW table---------
create table if not exists REVIEW(
	review_id int primary key generated always as identity,
	user_id int not null,
	counselor_id int not null,
	date_time timestamp not null,
	review varchar(250) ,
	rating int ,
	FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),
	FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id)
);
select * from REVIEW;

























------------------OLD---TABLE STRUCTURE-----------------------------------



-------USERDATA TABLE-----------
create table if not exists USERDATA(
user_id int primary key,
user_name varchar(50) not null,
email varchar(50) not null,
contact varchar(10) not null,
password varchar(20) not null,
address varchar(50) not null,
occupation varchar(20) not null,
dob date not null,
gender varchar(10) 
);
select * from USERDATA;


------COUNSELOR table-------
create table if not exists COUNSELOR(
counselor_id int primary key generated always as identity,
counselor_name varchar(50) not null,
email varchar(50) not null unique,
contact varchar(20) not null,
password varchar(20) not null,
address varchar(50) not null,
experience int not null,
dob date not null,
fees int not null,
specialization varchar(50) not null,
gender varchar(10) 
);

select * from COUNSELOR;

-------SLOT Table--------------
create table if not exists SLOT(
slot_id int  generated always as identity,
counselor_id int not null,
date date not null,
from_time time not null,
to_time time not null,
FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id),
PRIMARY KEY (slot_id)
);

select * from SLOT;


--------BOOKING table----------
create table if not exists BOOKING(
booking_id int primary key generated always as identity,
slot_id int not null,
user_id int not null,
total_amount int not null,
FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),
FOREIGN KEY (slot_id) REFERENCES SLOT(slot_id)
);
select * from BOOKING;


----------REVIEW table---------
create table if not exists REVIEW(
review_id int primary key generated always as identity,
user_id int not null,
counselor_id int not null,
review_time timestamp not null,
review varchar(250) ,
rating int ,
FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),
FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id)
);
select * from REVIEW;






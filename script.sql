-- drop table review;
-- drop table booking;
-- drop table slot;
-- drop table counselor;
-- drop table userdata;
--GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO root;

select * from counselor;
select * from userData;
select * from slot;
select * from booking;


insert into userdata (email,password,user_name) values('ajay@gmail','1234','ajay')
insert into counselor (email,password,counselor_name) values('rohit@gmail','1234','rohit')

--checking if a particular email is already there or not
select email from userdata where email='ajay@gmail' union all select email from counselor where email='ajay@gmail'

--checking the credential
select user_id from USERDATA where email='rohit@gmail' and password='1234' union all select counselor_id from COUNSELOR where email='rohit@gmail' and password='1234';

insert into booking(slot_id,user_id,total_amount) values(301,100,500);

insert into slot (counselor_id,date,from_time,to_time) values(105,'2022-12-17','12:00:00','13:00:00');

--Slots which are not booked
select * from slot where slot_id not in(select slot_id from booking)

insert into booking(slot_id,user_id,total_amount) values(202,102,500)--select counselor.fees from slot right join counselor on slot.counselor_id=counselor.counselor_id where slot_id=202)

select counselor.fees from slot right join counselor on slot.counselor_id=counselor.counselor_id where slot_id=202;


--Slot detail which are not booked used in search service
SELECT slot_id ,COUNSELOR.counselor_name,COUNSELOR.contact, date,from_time,to_time FROM SLOT  
                              RIGHT JOIN COUNSELOR ON COUNSELOR.counselor_id=SLOT.counselor_id WHERE  
							   slot_id not in (select slot_id from booking) and date='2022-01-29';


--Booking Detail view for User with user_id=102	  used in Booking service

SELECT BOOKING.booking_id, SLOT.slot_id, COUNSELOR.counselor_name, COUNSELOR.contact,COUNSELOR.specialization, date,from_time,to_time,BOOKING.total_amount FROM SLOT  
                              RIGHT JOIN COUNSELOR ON COUNSELOR.counselor_id=SLOT.counselor_id
							  RIGHT JOIN BOOKING on SLOT.slot_id=BOOKING.slot_id
							  where BOOKING.user_id=102;
							  
--Booking Detail view for Counselor with counselor_id=104	  used in Booking service

SELECT BOOKING.booking_id, BOOKING.slot_id,USERDATA.user_name,USERDATA.contact,SLOT.date,SLOT.from_time,SLOT.to_time FROM BOOKING
                                JOIN USERDATA ON USERDATA.user_id=BOOKING.user_id
							    JOIN SLOT ON SLOT.slot_id=BOOKING.slot_id
							    where SLOT.counselor_id=104;
							   




-------USERDATA TABLE-----------
create table if not exists USERDATA(
	user_id int primary key generated always as identity (START WITH 100),
	email varchar(30) NOT NULL UNIQUE,
	password varchar(20) NOT NULL,
	user_name varchar(50) not null,
	contact varchar(10),
	address varchar(50),
	dob date ,
	gender varchar(10),
	occupation varchar(20)
);
select * from USERDATA;


------COUNSELOR table-------
create table if not exists COUNSELOR(
	counselor_id int primary key generated always as identity (START WITH 200),
	email varchar(30) NOT NULL UNIQUE,
	password varchar(20) NOT NULL,
	counselor_name varchar(50) not null,
	contact varchar(20) ,
	address varchar(50) ,
	dob date ,
	gender varchar(10),
	specialization varchar(50) ,
	experience int ,
	fees int 
);

select * from COUNSELOR;



-------SLOT Table--------------
create table if not exists SLOT(
	slot_id int primary key generated always as identity (START WITH 300),
	counselor_id int not null,
	date date not null,
	from_time time not null,
	to_time time not null,
	FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id)
);

select * from SLOT;

--------BOOKING table----------
create table if not exists BOOKING(
	booking_id int primary key generated always as identity (START WITH 400),
	slot_id int not null UNIQUE,
	user_id int not null,
	total_amount int not null,
	FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),
	FOREIGN KEY (slot_id) REFERENCES SLOT(slot_id)
);
select * from BOOKING;


----------REVIEW table---------
create table if not exists REVIEW(
	review_id int primary key generated always as identity (START WITH 500),
	user_id int not null,
	counselor_id int not null,
	date_time timestamp not null,
	review varchar(250) ,
	rating int ,
	FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),
	FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id)
);
select * from REVIEW;


insert into REVIEW (user_id,counselor_id,date_time,review,rating) values(100,200,'2022-12-13 13:00:00','very nice',5);
select USERDATA.user_id, USERDATA.user_name, date_time,review,rating from REVIEW join USERDATA on REVIEW.user_id=USERDATA.user_id where counselor_id=200


drop table review;
drop table booking;
drop table slot;
drop table counselor;
drop table userdata;
drop table auth;
--GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO root;

select * from counselor;
select * from userData;
select * from slot;
select * from booking;



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
							   













-------AUTH Table------
create table if not exists AUTH(
    uid int primary key  GENERATED ALWAYS AS IDENTITY (START WITH 100),
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
	slot_id int primary key generated always as identity (START WITH 200),
	counselor_id int not null,
	date date not null,
	from_time time not null,
	to_time time not null,
	FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id)
);

select * from SLOT;

--------BOOKING table----------
create table if not exists BOOKING(
	booking_id int primary key generated always as identity (START WITH 300),
	slot_id int not null UNIQUE,
	user_id int not null,
	total_amount int not null,
	FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),
	FOREIGN KEY (slot_id) REFERENCES SLOT(slot_id)
);
select * from BOOKING;


----------REVIEW table---------
create table if not exists REVIEW(
	review_id int primary key generated always as identity (START WITH 400),
	user_id int not null,
	counselor_id int not null,
	date_time timestamp not null,
	review varchar(250) ,
	rating int ,
	FOREIGN KEY (user_id) REFERENCES USERDATA(user_id),
	FOREIGN KEY (counselor_id) REFERENCES COUNSELOR(counselor_id)
);
select * from REVIEW;


create database mydatetime;
use mydatetime;

create table my_utildate(id int primary key not null AUTO_INCREMENT, utildate_to_date date, utildate_to_datetime datetime, utildate_to_timestamp timestamp, utildate_to_time time, update_timestamp timestamp);

show variables like '%time_zone%';   (show DB timezone)
set time_zone = '+10:00';   (change DB timezone)

create table my_sqldate(id int primary key not null AUTO_INCREMENT, sqldate_to_date date, sqldate_to_datetime datetime, sqldate_to_timestamp timestamp, update_timestamp timestamp);
create table my_sqltime(id int primary key not null AUTO_INCREMENT,  sqltime_to_datetime datetime, sqltime_to_timestamp timestamp, sqltime_to_time time, update_timestamp timestamp);
create table my_timestamp(id int primary key not null AUTO_INCREMENT,  timestamp_to_datetime datetime, timestamp_to_timestamp timestamp, timestamp_to_time time,  timestamp_to_date date, update_timestamp timestamp);
create table my_joda(id int primary key not null AUTO_INCREMENT,  joda_date_time timestamp, joda_local_date_time timestamp);
create table my_java8(id int primary key not null AUTO_INCREMENT,  zoned_date_time timestamp, local_date_time datetime);


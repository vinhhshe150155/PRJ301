drop database cinema01

create database cinema01

use cinema01
create table category(
category_id int identity(1,1) primary key not null,
category_name nvarchar(50) unique
)
create table languages(
language_id int identity(1,1) primary key not null,
language_name nvarchar(50)
)
create table film(
film_id int identity(1,1) primary key not null,
film_name nvarchar(255),
film_image varchar(1000),
date_release date,
film_start_date date,
film_end_date date,
duration int,
film_description nvarchar(2000),
film_trailer nvarchar(2000),
)
create table filmCate(
category_id int,
film_id int,
foreign key (film_id) references film(film_id),
foreign key (category_id) references category(category_id)
)
create table actor(
actor_id int identity(1,1) primary key not null,
actor_name nvarchar(100),
actor_image nvarchar(1000),
actor_description nvarchar(1000)
)
create table filmActor(
actor_id int,
film_id int,
foreign key (film_id) references film(film_id),
foreign key (actor_id) references actor(actor_id)
)

create table filmLanguage(
film_id int,
foreign key (film_id) references film(film_id),
language_id int,

foreign key (language_id) references languages(language_id),

)
create table seat(
seat_id int identity(1,1) primary key not null,
seat_row varchar(1),
seat_number int,
)
create table customer(
customer_id int identity(1,1) primary key not null,
customer_email varchar(50) unique not null,
customer_pwd varchar(50),
customer_name nvarchar(20),
customer_address nvarchar(100),
customer_phone varchar(13),
createdDate date DEFAULT GETDATE()
)

create table discount(
discount_id int primary key identity(1,1),
discount_name nvarchar(1000),
discount_price int,
discount_description nvarchar(1000)
)
create table showing(
show_id int primary key identity(1,1) not null,
film_id int,
foreign key (film_id) references film(film_id),
room_id int,
show_time datetime

)
create table ticket(
ticket_id int primary key identity(1,1),
show_id int,
ticket_price int,
seat_id int,
seat_status int,
foreign key (show_id) references showing(show_id),
foreign key (seat_id) references seat(seat_id),
)
create table total(
total_id int primary key identity(1,1),
total_amount int,
customer_id int,
discount_id int,
total_date date default getDate(),
status int

foreign key (discount_id) references discount(discount_id),
foreign key (customer_id) references customer(customer_id),

)
create table order_details(
total_id int,
foreign key (total_id) references total(total_id),
ticket_id int,
foreign key (ticket_id) references ticket(ticket_id),
)
create table admin(
admin_id int primary key identity(1,1) not null,
admin_username varchar(30),
admin_pwd varchar(30)
)

create table rating(
rate_id int identity(1,1) primary key not null,
film_id int,
foreign key (film_id) references film(film_id),
rate_point int,
rate_customer int,
foreign key (rate_customer) references customer(customer_id)
)

create table search(
search_id int identity(1,1) primary key not null,
search_value nvarchar(2000),
search_time datetime default getDate()
)
create table visit(
id int identity(1,1) primary key not null,
visit_time date DEFAULT GETDATE()
)


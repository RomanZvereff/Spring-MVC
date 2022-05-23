create database if not exists cinema_db character set 'utf8mb4';

use cinema_db;

create table if not exists customers (
	cust_id int auto_increment primary key,
    cust_first_name varchar(50) not null,
    cust_last_name  varchar(50) not null,
    cust_gender char(1) null,
    cust_phone_num int unsigned null,
    cust_birth_date date null
);

create table if not exists users_info (
	user_id int auto_increment primary key,
    user_login varchar(50) not null,
    user_password varchar(255) not null
);

create table if not exists now_in_cinema (
	film_id int auto_increment primary key,
	start_date date not null,
    end_date date not null,
    film_name varchar(50) not null,
    film_poster varchar(255) not null,
    film_trailer varchar(255) not null,
    film_desc varchar(1000) not null,
    film_actors varchar(255) not null,
    film_genres varchar(255) not null
);
create table xmheart_users (
    id int primary key auto_increment,
    username varchar(20) not null,
    password varchar(32) not null
);

INSERT INTO xmheart_users (username, password) VALUES ("admin", "admin");
create table xmheart_user_role_relation (
	user_id int,
	role_id int,
	primary key(user_id, role_id)
);

insert into xmheart_user_role_relation(user_id, role_id) values (1, 1);
use slktraining;
drop table if exists messages;
create table messages (
	id INT primary key auto_increment,
	msg_from VARCHAR(255) not null,
	msg_to VARCHAR(255) not null,
	msg_cc VARCHAR(255),
	msg_subject VARCHAR(255),
	msg_body text,
	sent_at datetime
);
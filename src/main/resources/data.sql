insert into USER(name, email, password) VALUES('Student', 'student@gmail.com', '123456');

insert into COURSE(name, category) values('Spring Boot', 'Back-end');
insert into COURSE(name, category) values('HTML5', 'Front-end');

insert into TOPIC(title, message, created_date, topic_status, author_id, course_id) values('Help', 'Error creating project', '2019-07-04 17:49:24', 'NOT_ANSWERED', 1, 1);
insert into TOPIC(title, message, created_date, topic_status, author_id, course_id) values('Compiling error', 'Error creating bean with name entityManagerFactory defined in class path resource', '2019-07-04 17:49:24', 'NOT_ANSWERED', 1, 1);
insert into TOPIC(title, message, created_date, topic_status, author_id, course_id) values('HTML5', 'What is <br>?', '2019-07-04 17:49:24', 'NOT_ANSWERED', 1, 2);

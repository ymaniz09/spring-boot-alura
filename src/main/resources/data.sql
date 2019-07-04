INSERT INTO USER(name, email, password) VALUES('Student', 'student@gmail.com', '123456');

INSERT INTO COURSE(name, category) VALUES('Spring Boot', 'Back-end');
INSERT INTO COURSE(name, category) VALUES('HTML5', 'Front-end');

INSERT INTO TOPIC(title, message, created_date, topic_status, author_id, course_id) VALUES('Help', 'Error creating project', '2019-07-04 17:49:24', 'NOT_ANSWERED', 1, 1);
INSERT INTO TOPIC(title, message, created_date, topic_status, author_id, course_id) VALUES('Compiling error', 'Error creating bean with name entityManagerFactory defined in class path resource', '2019-07-04 17:49:24', 'NOT_ANSWERED', 1, 1);
INSERT INTO TOPIC(title, message, created_date, topic_status, author_id, course_id) VALUES('HTML5', 'What is <br>?', '2019-07-04 17:49:24', 'NOT_ANSWERED', 1, 1);

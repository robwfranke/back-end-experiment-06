
INSERT INTO users (username, password, enabled) VALUES ('user', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('admin', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO users (username, password, enabled) VALUES ('peter', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);

INSERT INTO authorities (username, authority) VALUES ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('peter', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('peter', 'ROLE_ADMIN');


INSERT INTO customers (customername, street,city, postal_code,email, tel_number,password, enabled) VALUES ('klant nr 1', 'hazenpad 1','Rotterdam', '1234AN', 'klant1@klant','0612345','$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO customers (customername, street,city, postal_code,email, tel_number,password, enabled) VALUES ('klant nr 2', 'konijn 1','Amsterdam', '5378AN', 'klant2@klant','0636545','$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO customers (customername, street,city, postal_code,email, tel_number,password, enabled) VALUES ('klant nr 3', 'paard 1','Rotterdam', '1357AN', 'klant3@klant','069684345','$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);
INSERT INTO customers (customername, street,city, postal_code,email, tel_number,password, enabled) VALUES ('klant nr 4', 'koe 1','Amsterdam', '7913AN', 'klant4@klant','089745','$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);




INSERT INTO orders (orderdate, status, customer_id) VALUES ('order1', 'open','2');
INSERT INTO orders (orderdate, status, customer_id) VALUES ('order2', 'open','2');
INSERT INTO orders (orderdate, status, customer_id) VALUES ('order3', 'pending','2');
INSERT INTO orders (orderdate, status, customer_id) VALUES ('order4', 'closed','1');


INSERT INTO order_lines (dwg_number, quantity,order_id) VALUES ('1001', '10','2');
INSERT INTO order_lines (dwg_number, quantity,order_id) VALUES ('2001', '1','1');
INSERT INTO order_lines (dwg_number, quantity,order_id) VALUES ('3001', '3','2');
INSERT INTO order_lines (dwg_number, quantity,order_id) VALUES ('4001', '3','2');


INSERT INTO jobs (job_name, department) VALUES ('voordraaien', 'draai afdeling');
INSERT INTO jobs (job_name, department) VALUES ('nadraaien', 'draai afdeling');
INSERT INTO jobs (job_name, department) VALUES ('voorfrezen', 'frees afdeling');
INSERT INTO jobs (job_name, department) VALUES ('nafrezen', 'frees afdeling');
INSERT INTO jobs (job_name, department) VALUES ('slijpen', 'slijp afdeling');


INSERT INTO couple_orderline_jobs (order_line_id, jobs_id) VALUES ('1', '1');
INSERT INTO couple_orderline_jobs (order_line_id, jobs_id) VALUES ('1', '2');
INSERT INTO couple_orderline_jobs (order_line_id, jobs_id) VALUES ('1', '3');
INSERT INTO couple_orderline_jobs (order_line_id, jobs_id) VALUES ('1', '4');

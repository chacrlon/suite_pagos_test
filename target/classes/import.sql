/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Andrés', 'Guzmán', 'profesor@bolsadeideas.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Mr. John', 'Doe', 'john.doe@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Linus', 'Torvalds', 'linus.torvalds@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

/* Creamos algunos usuarios con sus roles */

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');
INSERT INTO `roles` (nombre) VALUES ('THIS P');

INSERT INTO `role` (role_id, role_name, role_description, createdat, modifiedat) VALUES(1, 'Admin', 'Usuario autorizado para realizar todas las operaciones', sysdate(), sysdate());
INSERT INTO `role` (role_id, role_name, role_description, createdat, modifiedat) VALUES(2, 'Usuario de Vueltos', 'Usuario solo para dar vueltos', sysdate(), sysdate());

INSERT INTO `operation` (name) VALUES ('ROLE_USER');
INSERT INTO `operation` (name) VALUES ('ROLE_ADMIN');
INSERT INTO `operation` (name) VALUES ('ROLE_P2P');

INSERT INTO `role_operation` (role_id, operation_id) VALUES (1, 1);
INSERT INTO `role_operation` (role_id, operation_id) VALUES (1, 2);
INSERT INTO `role_operation` (role_id, operation_id) VALUES (1, 3);
INSERT INTO `role_operation` (role_id, operation_id) VALUES (3, 2);

INSERT INTO `business` (business_id, rif, business_name, mail_business, createdat, modifiedat) VALUES (1, '12345678', 'CHARCLONRAMON', 'chacr@gmail.com', sysdate(), sysdate());

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, role_id) VALUES ('andres','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Andres', 'Guzman','profesor@bolsadeideas.com', 1);
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email, role_id) VALUES ('caroman','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Chacrlon', 'Roman','chacrlon@gmail.com', 3);

INSERT INTO `phone_code` (phoneid, phonecode) VALUES (1, 58);
INSERT INTO `identification_code` (identificationid, identificationcode, identificationdescription) VALUES (1, 'V', 'Venezolano');
INSERT INTO `bank` (bankid, bankcode, bankname) VALUES (1, '0102', 'Venezuela');

INSERT INTO `p2p` (p2pid, phoneid, phone, identificationid, identification, name, amount, createdat, bankid, userid) VALUES (1, 1, 424, 1, 24286543, 'pablo', '550', sysdate(), 1, 1);

INSERT INTO `producto` (`id`, `model`, `name`, `description`) VALUES (NULL, 'asas', 'asasas', 'asasasas');
INSERT INTO `producto` (name, model, description) VALUES ('Televisor', 'Panasonic', 'Para ver las peliculas');




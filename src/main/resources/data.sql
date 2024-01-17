/*
 data.sql
 ---------------------------------------------------------------------------------------------------------
 Jdbc REST API Demo App - MariaDB/MySQL - Adding initial data (records) to tables  
 (C)opyright Panos Zafeiropoulos - 2024
 ---------------------------------------------------------------------------------------------------------

 Last update: 240116 - PZ
 ---------------------------------------------------------------------------------------------------------

*/


-- ----------------------------
-- Data for Table users
-- ----------------------------
BEGIN;
INSERT INTO `users` (`username`, `password`, `email`, `enabled`) VALUES ('admin', '$2a$10$zoWkCXDeBI5lxhvKoYvRd.RFWOGjjgqBJQn.LqvI/OgWGgah6V1lO', 'admin@genmail.com', 1);
INSERT INTO `users` (`username`, `password`, `email`, `enabled`) VALUES ('peter', '$2a$10$m5Wbo8aHjZsZiUeay7P1puMgqIe9o42Qfp0o.rawyx6Nj6Og4VIgS', 'peter@genmail.com', 1);
INSERT INTO `users` (`username`, `password`, `email`, `enabled`) VALUES ('user', '$2a$10$ISt1DLbT3OmNLmuQ82ov7.MyhJSrWwTxspcfGI82JF8nJGzaAWKlC', 'user@usermail.com',  1);
COMMIT;

-- ----------------------------
-- Data for Table authorities
-- ----------------------------
BEGIN;
INSERT INTO authorities (username, authority, role) values ('user', 'ROLE_USER', 'USER');
INSERT INTO authorities (username, authority, role) values ('admin', 'ROLE_USER', 'USER');
INSERT INTO authorities (username, authority, role)values ('admin', 'ROLE_ADMIN', 'ADMIN');
COMMIT;



-- ----------------------------
-- Data for Table items
-- ----------------------------

BEGIN;
INSERT INTO `items` (`itemName`,`itemModelYear`,`itemListPrice`) VALUES ('Wooden Pencil',1998, 0.50);
INSERT INTO `items` (`itemName`,`itemModelYear`,`itemListPrice`) VALUES ('Basic Notebook',2005, 1.50);
INSERT INTO `items` (`itemName`,`itemModelYear`,`itemListPrice`) VALUES ('Silica Eraser',2007, 0.25);
INSERT INTO `items` (`itemName`,`itemModelYear`,`itemListPrice`) VALUES ('Soft Polymer Eraser',2020, 0.35);
INSERT INTO `items` (`itemName`,`itemModelYear`,`itemListPrice`) VALUES ('Soft Ballpoint Pen',2019, 1.25);
INSERT INTO `items` (`itemName`,`itemModelYear`,`itemListPrice`) VALUES ('Paper Dossier',2019, 2.50);
COMMIT;


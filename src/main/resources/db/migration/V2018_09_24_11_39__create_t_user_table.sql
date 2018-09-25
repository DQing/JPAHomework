CREATE TABLE t_user(
  id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name varchar (255) NOT NULL UNIQUE KEY ,
  telephoneNumber varchar (255) NOT NULL UNIQUE KEY ,
  age varchar (255) NOT NULL
);
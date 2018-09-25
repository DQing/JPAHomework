CREATE TABLE t_role(
  id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  code varchar (10) UNIQUE key,
  name varchar (10)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

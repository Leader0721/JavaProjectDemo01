CREATE database netstore;
use netstore;
CREATE  TABLE categorys(
  id varchar(100) PRIMARY KEY,
  name VARCHAR (100) NOT NULL UNIQUE ,
  description VARCHAR (255)
);
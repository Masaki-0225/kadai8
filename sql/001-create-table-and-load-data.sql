DROP TABLE IF EXISTS movies;

CREATE TABLE members (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  nickname VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO members (name, nickname) VALUES ("宮舘涼太", "舘様");
INSERT INTO members (name, nickname) VALUES ("佐久間大介", "さっくん");

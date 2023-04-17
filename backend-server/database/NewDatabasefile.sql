BEGIN TRANSACTION;

DROP TABLE IF EXISTS new_user, user_account, movie, favorite_list;
DROP SEQUENCE IF EXISTS  seq_movie_id;


CREATE TABLE account (
	account_id serial NOT NULL,
	user_id int NOT NULL,
	username varchar(50) UNIQUE NOT NULL,
	email_address varchar(50) UNIQUE NOT NULL,
	CONSTRAINT PK_account PRIMARY KEY (account_id),
	CONSTRAINT FK_account_user_id FOREIGN KEY (user_id) REFERENCES users (user_id)
);

CREATE TABLE movie (
	movie_id serial NOT NULL,
	title varchar(200) NOT NULL,
	release_date date NOT NULL,
	overview varchar(1000) NOT NULL,
	genre varchar(50) NOT NULL,
	adult_only boolean NOT NULL,
	popularity int NOT NULL,

	CONSTRAINT PK_movie PRIMARY KEY (movie_id)
);
CREATE SEQUENCE seq_movie_id
  INCREMENT BY 1
  START WITH 2001
  NO MAXVALUE;


CREATE TABLE favorite_list (
	favorite_id serial NOT NULL,
	account_id int NOT NULL,
	movie_id int NOT NULL DEFAULT nextval('seq_movie_id'),
	CONSTRAINT PK_favorite_list PRIMARY KEY (favorite_id),
	CONSTRAINT FK_favorite_list_account_id FOREIGN KEY (account_id) REFERENCES account (account_id),
	CONSTRAINT FK_favorite_list_movie_id FOREIGN KEY (movie_id) REFERENCES movie (movie_id)
);


COMMIT;

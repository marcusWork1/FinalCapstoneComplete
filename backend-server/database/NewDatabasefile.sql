BEGIN TRANSACTION;

DROP TABLE IF EXISTS account, favorite_list, movie;
DROP SEQUENCE IF EXISTS  seq_movie_id;


CREATE TABLE account (
	account_id serial NOT NULL,
	user_id int NOT NULL,
	username varchar(50) ,
	email_address varchar(50) ,
	genre varchar(50),
	adult_only boolean,
	popularity int,
	CONSTRAINT PK_account PRIMARY KEY (account_id),
	CONSTRAINT FK_account_user_id FOREIGN KEY (user_id) REFERENCES users (user_id),
	CONSTRAINT FK_account_username FOREIGN KEY (username) REFERENCES users (username)
);

CREATE TABLE movie (
	movie_id serial NOT NULL,
	title varchar(200),
	release_date date,
	overview varchar(1000),
	genre varchar(50),
	adult_only boolean ,
	popularity int,

	CONSTRAINT PK_movie PRIMARY KEY (movie_id)
);



CREATE TABLE favorite_list (
	account_id int NOT NULL,
	movie_id int NOT NULL,
	CONSTRAINT FK_favorite_list_account_id FOREIGN KEY (account_id) REFERENCES account (account_id)
);


COMMIT;
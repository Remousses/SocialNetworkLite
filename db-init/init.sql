CREATE DATABASE social_network_lite;

USE social_network_lite;

CREATE TABLE user (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    pseudo VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    birth_date DATE NOT NULL,
    password VARCHAR(100) NOT NULL,
    active BOOLEAN DEFAULT 0,
    PRIMARY KEY (id)
);
INSERT INTO user (first_name, last_name, pseudo, email, country, birth_date, password)
VALUES 
	("Rémy", "Argentin", "Remousses", "remousses@gmail.com", "France", DATE("1997/09/17"), "test"),
	("Patoche", "La Brioche", "papate", "papate@gmail.com", "France", DATE("1998/04/13"), "test");

CREATE TABLE status (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    label VARCHAR(100) NOT NULL,
    parent_status_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (parent_status_id) REFERENCES status(id)
);
INSERT INTO status (name, label, parent_status_id)
VALUES 
	("LIKE", "like", NULL),
	("LOVE", "J'aime", 1),
	("DISLIKE", "Je n'aime pas", 1),
	("LOL", "Haha", 1);

CREATE TABLE post (
    id INT NOT NULL AUTO_INCREMENT,
    content TEXT NOT NULL,
    update_date TIMESTAMP NOT NULL,
    user_id INT NOT NULL,
    status_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (status_id) REFERENCES status(id)
);
INSERT INTO post (content, update_date, user_id, status_id)
VALUES 
	("Nouveau project en cours !", TIMESTAMP("2023/04/16 18:00:00"), 1, NULL);

CREATE TABLE comment (
    id INT NOT NULL AUTO_INCREMENT,
    comment TEXT NOT NULL,
    update_date TIMESTAMP NOT NULL,
    user_id INT NOT NULL,
    post_id INT NOT NULL,
    status_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (post_id) REFERENCES post(id),
    FOREIGN KEY (status_id) REFERENCES status(id)
);
INSERT INTO comment (comment, update_date, user_id, post_id, status_id)
VALUES 
	("Trop bien, bon courage ;)", TIMESTAMP("2023/04/16 18:01:00"), 2, 1, NULL);

CREATE TABLE friendship (
    user_id INT NOT NULL,
    user_id_friend INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (user_id_friend) REFERENCES user(id)
);
INSERT INTO friendship (user_id, user_id_friend)
VALUES 
	(1, 2),
	(2, 1);
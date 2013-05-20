DROP DATABASE IF EXISTS TheGoldenQuestion;

CREATE DATABASE TheGoldenQuestion;

USE TheGoldenQuestion;

CREATE TABLE question(
    id INT(2) PRIMARY KEY auto_increment,
    question VARCHAR(255),
    reponseV VARCHAR(100),
    reponseF1 VARCHAR(100),
    reponseF2 VARCHAR(100),
    reponseF3 VARCHAR(100)
);

CREATE TABLE player(
    id INT(2) PRIMARY KEY auto_increment,
    pseudo VARCHAR(20) UNIQUE,
    password VARCHAR(20) NOT NULL,
    meilleur_score INT(5)
);

INSERT INTO question VALUES (1, 'Quel est la capital de la France?', 'Paris', 'Tunis', 'Bordeaux', 'Marseille');
INSERT INTO question VALUES (2, 'Quelle est le moteur de recherche le plus utilisé dans le monde?', 'Google', 'Yahoo', 'DuckDuckGo', 'Lawij');

INSERT INTO player VALUES (1, 'hammiya','aaa' ,  0);
INSERT INTO player VALUES (2, 'soussou','aaa',  0);

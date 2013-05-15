DROP DATABASE TheGoldenQuestion;

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

CREATE TABLE joueur(
    id INT(2) PRIMARY KEY auto_increment,
    pseudo VARCHAR(20),
    meilleur_score INT(5)
);

INSERT INTO question VALUES (1, 'Quel est la capital de la France?', 'Paris', 'Tunis', 'Bordeaux', 'Marseille');
INSERT INTO question VALUES (2, 'Quelle est le moteur de recherche le plus utilisé dans le monde?', 'Google', 'Yahoo', 'DuckDuckGo', 'Lawij');

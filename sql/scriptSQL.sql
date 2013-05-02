DROP DATABASE TheGoldenQuestion;
CREATE DATABASE TheGoldenQuestion;
CREATE TABLE TheGoldenQuestion.question(
id INT(2) PRIMARY KEY auto_increment,
question VARCHAR(180),
reponseV VARCHAR(100),
reponseF1 VARCHAR(100),
reponseF2 VARCHAR(100),
reponseF3 VARCHAR(100)
);
CREATE TABLE TheGoldenQuestion.jouer(
id INT(2) PRIMARY KEY auto_increment,
pseudo VARCHAR(20),
meilleur_score INT(5)
);

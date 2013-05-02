drop database TheGoldenQuestion;
create database TheGoldenQuestion;
create table TheGoldenQuestion.question(
id int(2) primary key auto_increment,
question varchar(180),
reponseV varchar(100),
reponseF1 varchar(100),
reponseF2 varchar(100),
reponseF3 varchar(100)
);
create table TheGoldenQuestion.jouer(
id int(2) primary key auto_increment,
pseudo varchar(20),
meilleur_score int(5)
);

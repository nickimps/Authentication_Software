#Dont use DROP the first time
DROP DATABASE AuthenticationSystem;
CREATE DATABASE AuthenticationSystem;
USE AuthenticationSystem;

CREATE TABLE Account (
    username CHAR(40),
    password CHAR(40),
    BestiesNameTextField CHAR(40),
    CelebCrushTextField CHAR(40),
    ChildhoodHeroTextField CHAR(40),
    CityBornTextField CHAR(40),
    DreamJobTextField CHAR(40),
    FatherFirstNameTextField CHAR(40),
    FavBookTextField CHAR(40),
    FavColourTextField CHAR(40),
    FavFoodTextField CHAR(40),
    FavMovieTextField CHAR(40),
    FavTypeMusicTextField CHAR(40),
    FirstLiveStreetTextField CHAR(40),
    FirstPetTextField CHAR(40),
    HighschoolTextField CHAR(40),
    MakeFirstCarTextField CHAR(40),
    MothersMaidenNameTextField CHAR(40),
    NaturalHairColourTextField CHAR(40),
    VacaySpotTextField CHAR(40),
    seed INTEGER,
    PRIMARY KEY(username)
);

INSERT INTO Account VALUES ('test', 'test', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 'NA', 1);

SELECT * FROM Account;
SELECT seed FROM Account WHERE username = 'nick';

SELECT FavFoodTextField, DreamJobTextField FROM Account WHERE username = 'nick';
UPDATE Account  SET seed = 6 WHERE username = 'nick';

SELECT password FROM Account WHERE username = 'test';
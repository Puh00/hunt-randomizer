DROP SCHEMA public CASCADE;
CREATE SCHEMA public;

CREATE TABLE Weapons (
    name VARCHAR(100) PRIMARY KEY,
    size INTEGER NOT NULL,
    price INTEGER NOT NULL,
    unlock_level INTEGER NOT NULL
);

CREATE TABLE Tools (
    name VARCHAR(100) PRIMARY KEY,
    price INTEGER NOT NULL,
    unlock_level INTEGER NOT NULL
);

CREATE TABLE Consumables (
    name VARCHAR(100) PRIMARY KEY,
    price INTEGER NOT NULL,
    unlock_level INTEGER NOT NULL
);

CREATE VIEW RandomWeapon AS (
    SELECT * FROM Weapons
    ORDER BY RANDOM()
    LIMIT 1
);

CREATE VIEW RandomLargeWeapon AS (
    SELECT * FROM Weapons
    WHERE size = 3
    ORDER BY RANDOM()
    LIMIT 1
);

CREATE VIEW RandomMediumWeapon AS (
    SELECT * FROM Weapons
    WHERE size = 2
    ORDER BY RANDOM()
    LIMIT 1
);

CREATE VIEW RandomSmallWeapon AS (
    SELECT * FROM Weapons
    WHERE size = 1
    ORDER BY RANDOM()
    LIMIT 1
);

CREATE VIEW RandomMediumSmallWeapon AS (
    SELECT * FROM Weapons
    WHERE size <= 2
    ORDER BY RANDOM()
    LIMIT 1
);

CREATE VIEW FourRandomTools AS (
    SELECT * FROM Tools
    ORDER BY RANDOM()
    LIMIT 4
);

CREATE VIEW RandomConsumable AS (
    SELECT * FROM Consumables
    ORDER BY RANDOM()
    LIMIT 1
);

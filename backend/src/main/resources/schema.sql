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

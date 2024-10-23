CREATE DATABASE SeatSite;

USE SeatSite;

CREATE TABLE Persona (
    id INT IDENTITY(1,1) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    lastName VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(8) NOT NULL
);

CREATE TABLE Admin (
    id INT PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES Persona(id)
);

CREATE TABLE Client (
    id INT PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES Persona(id)
);

CREATE TABLE Seat (
    id VARCHAR(10) PRIMARY KEY,
    precio FLOAT,
    estado VARCHAR(10) CHECK (estado IN ('AVAILABLE', 'RESERVED'))
);

CREATE TABLE Reserva (
    id INT IDENTITY(1,1) PRIMARY KEY,
    clientId INT,
    seatId VARCHAR(50),
    FOREIGN KEY (clientId) REFERENCES Client(id),
    FOREIGN KEY (seatId) REFERENCES Seat(id)
);
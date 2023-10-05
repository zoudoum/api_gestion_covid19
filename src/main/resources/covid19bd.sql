CREATE DATABASE IF NOT EXISTS GestionCovid;
USE GestionCovid;

-- Create the Patient table
CREATE TABLE IF NOT EXISTS Patient (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL,
    adresse VARCHAR(255),
    numeroDeTelephone VARCHAR(20)
);

-- Create the StructureDeSante table
CREATE TABLE IF NOT EXISTS StructureDeSante (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    adresse VARCHAR(255),
    contact VARCHAR(20),
    quantiteDisponibleTest INT,
    quantiteDisponibleVaccin INT
);

-- Create the RendezVous table
CREATE TABLE IF NOT EXISTS RendezVous (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT,
    structure_id INT,
    dateHeure DATETIME,
    typeRendezVous VARCHAR(50),
    FOREIGN KEY (patient_id) REFERENCES Patient(id),
    FOREIGN KEY (structure_id) REFERENCES StructureDeSante(id)
);
CREATE TABLE CentreTest (
    id INT AUTO_INCREMENT PRIMARY KEY,
    structure_id INT,
    disponibilite VARCHAR(255),
    capaciteTests INT,
    contact VARCHAR(255),
    FOREIGN KEY (structure_id) REFERENCES StructureDeSante(id)
);
CREATE TABLE CentreVaccination (
    id INT AUTO_INCREMENT PRIMARY KEY,
    structure_id INT,
    disponibilite VARCHAR(255),
    capaciteVaccins INT,
    contact VARCHAR(255),
    FOREIGN KEY (structure_id) REFERENCES StructureDeSante(id)
);
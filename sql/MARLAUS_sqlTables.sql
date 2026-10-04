//Création des TABLES    
    
    
CREATE TABLE EQUIPES (
    idEquipe VARCHAR(50) PRIMARY KEY,
    nomEquipe VARCHAR(50),
    tauxRemise DECIMAL(4,2)
);

CREATE TABLE PIERRES (
    idPierre VARCHAR(50) PRIMARY KEY,
    nomPierre VARCHAR(50)
);

CREATE TABLE CATEGORIES (
    nomCategorie VARCHAR(50) PRIMARY KEY
);

CREATE TABLE PAIEMENT (
    idPaiement VARCHAR(50) PRIMARY KEY,
    datePaiement DATE,
    montant DECIMAL(10,2),
    modePaiement VARCHAR(50)
);

CREATE TABLE TAILLE (
    idTaille VARCHAR(4) PRIMARY KEY
);

CREATE TABLE ZONES_VESTIAIRE (
    idZone VARCHAR(20) PRIMARY KEY
);

CREATE TABLE COULEUR (
    idCouleur VARCHAR(50) PRIMARY KEY
);

CREATE TABLE NIVEAU_PERSONNALISATION (
    idNiveau VARCHAR(50) PRIMARY KEY
);

CREATE TABLE LIVRAISON (
    idLivraison VARCHAR(50) PRIMARY KEY,
    numSuivi VARCHAR(50),
    fraisLivraison DECIMAL(10,2),
    etat VARCHAR(50),
    dateLivraison DATE,
    adresseLivraison VARCHAR(100)
);

// TABLES + IMPORTANTES : 
CREATE TABLE CLIENTS (
    idClient VARCHAR(50) PRIMARY KEY,
    nomClient VARCHAR(50),
    prenomClient VARCHAR(50),
    adresseClient VARCHAR(100),
    telephoneClient VARCHAR(20),
    idEquipe VARCHAR(50),
    FOREIGN KEY (idEquipe) REFERENCES EQUIPES(idEquipe)
);

CREATE TABLE VESTIAIRES (
    idVestiaire VARCHAR(50) PRIMARY KEY,
    nomVestiaire VARCHAR(50),
    reference VARCHAR(50),
    idTaille VARCHAR(4),
    nomCategorie VARCHAR(50),
    FOREIGN KEY (idTaille) REFERENCES TAILLE(idTaille),
    FOREIGN KEY (nomCategorie) REFERENCES CATEGORIES(nomCategorie)
);

CREATE TABLE COMMANDES (
    idCommande VARCHAR(50) PRIMARY KEY,
    dateCommande DATE,
    etat VARCHAR(20),
    montantTotalSansRemise DECIMAL(10,2),
    montantApresRemise DECIMAL(10,2),
    idClient VARCHAR(50),
    FOREIGN KEY (idClient) REFERENCES CLIENTS(idClient)
);

//Tables réliées 
CREATE TABLE INCLURE (
    idVestiaire VARCHAR(50),
    idCommande VARCHAR(50),
    PRIMARY KEY (idVestiaire, idCommande),
    FOREIGN KEY (idVestiaire) REFERENCES VESTIAIRES(idVestiaire),
    FOREIGN KEY (idCommande) REFERENCES COMMANDES(idCommande)
);

CREATE TABLE DECORER (
    idPierre VARCHAR(50),
    idNiveau VARCHAR(50),
    idZone VARCHAR(20),
    quantite_Kg DECIMAL(10,2),
    PRIMARY KEY (idPierre, idNiveau, idZone),
    FOREIGN KEY (idPierre) REFERENCES PIERRES(idPierre),
    FOREIGN KEY (idNiveau) REFERENCES NIVEAU_PERSONNALISATION(idNiveau),
    FOREIGN KEY (idZone) REFERENCES ZONES_VESTIAIRE(idZone)
);

CREATE TABLE MODE (
    idCommande VARCHAR(50),
    idPaiement VARCHAR(50),
    PRIMARY KEY (idCommande, idPaiement),
    FOREIGN KEY (idCommande) REFERENCES COMMANDES(idCommande),
    FOREIGN KEY (idPaiement) REFERENCES PAIEMENT(idPaiement)
);

CREATE TABLE AVOIR (
    idVestiaire VARCHAR(50),
    idCouleur VARCHAR(50),
    PRIMARY KEY (idVestiaire, idCouleur),
    FOREIGN KEY (idVestiaire) REFERENCES VESTIAIRES(idVestiaire),
    FOREIGN KEY (idCouleur) REFERENCES COULEUR(idCouleur)
);

CREATE TABLE PERMETTRE (
    idVestiaire VARCHAR(50),
    idNiveau VARCHAR(50),
    PRIMARY KEY (idVestiaire, idNiveau),
    FOREIGN KEY (idVestiaire) REFERENCES VESTIAIRES(idVestiaire),
    FOREIGN KEY (idNiveau) REFERENCES NIVEAU_PERSONNALISATION(idNiveau)
);

CREATE TABLE EXPEDIER (
    idCommande VARCHAR(50),
    idLivraison VARCHAR(50),
    PRIMARY KEY (idCommande, idLivraison),
    FOREIGN KEY (idCommande) REFERENCES COMMANDES(idCommande),
    FOREIGN KEY (idLivraison) REFERENCES LIVRAISON(idLivraison)
);


CREATE USER culture WITH PASSWORD 'culture';
ALTER USER Culture WITH SUPERUSER; 

CREATE DATABASE culture;
\c culture;

CREATE TABLE Utilisateur(
    id_Utilisateur Serial Primary Key,
    Prenom Varchar,
    Email Varchar,
    Mdp Varchar,
    isAdmin int
);

CREATE TABLE Culture(
    id_Culture Serial Primary Key,
    Nom Varchar,
    Prix int
);

CREATE TABLE Terrain(
    id_Terrain Serial Primary Key,
    Description Varchar,
    Localisation Varchar,
    Nb_Parcelle int,
    id_Utilisateur int,
    Validation int,
    FOREIGN KEY (id_Utilisateur) REFERENCES Utilisateur(id_Utilisateur)
);

CREATE TABLE Photo_Terrain(
    id_Photo_Terrain Serial Primary Key,
    id_Terrain int,
    img Varchar,
    FOREIGN KEY (id_Terrain) REFERENCES Terrain(id_Terrain)
);

CREATE TABLE Parcelle(
    id_Parcelle Serial Primary Key,
    id_Terrain int,
    rendement numeric,
    largeur numeric,
    longueur numeric,
    FOREIGN KEY(id_Terrain) REFERENCES Terrain(id_Terrain)
);

CREATE TABLE Culture_Parcelle(
    id_Culture_Parcelle Serial Primary Key,
    id_Parcelle int,
    id_Culture int,
    FOREIGN KEY(id_Parcelle) REFERENCES Parcelle(id_Parcelle),
    FOREIGN KEY(id_Culture) REFERENCES Culture(id_Culture)
);

CREATE TABLE Simulation(
    id_Simulation Serial Primary Key,
    id_Culture_Parcelle int,
    Date timestamp,
    FOREIGN KEY(id_Culture_Parcelle) REFERENCES Culture_Parcelle(id_Culture_Parcelle)
);

INSERT INTO Utilisateur(Prenom,Email,Mdp,isAdmin) VALUES ('Jack Daniels','Jack@gmail.com','J1',1);
INSERT INTO Utilisateur(Prenom,Email,Mdp,isAdmin) VALUES ('John Peters','John@gmail.com','JP1',0);
INSERT INTO Utilisateur(Prenom,Email,Mdp,isAdmin) VALUES ('Johnny Walker','Walker@gmail.com','JW1',0);
INSERT INTO Utilisateur(Prenom,Email,Mdp,isAdmin) VALUES ('Dalmore','Dalmore@gmail.com','D1',0);

INSERT INTO Culture(Nom,Prix) VALUES ('Maïs',5000);
INSERT INTO Culture(Nom,Prix) VALUES ('Tomates',3000);
INSERT INTO Culture(Nom,Prix) VALUES ('Riz',1000);
INSERT INTO Culture(Nom,Prix) VALUES ('Salade',2400);
INSERT INTO Culture(Nom,Prix) VALUES ('Carottes',1600);

INSERT INTO Terrain(Description,Localisation,Nb_Parcelle,id_Utilisateur,Validation) VALUES ('Le terrain est exposé à une abondance de lumière solaire directe, avec une orientation optimale pour favoriser la croissance des cultures','Terrain en zone urbaine situé Alasora',3,2,1);
INSERT INTO Terrain(Description,Localisation,Nb_Parcelle,id_Utilisateur,Validation) VALUES ('Le terrain étendu sur plusieurs hectares, offrant une topographie variée.Le sol est principalement composé de limon argileux, offrant une bonne rétention d eau tout en permettant un drainage adéquat.','Terrain en zone rurale sis à Ivato',5,3,2);
INSERT INTO Terrain(Description,Localisation,Nb_Parcelle,id_Utilisateur,Validation) VALUES ('Des sources d eau naturelles, comme des rivières ou des puits, peuvent également être présentes pour assurer une alimentation en eau fiable.','Situé à By Pass',4,4,1);

INSERT INTO Photo_Terrain(id_Terrain,img) VALUES (1,'');
INSERT INTO Photo_Terrain(id_Terrain,img) VALUES (2,'');
INSERT INTO Photo_Terrain(id_Terrain,img) VALUES (3,'');

INSERT INTO Parcelle(id_Terrain,rendement,largeur,longueur) VALUES (1,500,1000,2500);
INSERT INTO Parcelle(id_Terrain,rendement,largeur,longueur) VALUES (2,800,1500,2000);
INSERT INTO Parcelle(id_Terrain,rendement,largeur,longueur) VALUES (1,150,800,500);
INSERT INTO Parcelle(id_Terrain,rendement,largeur,longueur) VALUES (3,600,1200,2500);
INSERT INTO Parcelle(id_Terrain,rendement,largeur,longueur) VALUES (2,1000,2000,3000);
INSERT INTO Parcelle(id_Terrain,rendement,largeur,longueur) VALUES (3,350,950,1000);

INSERT INTO Culture_Parcelle(id_Parcelle,id_Culture) VALUES (1,1);
INSERT INTO Culture_Parcelle(id_Parcelle,id_Culture) VALUES (2,2);
INSERT INTO Culture_Parcelle(id_Parcelle,id_Culture) VALUES (3,3);
INSERT INTO Culture_Parcelle(id_Parcelle,id_Culture) VALUES (4,4);
INSERT INTO Culture_Parcelle(id_Parcelle,id_Culture) VALUES (5,5);
INSERT INTO Culture_Parcelle(id_Parcelle,id_Culture) VALUES (6,3);

INSERT INTO Simulation(id_Culture_Parcelle,Date) VALUES (3,'2023-12-30');
INSERT INTO Simulation(id_Culture_Parcelle,Date) VALUES (2,'2024-01-10');
INSERT INTO Simulation(id_Culture_Parcelle,Date) VALUES (3,'2024-01-10');
INSERT INTO Simulation(id_Culture_Parcelle,Date) VALUES (4,'2024-01-10');
INSERT INTO Simulation(id_Culture_Parcelle,Date) VALUES (5,'2024-01-22');
INSERT INTO Simulation(id_Culture_Parcelle,Date) VALUES (6,'2024-01-25');
    
CREATE VIEW v_terrain_culture AS
SELECT 
    T.id_Terrain, 
    T.Description AS Terrain_Description, 
    T.Localisation AS Terrain_Localisation, 
    T.Nb_Parcelle AS Terrain_Nb_Parcelle, 
    U.id_Utilisateur, 
    U.Prenom AS Utilisateur_Prenom, 
    U.Email AS Utilisateur_Email, 
    P.id_Photo_Terrain, 
    P.img AS Photo_Terrain_img, 
    PC.id_Parcelle, 
    PC.rendement , 
    PC.largeur , 
    PC.longueur ,
    C.id_Culture, 
    C.Nom AS Culture_Nom, 
    C.Prix AS Culture_Prix,
    CP.id_Culture_Parcelle, 
    S.id_Simulation, 
    S.Date AS Simulation_Date
FROM 
    Terrain T
    LEFT JOIN Utilisateur U ON T.id_Utilisateur = U.id_Utilisateur
    LEFT JOIN Photo_Terrain P ON T.id_Terrain = P.id_Terrain
    LEFT JOIN Parcelle PC ON T.id_Terrain = PC.id_Terrain
    LEFT JOIN Culture_Parcelle CP ON PC.id_Parcelle = CP.id_Parcelle
    LEFT JOIN Culture C ON CP.id_Culture = C.id_Culture
    LEFT JOIN Simulation S ON CP.id_Culture_Parcelle = S.id_Culture_Parcelle
WHERE 
    T.Validation = 1 ;
    
    


CREATE VIEW v_terrain AS
SELECT 
    id_Terrain, 
    Description ,
    Localisation ,
    Nb_Parcelle ,
    id_Utilisateur
FROM 
    Terrain 
WHERE 
    Validation = 1 ;

    update Parcelle set rendement = 500.0, largeur = 1000.0, longueur = 2500.0 where id_Parcelle = 1;
    update Parcelle set rendement = 800.0 , largeur = 1500.0, longueur = 2000.0 where id_Parcelle = 2;
    update Parcelle set rendement = 150.0 , largeur = 800.0, longueur = 500.0 where id_Parcelle = 3;
    update Parcelle set rendement = 600.0 , largeur = 1200.0, longueur = 2500.0 where id_Parcelle = 4;
    update Parcelle set rendement = 1000.0 , largeur = 2000.0, longueur = 3000.0 where id_Parcelle = 5;
    update Parcelle set rendement = 350.0 , largeur = 950.0, longueur = 1000.0 where id_Parcelle = 6;

    update Parcelle set rendement = 500, largeur = 1000, longueur = 2500 where id_Parcelle = 1;
    update Parcelle set rendement = 800 , largeur = 1500, longueur = 2000 where id_Parcelle = 2;
    update Parcelle set rendement = 150, largeur = 800, longueur = 500 where id_Parcelle = 3;
    update Parcelle set rendement = 600, largeur = 1200, longueur = 2500 where id_Parcelle = 4;
    update Parcelle set rendement = 1000, largeur = 2000, longueur = 3000 where id_Parcelle = 5;
    update Parcelle set rendement = 350, largeur = 950, longueur = 1000 where id_Parcelle = 6;

ALTER TABLE Parcelle ALTER COLUMN largeur TYPE decimal;
ALTER TABLE Parcelle ALTER COLUMN longueur TYPE decimal;
ALTER TABLE Parcelle ALTER COLUMN rendement TYPE decimal;


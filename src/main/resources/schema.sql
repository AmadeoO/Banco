DROP TABLE IF EXISTS Banco;

CREATE TABLE Banco(
    id_banco varchar(64),
    nombre varchar(200),
    pais varchar(30),
    domicilio varchar(200),
    PRIMARY KEY(id_banco)
)

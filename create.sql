DROP TABLE ODONTOLOGOS IF EXISTS;

CREATE TABLE ODONTOLOGOS(
ID INT AUTO_INCREMENT PRIMARY KEY,
MATRICULA INT NOT NULL,
NOMBRE VARCHAR(50) NOT NULL,
APELLIDO VARCHAR(50) NOT NULL
);

INSERT INTO ODONTOLOGOS VALUES (DEFAULT, 23454, 'LUCIA', 'CERPA');
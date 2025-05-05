#BASE DE DATOS DEL PROYECTO SEGUNDO PARCIAL OCHOA, CLARK, ARELLANO
CREATE DATABASE IF NOT EXISTS paneles;
USE paneles;

-- Tabla actualizada
CREATE TABLE IF NOT EXISTS USUARIO (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NOMBRE_COMPLETO VARCHAR(100) NOT NULL,
    NOMBRE_USUARIO VARCHAR(50) NOT NULL UNIQUE,
    DIRECCION VARCHAR(100) NOT NULL,
    CORREO VARCHAR(100) NOT NULL UNIQUE,
    CONTRASEÑA VARCHAR(255) NOT NULL,
    ROL ENUM('cliente', 'admin') NOT NULL
);

-- Stored Procedure para crear un usuario
DELIMITER $$
CREATE PROCEDURE sp_CrearUsuario(
    IN p_nombre_completo VARCHAR(100),
    IN p_nombre_usuario VARCHAR(50),
    IN p_direccion VARCHAR(100),
    IN p_correo VARCHAR(100),
    IN p_contrasena VARCHAR(255),
    IN p_rol ENUM('cliente', 'admin')
)
BEGIN
    INSERT INTO USUARIO (NOMBRE_COMPLETO, NOMBRE_USUARIO, DIRECCION, CORREO, CONTRASEÑA, ROL)
    VALUES (p_nombre_completo, p_nombre_usuario, p_direccion, p_correo, p_contrasena, p_rol);
END $$
DELIMITER ;

#----LEER
DELIMITER //
CREATE PROCEDURE sp_ObtenerUsuario(
    IN p_ID INT
)
BEGIN
    SELECT * FROM USUARIO WHERE ID = p_ID;
END //
DELIMITER ;

DELIMITER $$
CREATE PROCEDURE sp_ActualizarUsuario(
    IN p_id INT,
    IN p_nombreCompleto VARCHAR(100),
    IN p_nombreUsuario VARCHAR(50),
    IN p_direccion VARCHAR(255),
    IN p_correo VARCHAR(100),
    IN p_rol ENUM('CLIENTE', 'ADMIN')
)
BEGIN
    UPDATE USUARIO
    SET nombreCompleto = p_nombreCompleto,
        nombreUsuario = p_nombreUsuario,
        direccion = p_direccion,
        correo = p_correo,
        rol = p_rol
    WHERE id = p_id;
END $$
DELIMITER ;

#----ELIMINAR
DELIMITER //
CREATE PROCEDURE sp_EliminarUsuario(
    IN p_ID INT
)
BEGIN
    DELETE FROM USUARIO WHERE ID = p_ID;
END //
DELIMITER ;
#------------------
# ----- Loggin
DELIMITER //
CREATE PROCEDURE SP_Loggin(
    IN p_Nombre VARCHAR(15)
)
BEGIN
    SELECT ID, CONTRASEÑA FROM USUARIO WHERE NOMBRE = p_Nombre;
END //
DELIMITER ;
#---------
DELIMITER $$
CREATE PROCEDURE sp_ObtenerUsuarioPorId(
    IN p_id INT
)
BEGIN
    SELECT * FROM USUARIO WHERE ID = p_id;
END $$

DELIMITER ;
#----------
DELIMITER $$
CREATE PROCEDURE sp_ObtenerRolPorId(IN p_id INT)
BEGIN
    SELECT ROL FROM USUARIO WHERE ID = p_id;
END  $$
DELIMITER ;

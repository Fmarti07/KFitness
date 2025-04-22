DROP DATABASE IF EXISTS kfit_db;
CREATE DATABASE kfit_db;
USE kfit_db;

-- Crear tabla usuarios
CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    telefono VARCHAR(15),
    direccion VARCHAR(250),
    clave VARCHAR(150) NOT NULL,
    rol VARCHAR(50) DEFAULT 'usuario',
    ruta_imagen VARCHAR(1024),
    activo BOOLEAN DEFAULT TRUE
);

-- Crear tabla categoría
CREATE TABLE categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    ruta_imagen VARCHAR(1024),
    activo BOOLEAN DEFAULT TRUE
);

-- Crear tabla productos
CREATE TABLE productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(150) NOT NULL,
    descripcion TEXT,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL,
    ruta_imagen VARCHAR(1024),
    activo BOOLEAN DEFAULT TRUE,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

-- Crear tabla clientes
CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    email VARCHAR(100),
    telefono VARCHAR(20),
    direccion VARCHAR(250),
    activo BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario)
);

-- Crear tabla ventas
CREATE TABLE ventas (
    id_venta INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    fecha DATETIME DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10, 2) NOT NULL,
    estado VARCHAR(20) DEFAULT 'Activa',
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

-- Crear tabla detalle_ventas
CREATE TABLE detalle_ventas (
    id_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_venta INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL,
    precio_unitario DECIMAL(10, 2) NOT NULL,
    subtotal DECIMAL(10, 2) AS (cantidad * precio_unitario) STORED,
    FOREIGN KEY (id_venta) REFERENCES ventas(id_venta),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

-- Insertar usuarios
INSERT INTO usuarios(nombre, apellido, email, telefono, direccion, clave, rol, ruta_imagen) VALUES
('Flor', 'Martínez', 'flor@example.com', '8888-1234', 'San José', 'Zoe070887*', 'admin', 'https://example.com/img/flor.jpg'),
('Carlos', 'López', 'carlos@example.com', '8899-5678', 'Heredia', 'clave123', 'usuario', 'https://example.com/img/carlos.jpg');

-- Insertar categorías
INSERT INTO categoria(nombre, descripcion, ruta_imagen) VALUES
('Suplementos', 'Vitaminas y proteínas', 'https://example.com/img/suplementos.jpg'),
('Ropa Deportiva', 'Indumentaria para entrenamiento', 'https://example.com/img/ropa.jpg');

-- Insertar productos
INSERT INTO productos(nombre, descripcion, precio, stock, ruta_imagen, id_categoria) VALUES
('Proteína Whey', 'Proteína para masa muscular', 19900, 50, 'https://example.com/img/proteina.jpg', 1),
('Camiseta DryFit', 'Camiseta cómoda y ligera', 9500, 30, 'https://example.com/img/camiseta.jpg', 2);

-- Insertar clientes
INSERT INTO clientes(nombre, apellido, email, telefono, direccion, id_usuario) VALUES
('Juan', 'Pérez', 'juanp@example.com', '8976-1234', 'Cartago', 1),
('Ana', 'Ruiz', 'ana.ruiz@gmail.com', '8877-4321', 'Alajuela', 2);

-- Consulta de prueba
SELECT * FROM categoria;
show tables;

USE kfit_db;

CREATE TABLE asesorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(150) NOT NULL,
    mensaje TEXT NOT NULL

);CREATE TABLE ejercicio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    descripcion TEXT,
    ruta_imagen VARCHAR(255)
);INSERT INTO ejercicio (titulo, descripcion, ruta_imagen) VALUES
('Entrenamiento Funcional', 'Ejercicios de cuerpo completo para mejorar fuerza y resistencia.', '/img/funcional.png'),
('Cardio Intenso', 'Mejora tu salud cardiovascular con sesiones de alta intensidad.', '/img/cardio.png'),
('Fuerza y Tonificación', 'Trabaja todos los grupos musculares con rutinas estructuradas.', '/img/fuerza.png');
CREATE TABLE citas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(150) NOT NULL,
    fecha DATE NOT NULL,
    tipo VARCHAR(50) NOT NULL
);CREATE TABLE servicios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    descripcion TEXT,
    ruta_imagen VARCHAR(255)
);
CREATE TABLE planes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    precio DOUBLE,
    duracion VARCHAR(50)
);INSERT INTO planes (nombre, descripcion, precio, duracion) VALUES
('Plan Básico', 'Acceso a rutinas y videos', 12000, '1 mes'),
('Plan Plus', 'Incluye asesoría personalizada', 20000, '1 mes'),
('Plan Premium', 'Ejercicios, nutrición y clases grupales', 35000, '2 meses');
show tables;
ALTER TABLE planes ADD COLUMN nombre_en VARCHAR(100);
ALTER TABLE planes ADD COLUMN descripcion_en TEXT;
ALTER TABLE planes ADD COLUMN duracion_en VARCHAR(50);
SELECT id, nombre FROM planes;
-- Desactiva modo seguro temporalmente
SET SQL_SAFE_UPDATES = 0;

-- Plan Básico
UPDATE planes
SET 
    nombre_en = 'Basic Plan',
    descripcion_en = 'Access to routines and videos',
    duracion_en = '1 month'
WHERE id = 1;

-- Plan Plus
UPDATE planes
SET 
    nombre_en = 'Plus Plan',
    descripcion_en = 'Includes personalized coaching',
    duracion_en = '1 month'
WHERE id = 2;

-- Plan Premium
UPDATE planes
SET 
    nombre_en = 'Premium Plan',
    descripcion_en = 'Exercise, nutrition, and group classes',
    duracion_en = '2 months'
WHERE id = 3;

-- Reactiva modo seguro
SET SQL_SAFE_UPDATES = 1;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_ventas
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'20','Cliente Frecuente','Conocida','1'),(2,'10','Elsie Fernanda Monzoy','Coordinación Sistemas','1'),(3,'30','Escuela Secundaria','Calle Palma','1'),(4,'40','Municipio','Palacio Municipal','1'),(5,'50','Basilio J. Rojas','Calle Reforma','1'),(6,'60','COBAO Pl. 27','Col. 20 de Noviembre','1'),(7,'70','Rosalba Loaeza Ramos','Calle 3 de Octubre','1');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `detalle_ventas`
--

LOCK TABLES `detalle_ventas` WRITE;
/*!40000 ALTER TABLE `detalle_ventas` DISABLE KEYS */;
INSERT INTO `detalle_ventas` VALUES (118,54,1,0,150),(119,55,1,2,150),(120,55,2,5,20),(121,55,5,2,1800),(122,55,1,2,150);
/*!40000 ALTER TABLE `detalle_ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Lapiz Ticonderoga',5,86,'1'),(2,'Libreta Scribe Sencilla',20,80,'1'),(3,'Resistol Liquido 100 ml',5,88,'1'),(4,'Resistol de Barra',10,50,'1'),(5,'Libreta Jean Book Profesional',40,43,'1'),(6,'Pistola de Silicon ',50,30,'1'),(7,'Papel Bond',2,100,'1'),(8,'Paquete Hojas Blancas con 500',80,20,'1'),(9,'Libreta Roka',15,50,'1'),(10,'Plumines Smart',35,20,'1'),(11,'Clip Gigante Mariposa',15,15,'1'),(12,'Clip Jumbo',30,10,'1'),(13,'Compas Metalico',5,100,'1'),(14,'Colores Bacoiris',32,12,'1'),(15,'Pintura Baco',8,25,'1'),(16,'Regla Plastico',5,30,'1'),(17,'Tabla AgarraPapel Madera',30,12,'1'),(18,'Tabla AgarraPapel Plastico',55,12,'1'),(19,'Transportador Plastico',8,25,'1'),(20,'Acuarelas Pelikan',10,20,'1'),(21,'Acuarelas Smart',8,20,'1'),(22,'Block Albanene 25H',35,20,'1'),(23,'Cartulina Sencilla Varios Colores',5,200,'1'),(24,'Cartulina Fluorescente Varios Colores',7,200,'1'),(25,'Cartulina Iris Varios Colores',10,100,'1'),(26,'Opalina Tamaño Carta Hoja',3,100,'1'),(27,'Opalina Tamaño Carta Paquete',80,5,'1'),(28,'Crayon Escolar Delgado Pelikan',10,12,'1'),(29,'Crayon Escolar Delgado Vividel',7,12,'1'),(30,'Crayon Escolar Triangular Smarty',20,12,'1'),(31,'Marcador Permanente Delgado Baco Varios Colores',10,20,'1'),(32,'Papel Albanene Hoja Tamaño Carta',8,150,'1');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `vendedor`
--

LOCK TABLES `vendedor` WRITE;
/*!40000 ALTER TABLE `vendedor` DISABLE KEYS */;
INSERT INTO `vendedor` VALUES (1,'100','Edgar Loaeza Ramos','9511133950','1','EdJo'),(2,'200','Benjamín Martínez','9882524500','1','BeMa'),(3,'300','Alberto Perez','5155555000','1','AlPe'),(4,'400','Carlos Loaeza','9513976385','1','Ca10');
/*!40000 ALTER TABLE `vendedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (54,1,1,'0000001','2020-06-15',200,'1'),(55,1,1,'0000002','2020-06-15',4300,'1');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-17 15:53:38

-- MariaDB dump 10.17  Distrib 10.4.12-MariaDB, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: master
-- ------------------------------------------------------
-- Server version	10.4.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `regioni`
--

DROP TABLE IF EXISTS `regioni`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regioni` (
  `id` int(11) unsigned NOT NULL,
  `nome` text NOT NULL,
  `latitudine` decimal(9,6) NOT NULL,
  `longitudine` decimal(9,6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regioni`
--

LOCK TABLES `regioni` WRITE;
/*!40000 ALTER TABLE `regioni` DISABLE KEYS */;
INSERT INTO `regioni` VALUES (1,'Piemonte',45.066667,7.700000);
INSERT INTO `regioni` VALUES (2,'Valle d\'Aosta/Vallée d\'Aoste',45.737222,7.320556);
INSERT INTO `regioni` VALUES (3,'Lombardia',45.464161,9.190336);
INSERT INTO `regioni` VALUES (4,'Trentino-Alto Adige/Südtirol',46.066667,11.116667);
INSERT INTO `regioni` VALUES (5,'Veneto',45.439722,12.331944);
INSERT INTO `regioni` VALUES (6,'Friuli-Venezia Giulia',45.636111,13.804167);
INSERT INTO `regioni` VALUES (7,'Liguria',44.411156,8.932661);
INSERT INTO `regioni` VALUES (8,'Emilia-Romagna',44.493889,11.342778);
INSERT INTO `regioni` VALUES (9,'Toscana',43.771389,11.254167);
INSERT INTO `regioni` VALUES (10,'Umbria',43.112100,12.388800);
INSERT INTO `regioni` VALUES (11,'Marche',43.616667,13.516667);
INSERT INTO `regioni` VALUES (12,'Lazio',41.893056,12.482778);
INSERT INTO `regioni` VALUES (13,'Abruzzo',42.354008,13.391992);
INSERT INTO `regioni` VALUES (14,'Molise',41.561000,14.668400);
INSERT INTO `regioni` VALUES (15,'Campania',40.833333,14.250000);
INSERT INTO `regioni` VALUES (16,'Puglia',41.125278,16.866667);
INSERT INTO `regioni` VALUES (17,'Basilicata',40.633333,15.800000);
INSERT INTO `regioni` VALUES (18,'Calabria',38.910000,16.587500);
INSERT INTO `regioni` VALUES (19,'Sicilia',38.115556,13.361389);
INSERT INTO `regioni` VALUES (20,'Sardegna',39.216667,9.116667);
/*!40000 ALTER TABLE `regioni` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-09 17:55:08

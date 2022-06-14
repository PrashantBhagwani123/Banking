-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: banking1
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `user_account_detail`
--

DROP TABLE IF EXISTS `user_account_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_account_detail` (
  `User_Account_Id` int NOT NULL AUTO_INCREMENT,
  `Account_Number` varchar(45) NOT NULL,
  `Customer_Id` varchar(45) NOT NULL,
  `Account_Balance` varchar(45) NOT NULL,
  `Account_Id` int NOT NULL,
  `User_Id` int NOT NULL,
  `Branch_Id` int NOT NULL,
  PRIMARY KEY (`User_Account_Id`),
  KEY `account_id_idx` (`Account_Id`),
  KEY `Branch_Id_idx` (`Branch_Id`),
  CONSTRAINT `Account_Id` FOREIGN KEY (`Account_Id`) REFERENCES `account` (`Account_Id`),
  CONSTRAINT `Branch_Id` FOREIGN KEY (`Branch_Id`) REFERENCES `branch_detail` (`Branch_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_account_detail`
--

LOCK TABLES `user_account_detail` WRITE;
/*!40000 ALTER TABLE `user_account_detail` DISABLE KEYS */;
INSERT INTO `user_account_detail` VALUES (1,'27481786433','1012572595','10000',5002,1,2),(2,'27481146923','1012755853','10000',5004,1,2),(3,'27481522461','1012235719','10000',5006,1,2),(4,'27481647562','1012990282','10000',5006,2,1),(5,'27481617156','1012167111','10000',5004,2,1),(6,'27481842553','1012575472','10000',5002,2,1);
/*!40000 ALTER TABLE `user_account_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-13 17:26:26

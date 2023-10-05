-- MySQL dump 10.16  Distrib 10.1.26-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: heuristic
-- ------------------------------------------------------
-- Server version	10.1.26-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dosen`
--

DROP TABLE IF EXISTS `dosen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dosen` (
  `Kd_dosen` varchar(6) NOT NULL,
  `Nama_dosen` varchar(20) DEFAULT NULL,
  `Alamat` varchar(30) DEFAULT NULL,
  `Telepon` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`Kd_dosen`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dosen`
--

LOCK TABLES `dosen` WRITE;
/*!40000 ALTER TABLE `dosen` DISABLE KEYS */;
/*!40000 ALTER TABLE `dosen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jurusan`
--

DROP TABLE IF EXISTS `jurusan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jurusan` (
  `Kd_jurusan` varchar(4) NOT NULL,
  `Nama_jurusan` varchar(30) DEFAULT NULL,
  `Ketua_Jurusan` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`Kd_jurusan`),
  KEY `Ketua_Jurusan` (`Ketua_Jurusan`),
  CONSTRAINT `jurusan_ibfk_1` FOREIGN KEY (`Ketua_Jurusan`) REFERENCES `dosen` (`Kd_dosen`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jurusan`
--

LOCK TABLES `jurusan` WRITE;
/*!40000 ALTER TABLE `jurusan` DISABLE KEYS */;
/*!40000 ALTER TABLE `jurusan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `krs`
--

DROP TABLE IF EXISTS `krs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `krs` (
  `Kd_krs` varchar(5) NOT NULL,
  `nim` varchar(6) DEFAULT NULL,
  `Semester` tinyint(4) DEFAULT NULL,
  `Dsn_wali` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`Kd_krs`),
  KEY `nim` (`nim`),
  KEY `Dsn_wali` (`Dsn_wali`),
  CONSTRAINT `krs_ibfk_1` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`),
  CONSTRAINT `krs_ibfk_2` FOREIGN KEY (`Dsn_wali`) REFERENCES `dosen` (`Kd_dosen`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `krs`
--

LOCK TABLES `krs` WRITE;
/*!40000 ALTER TABLE `krs` DISABLE KEYS */;
/*!40000 ALTER TABLE `krs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `krsdetail`
--

DROP TABLE IF EXISTS `krsdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `krsdetail` (
  `Kd_krs` varchar(5) NOT NULL,
  `Kdmk` varchar(6) DEFAULT NULL,
  `Kd_dosen` varchar(6) DEFAULT NULL,
  `Nilai_angka` float DEFAULT NULL,
  `Nilai_huruf` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`Kd_krs`),
  KEY `Kdmk` (`Kdmk`),
  KEY `Kd_dosen` (`Kd_dosen`),
  CONSTRAINT `krsdetail_ibfk_1` FOREIGN KEY (`Kdmk`) REFERENCES `matakuliah` (`Kdmk`),
  CONSTRAINT `krsdetail_ibfk_2` FOREIGN KEY (`Kd_dosen`) REFERENCES `dosen` (`Kd_dosen`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `krsdetail`
--

LOCK TABLES `krsdetail` WRITE;
/*!40000 ALTER TABLE `krsdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `krsdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mahasiswa`
--

DROP TABLE IF EXISTS `mahasiswa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mahasiswa` (
  `nim` varchar(6) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `alamat` varchar(30) NOT NULL,
  `Kd_jurusan` varchar(4) DEFAULT NULL,
  `Tgl_masuk` datetime DEFAULT NULL,
  PRIMARY KEY (`nim`),
  KEY `Kd_jurusan` (`Kd_jurusan`),
  CONSTRAINT `mahasiswa_ibfk_1` FOREIGN KEY (`Kd_jurusan`) REFERENCES `jurusan` (`Kd_jurusan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mahasiswa`
--

LOCK TABLES `mahasiswa` WRITE;
/*!40000 ALTER TABLE `mahasiswa` DISABLE KEYS */;
/*!40000 ALTER TABLE `mahasiswa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `matakuliah`
--

DROP TABLE IF EXISTS `matakuliah`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `matakuliah` (
  `Kdmk` varchar(6) NOT NULL,
  `Nama_mk` varchar(25) DEFAULT NULL,
  `Semester` tinyint(4) DEFAULT NULL,
  `Sks` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`Kdmk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matakuliah`
--

LOCK TABLES `matakuliah` WRITE;
/*!40000 ALTER TABLE `matakuliah` DISABLE KEYS */;
/*!40000 ALTER TABLE `matakuliah` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-06 18:23:56

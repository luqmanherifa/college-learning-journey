-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2018 at 01:31 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mycostbased`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `KDBUKU` varchar(100) NOT NULL,
  `KDPENERBIT` varchar(100) DEFAULT NULL,
  `JUDULBUKU` varchar(100) DEFAULT NULL,
  `STOKBUKU` int(11) DEFAULT NULL,
  `HARGABUKU` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`KDBUKU`, `KDPENERBIT`, `JUDULBUKU`, `STOKBUKU`, `HARGABUKU`) VALUES
('B01', 'R01', 'Fisika', 35, 70000),
('B02', 'R02', 'Matematika', 50, 55000),
('B03', 'R03', 'Sejarah', 25, 40000),
('B04', 'R01', 'Biologi', 30, 65000),
('B05', 'R02', 'Olahraga', 15, 15000),
('B06', 'R03', 'Kimia', 25, 65000),
('B07', 'R01', 'Geografi', 30, 45000),
('B08', 'R02', 'Ekonomi', 25, 35000),
('B09', 'R03', 'Bahasa', 30, 40000),
('B10', 'R01', 'Sosiologi', 25, 25000);

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `KDKARYAWAN` varchar(100) NOT NULL,
  `NAMAKAR` varchar(100) DEFAULT NULL,
  `KOTAKAR` varchar(100) DEFAULT NULL,
  `TELPONKAR` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`KDKARYAWAN`, `NAMAKAR`, `KOTAKAR`, `TELPONKAR`) VALUES
('K01', 'Gandi', 'Kediri', '085212341231'),
('K02', 'Edwin', 'Probolinggo', '085212341232'),
('K03', 'Hikmah', 'Blitar', '085212341233'),
('K04', 'Tika', 'Malang', '085212341234'),
('K05', 'Ichandra', 'Surabaya', '085212341235'),
('K06', 'Agung', 'Sidoarjo', '085212341236'),
('K07', 'Sarif', 'Kediri', '085212341237'),
('K08', 'Anggara', 'Jember', '085212341238'),
('K09', 'Gilang', 'Jember', '085212341239'),
('K10', 'Risma', 'Malang', '085212341230');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `KDPELANGGAN` varchar(100) NOT NULL,
  `NAMAPEL` varchar(100) DEFAULT NULL,
  `KOTAPEL` varchar(100) DEFAULT NULL,
  `TELPONPEL` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`KDPELANGGAN`, `NAMAPEL`, `KOTAPEL`, `TELPONPEL`) VALUES
('P01', 'Tegar', 'Malang', '085212344561'),
('P02', 'Andini', 'Surabaya', '085212344562'),
('P03', 'Farah', 'Jember', '085212344563'),
('P04', 'Levina', 'Probolinggo', '085212344564'),
('P05', 'Nahda', 'Kediri', '085212344565'),
('P06', 'Nuzi', 'Malang', '085212344566'),
('P07', 'Rahardian', 'Jember', '085212344567'),
('P08', 'Sando', 'Malang', '085212344568'),
('P09', 'Fira', 'Kediri', '085212344569'),
('P10', 'Wildan', 'Blitar', '085212344560');

-- --------------------------------------------------------

--
-- Table structure for table `penerbit`
--

CREATE TABLE `penerbit` (
  `KDPENERBIT` varchar(100) NOT NULL,
  `NAMAPENER` varchar(100) DEFAULT NULL,
  `KOTAPENER` varchar(100) DEFAULT NULL,
  `TELPONPENER` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penerbit`
--

INSERT INTO `penerbit` (`KDPENERBIT`, `NAMAPENER`, `KOTAPENER`, `TELPONPENER`) VALUES
('R01', 'Erlangga', 'Jakarta', '085212349871'),
('R02', 'Balai Pustaka', 'Jakarta', '085212349872'),
('R03', 'Tiga Serangkai', 'Bandung', '085212349873');

-- --------------------------------------------------------

--
-- Table structure for table `transjual`
--

CREATE TABLE `transjual` (
  `KDNOTA` varchar(100) NOT NULL,
  `KDKARYAWAN` varchar(100) DEFAULT NULL,
  `KDPENERBIT` varchar(100) DEFAULT NULL,
  `KDBUKU` varchar(100) DEFAULT NULL,
  `KDPELANGGAN` varchar(100) DEFAULT NULL,
  `TANGGAL` date DEFAULT NULL,
  `JUMLAH` int(11) DEFAULT NULL,
  `TOTAL` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transjual`
--

INSERT INTO `transjual` (`KDNOTA`, `KDKARYAWAN`, `KDPENERBIT`, `KDBUKU`, `KDPELANGGAN`, `TANGGAL`, `JUMLAH`, `TOTAL`) VALUES
('T01', 'K01', 'R01', 'B01', 'P01', '2018-11-02', 10, 700000),
('T02', 'K02', 'R02', 'B02', 'P02', '2018-11-03', 8, 440000),
('T03', 'K03', 'R03', 'B03', 'P03', '2018-11-04', 11, 440000),
('T04', 'K04', 'R01', 'B04', 'P04', '2018-08-02', 5, 325000),
('T05', 'K05', 'R02', 'B05', 'P05', '2018-08-03', 8, 120000),
('T06', 'K06', 'R03', 'B06', 'P06', '2018-08-04', 13, 845000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`KDBUKU`),
  ADD KEY `FK_RELATIONSHIP_5` (`KDPENERBIT`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`KDKARYAWAN`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`KDPELANGGAN`);

--
-- Indexes for table `penerbit`
--
ALTER TABLE `penerbit`
  ADD PRIMARY KEY (`KDPENERBIT`);

--
-- Indexes for table `transjual`
--
ALTER TABLE `transjual`
  ADD PRIMARY KEY (`KDNOTA`),
  ADD KEY `FK_RELATIONSHIP_1` (`KDKARYAWAN`),
  ADD KEY `FK_RELATIONSHIP_2` (`KDPELANGGAN`),
  ADD KEY `FK_RELATIONSHIP_4` (`KDBUKU`),
  ADD KEY `FK_RELATIONSHIP_6` (`KDPENERBIT`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `FK_RELATIONSHIP_5` FOREIGN KEY (`KDPENERBIT`) REFERENCES `penerbit` (`KDPENERBIT`);

--
-- Constraints for table `transjual`
--
ALTER TABLE `transjual`
  ADD CONSTRAINT `FK_RELATIONSHIP_1` FOREIGN KEY (`KDKARYAWAN`) REFERENCES `karyawan` (`KDKARYAWAN`),
  ADD CONSTRAINT `FK_RELATIONSHIP_2` FOREIGN KEY (`KDPELANGGAN`) REFERENCES `pelanggan` (`KDPELANGGAN`),
  ADD CONSTRAINT `FK_RELATIONSHIP_4` FOREIGN KEY (`KDBUKU`) REFERENCES `buku` (`KDBUKU`),
  ADD CONSTRAINT `FK_RELATIONSHIP_6` FOREIGN KEY (`KDPENERBIT`) REFERENCES `penerbit` (`KDPENERBIT`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

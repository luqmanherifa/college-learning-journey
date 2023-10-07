-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 11, 2018 at 09:43 AM
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
-- Database: `servismotor`
--

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `IDBAYAR` varchar(20) NOT NULL,
  `IDSERVIS` varchar(20) DEFAULT NULL,
  `TOTALBAYAR` float(8,2) DEFAULT NULL,
  `TANGGALBAYAR` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `billing`
--

INSERT INTO `billing` (`IDBAYAR`, `IDSERVIS`, `TOTALBAYAR`, `TANGGALBAYAR`) VALUES
('BL01', 'SV01', 85000.00, '2018-09-04'),
('BL02', 'SV02', 105000.00, '2018-09-04'),
('BL03', 'SV03', 145000.00, '2018-09-04');

-- --------------------------------------------------------

--
-- Table structure for table `detail_bayar`
--

CREATE TABLE `detail_bayar` (
  `IDBAYAR` varchar(20) NOT NULL,
  `IDSPAREPART` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_bayar`
--

INSERT INTO `detail_bayar` (`IDBAYAR`, `IDSPAREPART`) VALUES
('BL01', 'SP01'),
('BL02', 'SP02'),
('BL03', 'SP03');

-- --------------------------------------------------------

--
-- Table structure for table `detail_servis`
--

CREATE TABLE `detail_servis` (
  `IDSERVIS` varchar(20) NOT NULL,
  `IDMEKANIK` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_servis`
--

INSERT INTO `detail_servis` (`IDSERVIS`, `IDMEKANIK`) VALUES
('SV01', 'MK01'),
('SV02', 'MK02'),
('SV03', 'MK03');

-- --------------------------------------------------------

--
-- Table structure for table `kendaraan`
--

CREATE TABLE `kendaraan` (
  `IDKENDARAAN` varchar(20) NOT NULL,
  `IDPELANGGAN` varchar(20) DEFAULT NULL,
  `MERKKENDARAAN` varchar(20) DEFAULT NULL,
  `NOPOLKENDARAAN` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kendaraan`
--

INSERT INTO `kendaraan` (`IDKENDARAAN`, `IDPELANGGAN`, `MERKKENDARAAN`, `NOPOLKENDARAAN`) VALUES
('KD01', 'PL01', 'HONDA BEAT', 'N 3692 NA'),
('KD02', 'PL02', 'HONDA VARIO', 'N 3333 AT'),
('KD03', 'PL03', 'HONDA PCX', 'AG 8790 IT');

-- --------------------------------------------------------

--
-- Table structure for table `mekanik`
--

CREATE TABLE `mekanik` (
  `IDMEKANIK` varchar(20) NOT NULL,
  `NAMAMEKANIK` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mekanik`
--

INSERT INTO `mekanik` (`IDMEKANIK`, `NAMAMEKANIK`) VALUES
('MK01', 'MASRUD'),
('MK02', 'GILANG'),
('MK03', 'ANGGORO');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `IDPELANGGAN` varchar(20) NOT NULL,
  `NAMAPELANGGAN` varchar(20) DEFAULT NULL,
  `ALAMATPELANGGAN` text,
  `TELPONPELANGGAN` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`IDPELANGGAN`, `NAMAPELANGGAN`, `ALAMATPELANGGAN`, `TELPONPELANGGAN`) VALUES
('PL01', 'FIRMAN', 'JL. HARYONO', '085219731234'),
('PL02', 'FRENDI', 'JL. HATTA', '085219734567'),
('PL03', 'FERY', 'JL. VETERAN', '085219737890');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `IDPETUGAS` varchar(20) NOT NULL,
  `NAMAPETUGAS` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`IDPETUGAS`, `NAMAPETUGAS`) VALUES
('PT01', 'ALFIAN'),
('PT02', 'ALDIN'),
('PT03', 'MARSEL');

-- --------------------------------------------------------

--
-- Table structure for table `servis`
--

CREATE TABLE `servis` (
  `IDSERVIS` varchar(20) NOT NULL,
  `IDKENDARAAN` varchar(20) DEFAULT NULL,
  `IDPETUGAS` varchar(20) DEFAULT NULL,
  `IDBAYAR` varchar(20) DEFAULT NULL,
  `KELUHAN` text,
  `TANGGALSERVIS` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `servis`
--

INSERT INTO `servis` (`IDSERVIS`, `IDKENDARAAN`, `IDPETUGAS`, `IDBAYAR`, `KELUHAN`, `TANGGALSERVIS`) VALUES
('SV01', 'KD01', 'PT01', 'BL01', 'SERVIS, GANTI BUSI, CUCI MOTOR', '2018-09-04'),
('SV02', 'KD02', 'PT02', 'BL02', 'SERVIS, GANTI SPION, CUCI MOTOR', '2018-09-04'),
('SV03', 'KD03', 'PT03', 'BL03', 'SERVIS, GANTI OLI, CUCI MOTOR', '2018-09-04');

-- --------------------------------------------------------

--
-- Table structure for table `sparepart`
--

CREATE TABLE `sparepart` (
  `IDSPAREPART` varchar(20) NOT NULL,
  `NAMASPAREPART` varchar(20) DEFAULT NULL,
  `HARGASPAREPART` float(8,2) DEFAULT NULL,
  `STOKSPAREPART` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sparepart`
--

INSERT INTO `sparepart` (`IDSPAREPART`, `NAMASPAREPART`, `HARGASPAREPART`, `STOKSPAREPART`) VALUES
('SP01', 'SPION MOTOR', 39000.00, 10),
('SP02', 'VISOR MOTOR', 121000.00, 5),
('SP03', 'HEADLIGHT MOTOR', 134000.00, 8);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`IDBAYAR`),
  ADD KEY `FK_RELATIONSHIP_7` (`IDSERVIS`);

--
-- Indexes for table `detail_bayar`
--
ALTER TABLE `detail_bayar`
  ADD PRIMARY KEY (`IDBAYAR`,`IDSPAREPART`),
  ADD KEY `FK_DETAIL_BAYAR2` (`IDSPAREPART`);

--
-- Indexes for table `detail_servis`
--
ALTER TABLE `detail_servis`
  ADD PRIMARY KEY (`IDSERVIS`,`IDMEKANIK`),
  ADD KEY `FK_DETAIL_SERVIS2` (`IDMEKANIK`);

--
-- Indexes for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD PRIMARY KEY (`IDKENDARAAN`),
  ADD KEY `FK_RELATIONSHIP_1` (`IDPELANGGAN`);

--
-- Indexes for table `mekanik`
--
ALTER TABLE `mekanik`
  ADD PRIMARY KEY (`IDMEKANIK`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`IDPELANGGAN`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`IDPETUGAS`);

--
-- Indexes for table `servis`
--
ALTER TABLE `servis`
  ADD PRIMARY KEY (`IDSERVIS`),
  ADD KEY `FK_RELATIONSHIP_2` (`IDKENDARAAN`),
  ADD KEY `FK_RELATIONSHIP_3` (`IDPETUGAS`),
  ADD KEY `FK_RELATIONSHIP_6` (`IDBAYAR`);

--
-- Indexes for table `sparepart`
--
ALTER TABLE `sparepart`
  ADD PRIMARY KEY (`IDSPAREPART`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `billing`
--
ALTER TABLE `billing`
  ADD CONSTRAINT `FK_RELATIONSHIP_7` FOREIGN KEY (`IDSERVIS`) REFERENCES `servis` (`IDSERVIS`);

--
-- Constraints for table `detail_bayar`
--
ALTER TABLE `detail_bayar`
  ADD CONSTRAINT `FK_DETAIL_BAYAR` FOREIGN KEY (`IDBAYAR`) REFERENCES `billing` (`IDBAYAR`),
  ADD CONSTRAINT `FK_DETAIL_BAYAR2` FOREIGN KEY (`IDSPAREPART`) REFERENCES `sparepart` (`IDSPAREPART`);

--
-- Constraints for table `detail_servis`
--
ALTER TABLE `detail_servis`
  ADD CONSTRAINT `FK_DETAIL_SERVIS` FOREIGN KEY (`IDSERVIS`) REFERENCES `servis` (`IDSERVIS`),
  ADD CONSTRAINT `FK_DETAIL_SERVIS2` FOREIGN KEY (`IDMEKANIK`) REFERENCES `mekanik` (`IDMEKANIK`);

--
-- Constraints for table `kendaraan`
--
ALTER TABLE `kendaraan`
  ADD CONSTRAINT `FK_RELATIONSHIP_1` FOREIGN KEY (`IDPELANGGAN`) REFERENCES `pelanggan` (`IDPELANGGAN`);

--
-- Constraints for table `servis`
--
ALTER TABLE `servis`
  ADD CONSTRAINT `FK_RELATIONSHIP_2` FOREIGN KEY (`IDKENDARAAN`) REFERENCES `kendaraan` (`IDKENDARAAN`),
  ADD CONSTRAINT `FK_RELATIONSHIP_3` FOREIGN KEY (`IDPETUGAS`) REFERENCES `petugas` (`IDPETUGAS`),
  ADD CONSTRAINT `FK_RELATIONSHIP_6` FOREIGN KEY (`IDBAYAR`) REFERENCES `billing` (`IDBAYAR`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

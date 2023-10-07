/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : perpus

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-06-26 10:56:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for anggota
-- ----------------------------
DROP TABLE IF EXISTS `anggota`;
CREATE TABLE `anggota` (
  `IdAnggota` varchar(4) NOT NULL,
  `Nama` varchar(25) DEFAULT NULL,
  `Alamat` varchar(50) DEFAULT NULL,
  `Telp` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`IdAnggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of anggota
-- ----------------------------

-- ----------------------------
-- Table structure for buku
-- ----------------------------
DROP TABLE IF EXISTS `buku`;
CREATE TABLE `buku` (
  `KdBuku` varchar(4) NOT NULL,
  `Judul` varchar(30) DEFAULT NULL,
  `KdPenerbit` varchar(5) DEFAULT NULL,
  `ThnTerbit` varchar(4) DEFAULT NULL,
  `Jumlah` int(11) DEFAULT NULL,
  PRIMARY KEY (`KdBuku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of buku
-- ----------------------------

-- ----------------------------
-- Table structure for detail_pinjam
-- ----------------------------
DROP TABLE IF EXISTS `detail_pinjam`;
CREATE TABLE `detail_pinjam` (
  `KdPinjam` varchar(4) DEFAULT NULL,
  `KdBuku` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of detail_pinjam
-- ----------------------------

-- ----------------------------
-- Table structure for peminjaman
-- ----------------------------
DROP TABLE IF EXISTS `peminjaman`;
CREATE TABLE `peminjaman` (
  `KdPinjam` varchar(4) NOT NULL,
  `IdAnggota` varchar(4) DEFAULT NULL,
  `tglPinjam` date DEFAULT NULL,
  `tglHarusKembali` date DEFAULT NULL,
  PRIMARY KEY (`KdPinjam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of peminjaman
-- ----------------------------

-- ----------------------------
-- Table structure for penerbit
-- ----------------------------
DROP TABLE IF EXISTS `penerbit`;
CREATE TABLE `penerbit` (
  `KdPenerbit` varchar(5) NOT NULL,
  `NamaPenerbit` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`KdPenerbit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of penerbit
-- ----------------------------

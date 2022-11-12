-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2022 at 07:46 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `laptop`
--

CREATE TABLE `laptop` (
  `laptopid` int(11) NOT NULL,
  `brandname` varchar(30) DEFAULT NULL,
  `modelname` varchar(30) DEFAULT NULL,
  `costprice` int(11) DEFAULT NULL,
  `saleprice` int(11) DEFAULT NULL,
  `currentstatus` varchar(10) DEFAULT NULL CHECK (`currentstatus` in ('InStock','OutOfStock'))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `laptop`
--

INSERT INTO `laptop` (`laptopid`, `brandname`, `modelname`, `costprice`, `saleprice`, `currentstatus`) VALUES
(1, 'Asus', 'VivoBookK15', 56000, 67000, 'InStock'),
(2, 'Dell', 'Alien', 120000, 150000, 'InStock'),
(3, 'Dell', 'XPS13', 67000, 87000, 'InStock'),
(4, 'Acer', 'Legion', 89000, 98000, 'OutOfStock'),
(5, 'Acer', 'Aspire', 45000, 50000, 'InStock');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `laptop`
--
ALTER TABLE `laptop`
  ADD PRIMARY KEY (`laptopid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

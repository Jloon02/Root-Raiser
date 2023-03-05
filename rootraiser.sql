-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 04, 2023 at 10:46 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rootraiser`
--

-- --------------------------------------------------------

--
-- Table structure for table `produce_list`
--

CREATE TABLE `produce_list` (
  `u_id` int(11) NOT NULL,
  `product_serial_number` int(11) NOT NULL,
  `product_image` varchar(500) NOT NULL,
  `price` float NOT NULL COMMENT 'in CAD/ Unit',
  `product` varchar(20) NOT NULL,
  `available_number` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produce_list`
--

INSERT INTO `produce_list` (`u_id`, `product_serial_number`, `product_image`, `price`, `product`, `available_number`) VALUES
(1, 1, 'https://upload.wikimedia.org/wikipedia/commons/8/89/Tomato_je.jpg', 0.62, 'Tomato', 100),
(1, 2, 'https://images.immediate.co.uk/production/volatile/sites/30/2017/01/Bunch-of-bananas-67e91d5.jpg?quality=90&webp=true&resize=440,400', 0.2, 'Banana', 200),
(2, 3, 'https://www.realsimple.com/thmb/b9LNSrmY7E3I01FgOrsQDSEtsZY=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/banana-health-benefits-2000-dd3246dfde864ba08bb585381491925e.jpg', 0.3, 'Banana', 168),
(3, 4, 'https://domf5oio6qrcr.cloudfront.net/medialibrary/5390/h1218g16207258089583.jpg', 1.7, 'Broccoli', 200),
(3, 5, 'https://sa1s3optim.patientpop.com/assets/images/provider/photos/2445929.png', 0.55, 'Cucumber', 400),
(4, 6, 'https://cdn.britannica.com/08/194708-050-56FF816A/potatoes.jpg', 0.15, 'Potato', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `user_location`
--

CREATE TABLE `user_location` (
  `u_id` int(11) NOT NULL,
  `location` varchar(50) NOT NULL,
  `latitude` float NOT NULL,
  `longitude` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_location`
--

INSERT INTO `user_location` (`u_id`, `location`, `latitude`, `longitude`) VALUES
(1, 'Surrey Farm', 49.0963, -122.8),
(2, 'Richmond Farm', 49.1331, -123.084),
(3, 'UBC Farm', 49.2505, -123.237),
(4, 'NV Family Farm', 49.32, -123.072),
(5, 'Burnaby Fruit Place', 49.2488, -122.98),
(6, 'Nanaimo Morgan Creek Farm', 49.1801, -124.079);

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `u_id` int(40) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`u_id`, `username`, `password`) VALUES
(1, 'FarmerDude604', 'kingsWay_1234'),
(2, 'RootBOY604', 'iLoveFarming34'),
(3, 'Van_Farming', 'theFarm88'),
(4, 'GreenThumbGrower', 'PoTaTo_TomaTo'),
(5, 'AgriAdmirer', 'haha12344'),
(6, 'FarmFreshFollower', 'FreshStuff777');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `produce_list`
--
ALTER TABLE `produce_list`
  ADD PRIMARY KEY (`u_id`,`product_serial_number`),
  ADD KEY `0000` (`product_serial_number`);

--
-- Indexes for table `user_location`
--
ALTER TABLE `user_location`
  ADD PRIMARY KEY (`u_id`),
  ADD UNIQUE KEY `location` (`location`);

--
-- Indexes for table `user_login`
--
ALTER TABLE `user_login`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `produce_list`
--
ALTER TABLE `produce_list`
  MODIFY `product_serial_number` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `user_login`
--
ALTER TABLE `user_login`
  MODIFY `u_id` int(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `produce_list`
--
ALTER TABLE `produce_list`
  ADD CONSTRAINT `user_id` FOREIGN KEY (`u_id`) REFERENCES `user_login` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user_location`
--
ALTER TABLE `user_location`
  ADD CONSTRAINT `user_location` FOREIGN KEY (`u_id`) REFERENCES `user_login` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

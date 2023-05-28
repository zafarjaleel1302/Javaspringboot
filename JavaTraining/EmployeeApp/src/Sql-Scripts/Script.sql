CREATE TABLE `employee_info` (
 `employee_Id` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `employee_name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `gender` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `pf` tinyint(1) NOT NULL,
  `graduity` tinyint(1) NOT NULL,
  `meal_Card` tinyint(1) NOT NULL,
  `nps` tinyint(1) NOT NULL,
  `medi_claim` tinyint(1) NOT NULL,
  `location` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `employee_address` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `employee_Salary` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`employee_Id`),
  KEY `employee_info_employee_Id_IDX` (`employee_Id`,`employee_name`,`gender`,`pf`,`graduity`,`meal_Card`,`nps`,`medi_claim`,`location`,`employee_address`,`employee_Salary`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
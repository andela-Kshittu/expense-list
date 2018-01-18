CREATE DATABASE IF NOT EXISTS `expensedb`;
USE `expensedb`;
CREATE TABLE IF NOT EXISTS `expensedb`.`expense` (
  `id` BIGINT unsigned NOT NULL AUTO_INCREMENT,
  `reason` VARCHAR(225) NOT NULL,
  `amount` VARCHAR(64) NOT NULL,
  `vat` VARCHAR(32) NOT NULL,
  `date` VARCHAR(12) NOT NULL,
  PRIMARY KEY(`id`)
);

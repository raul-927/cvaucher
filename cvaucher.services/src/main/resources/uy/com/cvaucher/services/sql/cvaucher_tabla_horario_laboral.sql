-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.5.24-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             8.1.0.4545
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura para tabla est_vaucher.horario_laboral
CREATE TABLE IF NOT EXISTS `horario_laboral` (
  `hor_lab_id` int(11) NOT NULL AUTO_INCREMENT,
  `hor_lab_hora_desde` time DEFAULT NULL,
  `hor_lab_hora_hasta` time DEFAULT NULL,
  `hor_lab_semana` int(11) DEFAULT NULL,
  `hor_lab_mes` int(11) DEFAULT NULL,
  `hor_lab_desc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`hor_lab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla est_vaucher.horario_laboral: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `horario_laboral` DISABLE KEYS */;
/*!40000 ALTER TABLE `horario_laboral` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

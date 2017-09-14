DROP DATABASE IF EXISTS przychodnia;
CREATE DATABASE przychodnia;
USE przychodnia;

CREATE TABLE IF NOT EXISTS`pacjenci` (
	`idPacjent` int(11) NOT NULL AUTO_INCREMENT,
	`firstName` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
	`lastName` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
	`pesel` int(11) NOT NULL,
	`miasto`text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
	`ulica` text CHARACTER SET utf8 COLLATE utf8_polish_ci,
	`numerDomu` int(11) NOT NULL,
	`numerMieszkania` int(11),
  
	PRIMARY KEY (`idPacjent`)
)
DEFAULT CHARSET = utf8 COLLATE utf8_bin AUTO_INCREMENT=1;


CREATE TABLE IF NOT EXISTS `lekarze` (
	`idLekarz` int(11) NOT NULL AUTO_INCREMENT,
	`firstName` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
	`lastName` text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
	`pesel` int(11) NOT NULL,
	`miasto`text CHARACTER SET utf8 COLLATE utf8_polish_ci NOT NULL,
	`ulica` text CHARACTER SET utf8 COLLATE utf8_polish_ci,
	`numerDomu` int(11) NOT NULL,
	`numerMieszkania` int(11),
    
	PRIMARY KEY (`idLekarz`)
)
DEFAULT CHARSET = utf8 COLLATE utf8_bin AUTO_INCREMENT=1;


CREATE TABLE IF NOT EXISTS `wizyty` (
	`idWizyta` int(11) NOT NULL AUTO_INCREMENT,
	`idPacjent` int(11) NOT NULL,
	`idLekarz` int(11) NOT NULL,
    `data`	DATE,
    `godzina` TIME,
    
	PRIMARY KEY (`idWizyta`)
)
DEFAULT CHARSET = utf8 COLLATE utf8_bin AUTO_INCREMENT=1;


CREATE TABLE IF NOT EXISTS `godzinyPracy` (
	`idGodzinaPracy` int(11) NOT NULL AUTO_INCREMENT,
	`idLekarz` int(11) NOT NULL,
    `data`	DATE,
    `godzina` TIME,
    
	PRIMARY KEY (`idGodzinaPracy`)
)
DEFAULT CHARSET = utf8 COLLATE utf8_bin AUTO_INCREMENT=1;
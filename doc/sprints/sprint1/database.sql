
CREATE USER 'fatec'@'localhost' IDENTIFIED BY 'fatec';
GRANT ALL PRIVILEGES ON * . * TO 'fatec'@'localhost';
FLUSH PRIVILEGES;

CREATE SCHEMA IF NOT EXISTS `vapt` DEFAULT CHARACTER SET utf8 ;
USE `vapt` ;


CREATE TABLE IF NOT EXISTS `vapt`.`Turma` (
  `id_turma` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `nome_escola` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_turma`));

CREATE TABLE IF NOT EXISTS `vapt`.`Atividade` (
  `id_atividade` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NULL,
  `descricao` TEXT(300) NULL,
  `data_inicio` DATE NOT NULL,
  `data_fim` DATE NOT NULL,
  `Turma_id_turma` INT NOT NULL,
  PRIMARY KEY (`id_atividade`, `Turma_id_turma`),
  INDEX `fk_Atividade_Turma1_idx` (`Turma_id_turma` ASC) VISIBLE,
  CONSTRAINT `fk_Atividade_Turma1`
    FOREIGN KEY (`Turma_id_turma`)
    REFERENCES `vapt`.`Turma` (`id_turma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `vapt`.`Aluno` (
  `id_aluno` INT NOT NULL AUTO_INCREMENT,
  `Turma_id_turma` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  PRIMARY KEY (`id_aluno`, `Turma_id_turma`),
  INDEX `fk_Aluno_Turma_idx` (`Turma_id_turma` ASC) VISIBLE,
  CONSTRAINT `fk_Aluno_Turma`
    FOREIGN KEY (`Turma_id_turma`)
    REFERENCES `vapt`.`Turma` (`id_turma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `vapt`.`Dia_Semana` (
  `id_dia` INT NOT NULL AUTO_INCREMENT,
  `Turma_id_turma` INT NOT NULL,
  `dia` VARCHAR(10) NOT NULL,
  `hora_inicio` VARCHAR(45) NULL,
  `hora_fim` VARCHAR(45) NULL,
  PRIMARY KEY (`id_dia`, `Turma_id_turma`),
  INDEX `fk_Dia_Semana_Turma1_idx` (`Turma_id_turma` ASC) VISIBLE,
  CONSTRAINT `fk_Dia_Semana_Turma1`
    FOREIGN KEY (`Turma_id_turma`)
    REFERENCES `vapt`.`Turma` (`id_turma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE TABLE IF NOT EXISTS `vapt`.`Aluno_Atividade` (
  `Aluno_id_aluno` INT NOT NULL,
  `Atividade_id_atividade` INT NOT NULL,
  `Aluno_Atividade_entrega` TINYINT NULL,
  `Aluno_Atividade_data_entrega` DATE NULL,
  PRIMARY KEY (`Aluno_id_aluno`, `Atividade_id_atividade`),
  INDEX `fk_Aluno_has_Atividade_Atividade1_idx` (`Atividade_id_atividade` ASC) VISIBLE,
  INDEX `fk_Aluno_has_Atividade_Aluno1_idx` (`Aluno_id_aluno` ASC) VISIBLE,
  CONSTRAINT `fk_Aluno_has_Atividade_Aluno1`
    FOREIGN KEY (`Aluno_id_aluno`)
    REFERENCES `vapt`.`Aluno` (`id_aluno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Aluno_has_Atividade_Atividade1`
    FOREIGN KEY (`Atividade_id_atividade`)
    REFERENCES `vapt`.`Atividade` (`id_atividade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


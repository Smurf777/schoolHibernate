CREATE TABLE IF NOT EXISTS `config_lesson`.`engines` (

                                             `model` INT NOT NULL,
                                             `power` VARCHAR(45) NOT NULL,
                                             PRIMARY KEY (`model`, `power`));
INSERT INTO engines(model, power) VALUES ('engine_model_01', 1250);
INSERT INTO engines(model, power) VALUES ('engine_model_02', 2020);


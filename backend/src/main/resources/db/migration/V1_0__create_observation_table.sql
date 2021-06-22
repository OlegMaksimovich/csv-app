CREATE TABLE IF NOT EXISTS `observation` (
    `obs` INTEGER PRIMARY KEY,
    `date` DATE NOT NULL,
    `latitude` DECIMAL (3,2) NOT NULL,
    `longitude` DECIMAL(3,2) NOT NULL,
    `zonWinds` DECIMAL(2,2),
    `merWinds` DECIMAL(2,2),
    `humidity` DECIMAL(2,2),
    `airTemp` DECIMAL(2,2),
    `sSTemp` DECIMAL(2,2)
);
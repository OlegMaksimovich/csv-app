create table if not exists `observation` (
    `observationNumber` int not null PRIMARY KEY,
    `date` date not null,
    `latitude` decimal(3,2) not null,
    `longitude` decimal(3,2) not null,
    `zonWinds` decimal(2,2),
    `merWinds` decimal(2,2),
    `humidity` decimal(2,2),
    `airTemp` decimal(2,2),
    `sSTemp` decimal(2,2)
    )ENGINE=InnoDB DEFAULT CHARSET=UTF8;
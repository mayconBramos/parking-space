CREATE TABLE TB_PARKING_SPACE(
id Int not null unique PRIMARY KEY,
numeroVaga  VARCHAR (10) not null unique,
placaCarro VARCHAR(7) not null unique,
marcaCarro VARCHAR(70) not null,
modeloCarro VARCHAR(70) not null,
corCarro VARCHAR(70) not null,
dataRegistro DATE not null,
nomeResponsavel VARCHAR (130) not null,
apartamento VARCHAR (30) not null,
bloco VARCHAR (30) not null

)
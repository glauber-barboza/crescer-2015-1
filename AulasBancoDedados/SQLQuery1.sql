insert into Cliente
(Nome,
Endereco,
Bairro)
Values('Maria', 'Rua Bento Gonçalves, 123', ' Contro');

insert into Cliente
Values('Maria', 'Rua Bento Gonçalves, 123', ' Contro',10);

drop table cidade;

Create table Cidade
(
IDCidade int NOT NULL,
Nome varchar(30)NOT NULL,
UF varchar(2)NOT NULL,
constraint PK_Cidade Primary Key (IDCidade),
constraint UK_Cidade_Nome Unique (Nome)
);

insert into Cidade values(1, 'Novo Hanburgo', 'RS')

Create table Empregado
(
IDEmpregado int NOT NULL,
Nome varchar(50)NOT NULL,
Sexo char(1)NOT NULL,
IDCidade int NOT NULL,
constraint PK_Empregado Primary Key (IDEmpregado),
constraint CC_Empregado_Sexo Check (Sexo in('F','M')),
constraint FK_Empregado_Cidade Foreign Key (IDCidade)
References Cidade (IDCidade)
);
--1)Selecione o nome do empregado e nome do departamento que cada um está associado.

select a.NomeEmpregado,
d.NomeDepartamento
from Empregado a
inner join Departamento d on a.IDDepartamento= d.IDDepartamento;

--2)Exibir o nome do associado e sua cidade, exibir também associados sem Cidade relacionada.

select a.Nome, c.Nome
from Associado a
left join Cidade c on a.IDCidade=c.IDCidade ;

--3)Lista os estados (UF) e total de cidades que não possuem associados relacionados 
--(dica: pode ser utilizado count + group by + exists).

Select  e.UF, count(1) Contador
From Cidade e
Where EXISTS(Select *
From Associado a
Where ISNULL(a.IDCidade,0) = 0)
Group by e.UF
Order by Contador Desc


--Valor inserido para testes
insert into Associado(IDAssociado,Nome,dataNascimento,sexo,idCidade)
 values (3,'Teste',GETDATE(),'M',2);

delete from Associado where IDAssociado=3


 --busca auxiliar
select * from Associado
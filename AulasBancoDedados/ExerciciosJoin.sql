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
Where  not EXISTS(Select 1
From Associado a
Where a.IDCidade= e.IDCidade)
Group by e.UF
order by Contador desc


delete from Associado where IDAssociado=3


 --busca auxiliar
select * from Associado
select * from Cidade

--4)Faça uma consulta que liste o nome do associado, o nome da cidade,
-- e uma coluna que indique se a cidade é da região SUL (RS, SC, PR),
-- se for imprimir *** (3 asteriscos), senão imprimir nulo.

create view vw_cidade_regiao as
select a.Nome as nomeAssociado, 
c.Nome as NomeCidade,
case when c.UF in ('RS','SC','PR') then '***'
else null
end E_do_sul_tche
	
from Associado a

left join Cidade c on a.IDCidade=c.IDCidade ;


--5)Liste o nome do empregado, o nome do gerente, e o departamento de cada um.


select  e.NomeEmpregado, 
		d.NomeDepartamento, 
		e.Cargo,
	case 
		when e.Cargo ='Gerente' then Cargo
	end Gerentes
from Empregado e
	inner join Departamento d on e.IDDepartamento= d.IDDepartamento
order by Gerentes desc

--6)Faça uma cópia da tabela Empregado e 
--altere o salário de todos os empregados 
--que o departamento fique na localidade de SAO PAULO, faça um reajuste de 14,5%

SELECT * INTO EmpregadoCOPIA 
   FROM Empregado

begin transaction
go

update Empregado
set Salario =Salario + Salario*0.145
where NomeEmpregado in (select e.NomeEmpregado
from Empregado e
inner join Departamento d on e.IDDepartamento = d.IDDepartamento and d.Localizacao='SAO PAULO')


select NomeEmpregado,Salario
from Empregado e
inner join Departamento d on e.IDDepartamento = d.IDDepartamento and d.Localizacao='SAO PAULO'

select Localizacao
from Departamento




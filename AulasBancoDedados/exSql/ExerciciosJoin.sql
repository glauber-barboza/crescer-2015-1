--1)Selecione o nome do empregado e nome do departamento que cada um est� associado.

select a.NomeEmpregado,
d.NomeDepartamento
from Empregado a
inner join Departamento d on a.IDDepartamento= d.IDDepartamento;

--2)Exibir o nome do associado e sua cidade, exibir tamb�m associados sem Cidade relacionada.

select a.Nome, c.Nome
from Associado a
left join Cidade c on a.IDCidade=c.IDCidade ;

--3)Lista os estados (UF) e total de cidades que n�o possuem associados relacionados 
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

--4)Fa�a uma consulta que liste o nome do associado, o nome da cidade,
-- e uma coluna que indique se a cidade � da regi�o SUL (RS, SC, PR),
-- se for imprimir *** (3 asteriscos), sen�o imprimir nulo.

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

--6)Fa�a uma c�pia da tabela Empregado e 
--altere o sal�rio de todos os empregados 
--que o departamento fique na localidade de SAO PAULO, fa�a um reajuste de 14,5%

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
from EmpregadoCOPIA e
inner join Departamento d on e.IDDepartamento = d.IDDepartamento and d.Localizacao='SAO PAULO'

select Localizacao
from Departamento

--7)Liste a diferen�a que representar� o reajuste aplicado no item 
--anterior no somat�rio dos sal�rios de todos os empregados.

select e.NomeEmpregado,
e.Salario as salarioAtual,
ec.Salario as salarioAntigo,
e.Salario-ec.Salario as diferencaSalario
from Empregado e
inner join Departamento d on e.IDDepartamento = d.IDDepartamento and d.Localizacao='SAO PAULO'

inner join EmpregadoCOPIA ec on ec.IDDepartamento = d.IDDepartamento and d.Localizacao='SAO PAULO'


--8)Liste o departamento que possui o empregado de maior sal�rio.
select top 1 d.nomedepartamento, e.salario
from departamento d
inner join empregado e on e.IDDepartamento=d.IDDepartamento
order by e.salario desc;

--9)Fa�a uma consulta para exibir o nome de cada associado 
--e sua cidade e juntamente com os empregados (nome) e a cidade 
--(localidade) de seu departamento, isto deve ser exibido em uma consulta.
select a.nome, c.nome
from associado a, cidade c
where a.IDCidade=c.IDCidade
union all
select e.NomeEmpregado ,d.Localizacao
from  empregado e, departamento d
where e.IDDepartamento=d.IDDepartamento;

--10)Lista as cidades que tenham associado relacionado.
select cidade.nome
from cidade
inner join associado on associado.IDCidade=cidade.IDCidade;



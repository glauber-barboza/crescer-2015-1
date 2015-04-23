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
Where EXISTS(Select *
From Associado a
Where ISNULL(a.IDCidade,0) = 0)
Group by e.UF
Order by Contador Desc


delete from Associado where IDAssociado=3


 --busca auxiliar
select * from Associado
select * from Cidade

--4)Fa�a uma consulta que liste o nome do associado, o nome da cidade,
-- e uma coluna que indique se a cidade � da regi�o SUL (RS, SC, PR),
-- se for imprimir *** (3 asteriscos), sen�o imprimir nulo.

select a.Nome, c.Nome,
case when c.UF in ('RS','SC','PR') then '*'
end E_do_sul_tche
	
from Associado a

inner join Cidade c on a.IDCidade=c.IDCidade ;


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





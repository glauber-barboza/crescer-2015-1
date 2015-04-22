
-- 1)Fa�a uma consulta (query) que retorne apenas o primeiro nome do Associado (tabela associado).
Select Substring(nome,1,Charindex(' ', nome) - 1) as primeiro_nome from Associado


--2)Fa�a uma consulta que retorne o nome dos associados e a idade
-- de cada um (em anos, exibir um n�mero inteiro).

Select nome, DataNascimento, DateDiff(YEAR, DataNascimento, getdate()) as idade
from Associado;

--3)Fa�a uma consulta que liste os empregados admitidos entre 01/05/1980 e 20/01/1982.
-- Exibir tamb�m o total de meses de trabalho at� a data de 31/12/2000.


select NomeEmpregado, DataAdmissao, DateDiff(MONTH, DataAdmissao, '31/12/2000') as Messes_de_trabalho  
from Empregado
	where DataAdmissao >='01/05/1980' 
	and DataAdmissao <='20/01/1982'

--4)Qual o cargo (tabela empregado) possuir mais empregados?

select top 1 Cargo,
count(Cargo) as Maximo
from Empregado
group by Cargo
order by Maximo desc

 
--5)Qual � o associado de maior nome (n�mero de caracteres) ?
 
select top 1 Nome
from Associado
order by LEN(nome) desc --len retorna o numero de caracteres
 
--6)Fa�a uma consulta que retorne o nome do associado
--  e a data de quando cada completar� (ou completou) 50 anos, liste tamb�m o dia da semana.
 
select Nome, convert(date, (dateadd(YEAR, 50, DataNascimento))) as Data50Anos,
  datename(dw, dateadd(YEAR, 50, DataNascimento)) as Dia_Semana

from Associado
--7)Liste a quantidade de cidades agrupando por UF.
select UF, count(1) Numero_Cidades
from Cidade
group by UF
 
 
--8)Liste as cidades que possuem o mesmo nome e UF.
select Nome, UF
from Cidade
group by Nome, UF
having count(1) > 1
 
--9)Identifique qual deve ser o pr�ximo ID para a 
--  cria��o de um novo registro na tabela Associado (maior + 1).

select max(IDAssociado)+1
from Associado
 
--10)Limpe a tabela CidadeAux, e insira somente as cidades com nomes e UF�s distintos, 
-- considere somente o menor c�digo ID das cidades duplicadas.
 
truncate table CidadeAux;
insert into CidadeAux(Nome, IDCidade, UF) select distinct Nome, IDCidade, UF from Cidade;
 
select Nome, UF, count(1)
from CidadeAux
group by Nome, UF
having count(1) > 1
 
insert into CidadeAux(IDCidade, Nome, UF) 
select IDCidade, Nome, UF from Cidade;

--11 nao pronto
--11)Altere todas cidades duplicadas (nome e uf iguais), acrescente no �nicio do nome um asterisco (*).
select  Nome
from Cidade
group by Nome
having count(1) > 1


-- 12)Fa�a uma consulta que liste o nome do Associado e a descri��o da coluna Sexo,
-- informando: Masculino ou Feminino.

select IDAssociado,
Nome,
Case when sexo = 'F' then 'Feminino'
when sexo = 'M' then 'Masculino'
else 'sei l�'
End Genero
from associado;
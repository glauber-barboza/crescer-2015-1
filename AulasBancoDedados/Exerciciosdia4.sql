
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

Select top 1 Cargo,
COUNT(1) as Total
From Empregado
Group By Cargo desc;

--5)Qual � o associado de maior nome (n�mero de caracteres) ?


--1) Identifique e liste quantos valores diferentes est�o 
--definidos para a coluna Situacao da tabela Produto (somente os distintos valores).
select distinct situacao
from produto;


--2) Liste todos os clientes que tenham o LTDA no nome ou razao social.
select RazaoSocial 
from cliente
where RazaoSocial like '%Ltda%'
    or razaosocial like '%Ltda%';


--3) Crie (insira) um novo registro na tabela de Produto, com as seguintes informa��es:
--Nome: Galocha Maragato
--Pre�o de custo: 35.67
--Pre�o de venda: 77.95
--Situa��o: A

--select auxiliar
select * from Produto
--resolu��o ex
insert into produto
(nome, PrecoCusto, PrecoVenda, Situacao)
values
('Galocha Maragato',35.67,77.95,'A');


--4) Identifique e liste os produtos que n�o tiveram nenhum pedido,
-- considere os relacionamentos no modelo de dados, pois n�o h� relacionamento 
--direto entre Produto e Pedido (ser� preciso relacionar PedidoItem).
--Obs.: o produto criado anteriormente dever� ser listado.

select * 
from produto
where not exists (select 1
		from PedidoItem
		where PedidoItem.IDproduto=produto.IDproduto);


--5) Identifique qual o estado (coluna UF da tabela Cidade) possu� o maior n�mero de clientes 
--(tabela Cliente), liste tamb�m qual o Estado possu� o menor n�mero de clientes.
--Dica: pode (n�o � obrigat�rio) ser utilizado subquery, e tamb�m UNION.

create view v_numero_clientes_maior as
select top 1 with ties count(*) numerosClientes, Cidade.UF
from cidade, cliente
where cliente.idcidade=cidade.idcidade
group by Cidade.UF
order by numerosClientes desc;

create view v_numero_clientes_menor as
select top 1 with ties count(*) numerosClientes, Cidade.UF
from cidade
inner join cliente on cliente.idcidade=cidade.idcidade
group by Cidade.UF
order by numerosClientes asc;

select * from v_numero_clientes_maior
union all
select * from v_numero_clientes_menor;


--6) Liste o total de cidades (distintas) que possuem clientes que realizaram algum pedido.
--Dica: ser� preciso relacionar Cidade com Cliente, e Cliente com Pedido.

select count(*) total_cidade
from cidade
inner join cliente on cliente.idcidade=cidade.idcidade
inner join pedido on cliente.idcliente=pedido.idcliente


--7) Dentro da atual estrutura, cada produto � composto por 1 ou v�rios materiais 
--(tabela ProdutoMaterial). Identifique se existe algum produto sem material relacionado.
--Obs.: o produto criado anteriormente dever� ser listado.
select *
from produto 
where not exists(select 1
				from ProdutoMaterial
				where produto.IDProduto=ProdutoMaterial.IDProduto);


--8) Liste os produtos, com seu pre�o de custo, e relacione com seus os materiais 
--(ProdutoMaterial), e liste tamb�m o somat�rio do PrecoCusto de todos seus materiais. Veja um exemplo abaixo:
select produto.idproduto, 
		produto.nome,
		sum(produto.PrecoCusto) as PrecoCusto_RS, 
		sum(produto.precovenda) as PrecoCusto_Material_RS
from produto, ProdutoMaterial
where produto.IDProduto=ProdutoMaterial.IDProduto
group by produto.idproduto, produto.nome;

--9			
select * 
from v_produto_soma
where PrecoCusto < SomaMaterial;		

begin transaction

update produto
set PrecoCusto=(select isnull (sum(material.PrecoCusto*ProdutoMaterial.Quantidade),0) as SomaMaterial
					from ProdutoMaterial,Material
					where ProdutoMaterial.IDMaterial=Material.IDMaterial
					and produto.IDProduto=ProdutoMaterial.IDProduto)


--10) Liste os clientes que tenham o mesmo nome 
--(Tabela Cliente, registros com o nome (apenas) duplicado).
select cliente.nome 
from cliente
group by cliente.nome
having count(*)>1


--11) Lista qual o primeiro nome mais popular entre os clientes, considere apenas o primeiro nome.
select top 1 with ties SUBSTRING(nome,0,charindex(' ',nome)) as NomePopular, count(*) as QtdVezesNome
from cliente 
where SUBSTRING(nome,0,charindex(' ',nome)) in (select SUBSTRING(nome,0,charindex(' ',nome))
												from cliente)
group by SUBSTRING(nome,0,charindex(' ',nome))
order by count(*) desc;


--12) Liste qual o produto � mais vendido (considere a informa��o da quantidade).
select top 1 with ties produto.nome, max(produtomaterial.quantidade) as Quantidade
from produto, ProdutoMaterial
where produto.IDProduto=ProdutoMaterial.IDProduto
group by produto.nome
order by max(produtomaterial.quantidade) desc;

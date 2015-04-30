BEGIN
DECLARE @Nome VarChar(30)
SET @Nome = 'CWI Software'
Print @Nome
END

BEGIN
	DECLARE @vIDCliente int
	
	Select @vIDCliente = IDCliente
	From Cliente
	Where Nome = 'Mariana Ventura Che'
	
	Print 'Mariana possui o código ' +
	Cast(@vIDCliente AS VarChar(10))
END



BEGIN
	SET NOCOUNT ON
	DECLARE @vTamanho int
	
	--Busca o maior nome (caracteres)	
	Select @vTamanho = MAX(Len(Nome))
	from Cliente
	
	--Lista todos os clientes cfe tamanho do nome
	Select IDCliente, Nome
	From Cliente
	Where Len(Nome) = @vTamanho
	
	SET NOCOUNT OFF
END



BEGIN
	DECLARE @vCount int
	Select @vCount = COUNT(1)
	From Cliente

	IF (@vCount=0)
	Print 'Nenhum cliente cadastrado.'

	ELSE IF (@vCount=1)
	Print 'Um registro encontrado.'
	
	ELSE
	Print 'Muitos registros encontrados.'
END



BEGIN
	DECLARE @vCount int
	
	Select @vCount = COUNT(1)
	From Cliente

	IF(@vCount=0) BEGIN
	Print 'Nenhum cliente cadastrado.'
	Print 'Execute o procedimento de carga'
	
	END 
	ELSE IF (@vCount=1)
	Print 'Um registro encontrado.'
	
	ELSE
	Print 'Muitos registros encontrados.'
END

BEGIN
	BEGIN TRY
	Begin Transaction
	Insert into Cidade (IDCidade, Nome, UF)
	Values (1, 'Morro da Pedra', 'RS');
	Commit
	END TRY
	BEGIN CATCH
	Rollback
	Print ERROR_MESSAGE()
	END CATCH
	END
go

BEGIN
	BEGIN TRY
	Declare @vRazaoSocial VarChar(50),
	@vNome VarChar(50)
	
	Set @vRazaoSocial = 'CWI Software Ltda'
	Select @vNome = Nome
	From Cliente
	Where RazaoSocial = @vRazaoSocial
	
	If @@ROWCOUNT= 0 --Numero de linhas do Select anterior
	RAISERROR('Registro "%s" nao foi encontrado!', 16, 1, @vRazaoSocial)
	Print 'Nome encontrado! ['+ @vNome + ']'
	
	END TRY
	
	BEGIN CATCH
	Print 'Error Code: '+ CAST(ERROR_NUMBER() AS VARCHAR(100))
	Print 'Error Text: '+ ERROR_MESSAGE()
	END CATCH
END


--2)Liste as cidades com nome e UF duplicados que tenham clientes relacionados.


BLOCOS ANÔNIMOS -cursores -exemplo
BEGIN
	DECLARE ListaCidade CURSOR
	Local
	Fast_Forward
		FOR Select Nome, Uf
		From Cidade
		where exists (select 1
		from Cidade cid
		inner join Cliente cli on cid.IDCidade=Cli.IDCidade)
		Group by Nome, Uf
		Having COUNT(1) > 1 
		

	DECLARE @vNome varchar(50),
	@vUF varchar(2)

	OPEN ListaCidade;
	FETCH NEXT FROM ListaCidade INTO @vNome, @vUF
	WHILE (@@FETCH_STATUS=0) BEGIN
	Print @vNome + '/'+@vUF;
	FETCH NEXT FROM ListaCidade INTO @vNome, @vUF
	END
	CLOSE ListaCidade;
	DEALLOCATE ListaCidade;
END



--lista sómente a ultima opção
BEGIN
declare @cidades varchar(100)

select @cidades=c.Nome
from Cidade c
where exists (select 1
				from Cliente c 
				inner join Cidade u on c.IDCidade=u.IDCidade )
				print @cidades 
END


select Nome, count(Nome),UF ,count(UF)
from Cidade
group by nome, uf

--

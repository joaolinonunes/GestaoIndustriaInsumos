CREATE TABLE usuario
	(cep INTEGER,
	 cidade VARCHAR(30),
	 nro INTEGER,
	 rua VARCHAR(20),	
	 cpf VARCHAR(14),
	 senha VARCHAR(8),
	 nome VARCHAR(50),
         email VARCHAR(50),

	 CONSTRAINT pk_usuario PRIMARY KEY (cpf)
	);

CREATE TABLE cliente
	(dataCadastro TIMESTAMP,
	 representa VARCHAR(30),
	 cpf_cli SERIAL VARCHAR(14),

	 CONSTRAINT pk_cliente PRIMARY KEY (cpf_cli),
	 CONSTRAINT fk_cliente_usuario FOREIGN KEY (cpf_cli) REFERENCES usuario ON UPDATE CASCADE ON DELETE CASCADE
	);

CREATE TABLE funcionario
	(cargo VARCHAR(20),
	 dataContratacao TIMESTAMP,
	 cpf_func SERIAL VARCHAR(14),

	 CONSTRAINT pk_func PRIMARY KEY (cpf_func),
	 CONSTRAINT fk_func_usuario FOREIGN KEY (cpf_func) REFERENCES usuario ON UPDATE CASCADE ON DELETE CASCADE
	);

CREATE TABLE pedido
	(dataPedido TIMESTAMP,
	 idPedido SERIAL VARCHAR(10),
	
	CONSTRAINT pk_pedido PRIMARY KEY (idPedido)
	);

CREATE TABLE produto
	(valorProd NUMERIC(10),
	 tempFabric NUMERIC(10),
	 idProd serial NOT NULL,
	 nomeProd VARCHAR(80),
	 altura NUMERIC(10),
	 comprimento NUMERIC(10),
	 largura NUMERIC(10),
	 quantEstoque INTEGER, 

	 CONSTRAINT pk_produto PRIMARY KEY (idProd) 
	);
	
CREATE TABLE matPrima
	(idMatPrima SERIAL VARCHAR(10),
	 quantidade INTEGER,
	 descricao VARCHAR(15),
	 altura NUMERIC(10),
	 largura NUMERIC(10),
	 comprimento NUMERIC(10),

	 CONSTRAINT pk_matPrima PRIMARY KEY (idMatPrima)
	);
	
CREATE TABLE peca
	(nomePeca VARCHAR(15),
	 quantEstoque INTEGER,
	 idPeca SERIAL VARCHAR(10),
	 altura NUMERIC(10),
	 largura NUMERIC(10),
	 comprimento NUMERIC(10),
	 idMatPrima VARCHAR(10),

	 CONSTRAINT pk_peca PRIMARY KEY (idPeca),
	 CONSTRAINT fk_peca_matPrima FOREIGN KEY (idMatPrima) REFERENCES matPrima ON DELETE CASCADE ON UPDATE CASCADE
	);

--Multivalorado (Telefone)
CREATE TABLE telefone
	(nroTel SERIAL INTEGER,
	 cpf SERIAL VARCHAR(14),

	 CONSTRAINT pk_telefone PRIMARY KEY (nroTel, cpf),
	 CONSTRAINT fk_telefone_usuario FOREIGN KEY (cpf) REFERENCES usuario ON DELETE CASCADE ON UPDATE CASCADE
	);
	
--Ternario (Relacionamento: Acesso)
CREATE TABLE Clie_Func_Pedi
	(cpf_func SERIAL VARCHAR(14),
	 cpf_cli SERIAL VARCHAR(14),
	 idPedido SERIAL VARCHAR(10),

	 CONSTRAINT pk_Clie_Func_Pedi PRIMARY KEY (cpf_func, idPedido, cpf_cli),
	 CONSTRAINT fk_CpfFunc_CliFuncPedi FOREIGN KEY (cpf_func) REFERENCES funcionario ON DELETE CASCADE ON UPDATE CASCADE,
	 CONSTRAINT fk_CpfCli_CliFuncPedi FOREIGN KEY (cpf_cli) REFERENCES cliente ON DELETE CASCADE ON UPDATE CASCADE,
	 CONSTRAINT fk_idPedido_CliFuncPedi FOREIGN KEY (idPedido) REFERENCES pedido ON DELETE CASCADE ON UPDATE CASCADE
	);
	
--N x N (Relacionamento: gera)
CREATE TABLE pedidoProduto
	(qantCadaProduto INTEGER,
	 idProd SERIAL VARCHAR(10),
	 idPedido SERIAL VARCHAR(10),

	 CONSTRAINT pk_pedidoProduto PRIMARY KEY (idProd, idPedido),
	 CONSTRAINT fk_pePr_produto FOREIGN KEY (idProd) REFERENCES produto ON DELETE CASCADE ON UPDATE CASCADE,
	 CONSTRAINT fk_pePr_pedido FOREIGN KEY (idPedido) REFERENCES pedido ON DELETE CASCADE ON UPDATE CASCADE
	);

--N x N (Relacionamento: tem)
CREATE TABLE produtoPeca
	(qantCadaPeca INTEGER,
	 idPeca SERIAL VARCHAR(10),
	 idProd SERIAL VARCHAR(10),

	 CONSTRAINT pk_produtoPeca PRIMARY KEY (idPeca, idProd),
	 CONSTRAINT fk_prPe_peca FOREIGN KEY (idPeca) REFERENCES peca ON DELETE CASCADE ON UPDATE CASCADE,
	 CONSTRAINT fk_prPe_produto FOREIGN KEY (idProd) REFERENCES produto ON DELETE CASCADE ON UPDATE CASCADE
	);

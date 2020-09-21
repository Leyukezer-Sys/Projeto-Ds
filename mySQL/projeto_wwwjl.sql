CREATE DATABASE Projeto_WWWJL;

USE Projeto_WWWJL;

CREATE TABLE Cliente(
idCliente int not null auto_increment primary key,
nomeCompleto varchar(50) not null,
cpf varchar(20) not null,
rg varchar(50) not null,
idade int,
telefone varchar(50) not null,
carteiraDeTrabalho varchar(50),
pessoaReferencia varchar(50),
numeroPessoaReferencia varchar(50),
lojaDeReferencia varchar(50),
estado varchar(50),
cidade varchar(50),
cep varchar(50),
rua varchar(50),
bairro varchar(50),
numeroResidencial varchar(50),
complementoEndereco varchar(50)
);

CREATE TABLE Funcionario(
idFuncionario int not null auto_increment primary key,
nomeCompleto varchar(50) not null,
cpf varchar(20) not null,
rg varchar(50) not null,
dataDeNascimento varchar(50) not null,
idade int,
telefone varchar(50) not null,
estadoCivil varchar(50),
tipoSanguineo varchar(50),
carteiraDeTrabalho varchar(50),
cnh varchar(50),
categoriaCnh varchar(50),
tituloDeEleitor varchar(50),
cargoDoFuncionario varchar(50),
tempoServiço varchar(50),
dataDeAdmissao varchar(50),
jornadaDeTrabalho varchar(50),
formaDePagamento varchar(50),
agenciaBancaria varchar(50),
salarioAtual float,
nomeDoPai varchar(50),
nomeDaMae varchar(50),
Naturalidade varchar(50),
estado varchar(50),
cidade varchar(50),
cep varchar(50),
rua varchar(50),
bairro varchar(50),
numeroResidencial varchar(50),
complementoEndereco varchar(50)
);

CREATE TABLE Fornecedor(
idFornecedor int not null auto_increment primary key,
nomeFantasia varchar(50),
rasaoSociao varchar(50),
telefone varchar(50),
cnpj varchar(50),
estado varchar(50),
cidade varchar(50),
cep varchar(50),
numero varchar(50),
endereco varchar(50)
);

CREATE TABLE Despesa(
idDispesa int not null auto_increment primary key,
tipoDeRenda varchar(50) not null,
quantidade int,
valorUnitario float,
porcentagemDesconto float,
dataVenda varchar(50),
dataEntrega varchar(50),
valorFinal float(50),
idFornecedor_FK int NOT NULL,
foreign key (idFornecedor_FK) references Fornecedor(idFornecedor)
); 

CREATE TABLE Usuario(
idUsuario int not null auto_increment primary key,
nome varchar(50) not null,
sobreNome varchar(50) not null,
cpf varchar(50) not null,
email varchar(50),
telefone varchar(50),
userName varchar(50) not null,
senha varchar(255) not null,
foto varchar(50),
dataLogin varchar(50),
horarioLogin varchar(50),
idFuncionario_FK int NOT NULL,
foreign key (idFuncionario_FK) references Funcionario(idFuncionario)
);

CREATE TABLE Caixa(
idCaixa int not null auto_increment primary key,
codigo int not null,
periodoInicial varchar(50) not null,
periodoFinal varchar(50),
horarioAbertura varchar(50) not null,
horarioFechamento varchar(50),
venda float,
metaEmpresa float,
valorTotalEntrada float,
valorTotalSaida float,
idUsuario_FK int NOT NULL,
foreign key (idUsuario_FK) references Usuario (idUsuario)
);

CREATE TABLE Produto(
idProduto int not null auto_increment primary key,
codigo int,
nome varchar(50) not null,
tipo varchar(50),
unidade int not null,
preco float,
dataEntrega varchar(50),
marca varchar(50),
cor varchar(50),
modelo varchar(50),
tamanho varchar(50),
avaliacao varchar(50),
idFornecedor_FK int NOT NULL,
foreign key (idFornecedor_FK) references Fornecedor(idFornecedor)
);

CREATE TABLE Venda(
idVenda int not null auto_increment primary key,
desconto float,
idCaixa_FK int NOT NULL,
idCliente_FK int NOT NULL,
foreign key (idCaixa_FK) references Caixa(idCaixa),
foreign key (idCliente_FK) references Cliente(idCliente)
);

CREATE TABLE Venda_Produto(
idVenda_Produto int not null auto_increment primary key,
quantidadeProduto int,
dataDaCompra varchar(50),
valorFinal float,
valorTotalComDesconto float,
idVenda_FK int NOT NULL,
idProduto_FK int NOT NULL,
foreign key (idVenda_FK) references Venda(idVenda),
foreign key (idProduto_FK) references Produto(idProduto)
);
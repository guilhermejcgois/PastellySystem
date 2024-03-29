CREATE TABLE T_Usuario(
	 CodUsuario int NOT NULL AUTO_INCREMENT,
	 LoginUsuario   nvarchar (15) NOT NULL,
	 SenhaUsuario   nvarchar (15) NOT NULL,
	 NivelUsuario   int  NOT NULL,
	PRIMARY KEY (CodUsuario)
);

CREATE TABLE  T_Produto (
	 CodProduto   int  NOT NULL AUTO_INCREMENT,
	 NomeProduto   nvarchar (50) NOT NULL,
	 DescProduto   nvarchar (50) NULL,
	 PrecoProduto   float  NOT NULL,
	PRIMARY KEY (CodProduto)
);

CREATE TABLE  T_Mesa (
	 CodMesa   int  NOT NULL AUTO_INCREMENT,
	 QtdeLugaresMesa   int  NOT NULL,
   MesaReservada bit,  
	PRIMARY KEY (CodMesa)
);

CREATE TABLE  T_DetVenda (
   CodVenda     int NOT NULL,
	 CodProduto   int  NOT NULL,
	 QtdProduto   int  NOT NULL,
   PrecoProduto float NOT NULL
);

CREATE TABLE  T_DetReserva (
	 CodDetReserva   int  NOT NULL AUTO_INCREMENT,
	 CodMesa   int  NOT NULL,
	 TipoReserva   nvarchar (20) NOT NULL,
	PRIMARY KEY (CodDetReserva)
);

CREATE TABLE  T_Cliente (
	 CodCliente   int  NOT NULL AUTO_INCREMENT,
	 DataCadastroCliente   datetime  NOT NULL,
	 NomeCliente   nvarchar (50) NOT NULL,
	 FoneCliente   nvarchar (20) NULL,
	 CelCliente   nvarchar (20) NULL,
	 CodUsuario   int  NOT NULL,
	PRIMARY KEY (CodCliente)
);

CREATE TABLE  T_Venda (
	 CodVenda   int  NOT NULL AUTO_INCREMENT,
	 CodDetVenda   int  NOT NULL,
	 CodCliente   int  NOT NULL,
	 DataVenda   datetime  NOT NULL,
	 TipoVenda   bit  NOT NULL,
	PRIMARY KEY (CodVenda)
);

CREATE TABLE  T_Reserva (
	 CodReserva   int  NOT NULL AUTO_INCREMENT,
	 DataReserva   date  NOT NULL,
	 CodUsuario   int  NOT NULL,
	 HoraInicio   time NOT NULL,
	 HoraFim   time NOT NULL,
	 CodCliente   int  NOT NULL,
	 CodDetReserva   int  NOT NULL,
	PRIMARY KEY (CodReserva)
);

ALTER TABLE  T_Cliente  ADD FOREIGN KEY( CodUsuario )
REFERENCES  T_Usuario  ( CodUsuario );

ALTER TABLE  T_DetReserva  ADD FOREIGN KEY( CodMesa )
REFERENCES  T_Mesa  ( CodMesa );

ALTER TABLE  T_DetVenda  ADD FOREIGN KEY( CodProduto )
REFERENCES  T_Produto  ( CodProduto );

ALTER TABLE  T_Reserva  ADD FOREIGN KEY( CodCliente )
REFERENCES  T_Cliente  ( CodCliente );

ALTER TABLE  T_Reserva  ADD FOREIGN KEY( CodDetReserva )
REFERENCES  T_DetReserva  ( CodDetReserva );

ALTER TABLE  T_Reserva  ADD FOREIGN KEY( CodUsuario )
REFERENCES  T_Usuario  ( CodUsuario );

ALTER TABLE  T_Venda  ADD FOREIGN KEY( CodCliente )
REFERENCES  T_Cliente  ( CodCliente );

ALTER TABLE T_DetVenda ADD FOREIGN KEY(CodVenda)
REFERENCES T_Venda (CodVenda);

ALTER TABLE T_Produto DROP COLUMN `NomeProduto` ,
CHANGE COLUMN `DescProduto` `DescProduto` VARCHAR(50) CHARACTER SET 'utf8' NOT NULL  ;


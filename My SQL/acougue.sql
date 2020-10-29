create database db_cidade_das_carnes;
use db_cidade_das_carnes;

CREATE TABLE tb_categoria(
tipo_categoria int not null auto_increment,
nome varchar(30), 
primary key (tipo_categoria) # não repetir numero
)engine= innodb;

CREATE TABLE tb_produto(
tipo_produto int not null auto_increment,
nome varchar (30),
preco decimal (7,2),
peso varchar (30),
tipo_categoria int ,
primary key (tipo_produto),
constraint fk_produto_tipos foreign key(tipo_categoria) references tb_categoria(tipo_categoria)
) engine= innodb;

insert into tb_categoria (tipo_categoria, nome) values
	(default,'Suina'),
    (default,'Bovina'),
    (default,'Ave');

insert into tb_produto (tipo_produto, nome, preco, peso, tipo_categoria) values
	(default,'Filé de Frango','40.00','Kg',3),
    (default,'Costela Bovina','60.00','Kg',2),
    (default,'Costela Suina','39.99','Kg',1),
    (default,'Linguiça','100.00','Kg',1),
    (default,'bisteca','120.00','Kg',2);
    
    

select * from tb_produto
inner join tb_categoria
where tb_produto.tipo_categoria = tb_categoria.tipo_categoria
and tb_produto.preco > '3' and tb_produto.preco < '60';

select * from tb_produto 
where nome like '%Co%';

select * from tb_produto
where tb_produto.tipo_categoria like 1;




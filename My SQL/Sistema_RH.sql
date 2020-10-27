#criar banco de dados:
create database db_Sistema_RH;
#nomie e chamei o banco:
use db_Sistema_RH;
#criando tabela para danco de dados:
create table colaboradores(
id_registro int not null auto_increment,
nome varchar (30),
nascimento date,
sexo enum ("F", "M", "O" ),
salario decimal (7,2),
primary key (id_registro) # imperdir repetição.

) engine=innodb; # Recuperar.
#Inserindo Dados na tabela:
insert into colaboradores (id_registro, nome, nascimento, sexo, salario) values
 (id_registro, "Janaina", "1995-02-03","F", 1900.00),
  (id_registro, "maria", "1977-02-03","F", 2000.00),
   (id_registro, "Joao", "1998-02-03","M", 25000.00),
    (id_registro, "francisco", "1991-02-03","M", 5000.00),
     (id_registro, "Erick", "1966-02-03","M", 3000.00);
     
     # criando criterio de seleção:
     select * from colaboradores where salario >2000;
     select * from colaboradores where salario <2000;
     





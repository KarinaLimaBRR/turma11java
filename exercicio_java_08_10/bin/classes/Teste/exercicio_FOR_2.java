����   : O  classes/exercicio_FOR_2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lclasses/exercicio_FOR_2; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Digite um número de 1 a 10
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , Este número é par . Este número é ímpar 0 java/lang/StringBuilder 2 .quantidade de vezes que se repete número par 
 / 4  &
 / 6 7 8 append (I)Ljava/lang/StringBuilder;
 / : ; < toString ()Ljava/lang/String; > 1quantidade de vezes que se repete número ímpar 
  @ A  close args [Ljava/lang/String; leia Ljava/util/Scanner; par I n contador impar StackMapTable C 
SourceFile exercicio_FOR_2.java !               /     *� �    
                    	      M     �� Y� � L=666� 2� � !+� '>p� � +� !�� � -� !��
��Ͳ � /Y1� 3� 5� 9� !� � /Y=� 3� 5� 9� !+� ?�    
   :           !  &  ,  7  :  E  O ! e " | # � %    >    � B C    v D E   t F G  & " H G   q I G   n J G  K   6 �   L    �    L   
�   L      M    N
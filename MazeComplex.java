����   3 M  data_structures/hw2/MazeComplex  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this !Ldata_structures/hw2/MazeComplex; main ([Ljava/lang/String;)V 
Exceptions  java/lang/Exception	    java/lang/System   err Ljava/io/PrintStream;  $Error: there aren't three arguments

    java/io/PrintStream    println (Ljava/lang/String;)V
  " # $ exit (I)V	  & '  out ) argument %d : %s

 + - , java/lang/Integer . / valueOf (I)Ljava/lang/Integer;
  1 2 3 printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; 5 data_structures/hw2/Maze
 4 7  8 '(Ljava/lang/String;Ljava/lang/String;)V
 4 : ;  stackEscape
 4 = >  queueEscape args [Ljava/lang/String; 	labyrinth Ldata_structures/hw2/Maze; i I mazePath Ljava/lang/String; queueOutput stackOutput StackMapTable @ 
SourceFile MazeComplex.java !               /     *� �    
                    	                 e*�� � � � !=�  � %(� Y� *SY*2S� 0W�*����*2M*2N*2:� 4Y,� 6L+� 9� 4Y,-� 6L+� <�    
   :             1  :  >  B  G  R   V $ ` % d '    >    e ? @   R  A B   & C D  > ' E F  B # G F  G  H F  I    �   J     K    L
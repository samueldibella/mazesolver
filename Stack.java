����   3 C  data_structures/hw2/Stack  java/lang/Object stack Ljava/util/ArrayList; 	Signature 2Ljava/util/ArrayList<Ldata_structures/hw2/Point;>; isEmpty Z index I <init> ()V Code
      java/util/ArrayList
  	    
     setEmpty (Z)V	     LineNumberTable LocalVariableTable this Ldata_structures/hw2/Stack; push (Ldata_structures/hw2/Point;)V
  $ % & ensureCapacity (I)V
  ( ) * add (Ljava/lang/Object;)Z space Ldata_structures/hw2/Point; pop ()Ldata_structures/hw2/Point;
  0 1 2 get (I)Ljava/lang/Object; 4 data_structures/hw2/Point
  6 7 2 remove output StackMapTable toString ()Ljava/lang/String;
  = : ; ()Z	  @ 	 
 
SourceFile 
Stack.java !                	 
                T     *� *� Y� � *� *� �                                   ! "     e     !*� � #*� +� 'W*Y� `� *� �                            !        ! + ,   - .     �     4*� *� � /� 3L*� *� � 5W*Y� d� *� � *� +�           "  #  $ % & - ' 2 )        4       % 8 ,  9    � 2 3  : ;     2     *� � <�           1               	 >     /     *� ?�           8                      >     *� ?�       
    <  =                 	 
   A    B
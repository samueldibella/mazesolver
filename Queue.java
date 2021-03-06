����   3 ^  data_structures/hw2/Queue  java/lang/Object queue Ljava/util/ArrayList; 	Signature 2Ljava/util/ArrayList<Ldata_structures/hw2/Point;>; isEmpty Z index I <init> ()V Code
      java/util/ArrayList
  	    
     setEmpty (Z)V	     LineNumberTable LocalVariableTable this Ldata_structures/hw2/Queue; enqueue (Ldata_structures/hw2/Point;)V
  $ % & ensureCapacity (I)V
  ( ) * add (Ljava/lang/Object;)Z input Ldata_structures/hw2/Point; dequeue ()Ldata_structures/hw2/Point;
  0 1 2 get (I)Ljava/lang/Object; 4 data_structures/hw2/Point
  6 7 2 remove output StackMapTable peak ()Z	  = 	 
 toString ()Ljava/lang/String; A   C java/lang/StringBuilder
 E G F java/lang/String H I valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 B K  L (Ljava/lang/String;)V
 B N O P append -(Ljava/lang/Object;)Ljava/lang/StringBuilder; R 

 B T O U -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 B W > ? Ljava/lang/String; i getIndex ()I 
SourceFile 
Queue.java !                	 
                T     *� *� Y� � *� *� �                                   ! "     e     !*� *� � #*Y� `� *� +� 'W�                            !        ! + ,    - .     �     .*� � /� 3L*� � 5W*Y� d� *� � *� +�               !  " ' # , &        .       " 8 ,  9    � , 3   : .     6     *� � /� 3�           *               	 ;     /     *� <�           1                      >     *� <�       
    5  6                 	 
   > ?     �     4@L*� =� %� BY+� D� J*� � /� MQ� S� VL�����+�           :  ;  < * ; 2 ?         4       1 8 X   * Y   9   
 �  E!  Z [     /     *� �           C               \    ]
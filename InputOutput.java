����   3 �  data_structures/hw2/InputOutput  java/lang/Object x I y ySize xSize readLocation Ljava/lang/String; outputLocation <init> '(Ljava/lang/String;Ljava/lang/String;)V Code
     ()V	   
 	     LineNumberTable LocalVariableTable this !Ldata_structures/hw2/InputOutput; filePath 
outputPath readFile ()[[Ldata_structures/hw2/Point; 
Exceptions ! java/lang/Exception #  	 % ' & java/lang/System ( ) out Ljava/io/PrintStream;
 + - , java/io/PrintStream . / print (Ljava/lang/String;)V 1 java/io/File
 0 3  /
 0 5 6 7 exists ()Z
 0 9 : 7 canRead < java/io/FileNotFoundException
 ;  ? java/util/Scanner
 > A  B (Ljava/io/File;)V
 > D E F nextLine ()Ljava/lang/String;
 > H I 7 hasNext	  K  
 > M N  close P java/lang/StringBuilder
 R T S java/lang/String U V valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 O 3
 R Y Z [ charAt (I)C
 O ] ^ _ append (C)Ljava/lang/StringBuilder;
 O a b F toString
 R d e f length ()I
 h j i java/lang/Integer k l parseInt (Ljava/lang/String;)I	  n  	  p  	  r 	  t [[Ldata_structures/hw2/Point; v  Insufficient Maze Size: size < 3
   3 y data_structures/hw2/Point	 { } | data_structures/hw2/SpaceType ~  WALL Ldata_structures/hw2/SpaceType;
 x �  � $(Ldata_structures/hw2/SpaceType;II)V	 { � �  EXIT	 { � �  EMPTY � Invalid char in file � Hero Coordinates Outside Maze
 x � � � getSpace !()Ldata_structures/hw2/SpaceType; � Non-Empty Hero Coordinates maze coords 	unparsedX 	unparsedY lineNo 
coordIndex file Ljava/io/File; input Ljava/util/Scanner; redo i j line StackMapTable 	writeFile � File already exists
 + � � / println
 % � � � exit (I)V � Error with File Path � java/io/PrintWriter
 � A
 � -
 � M record output Ljava/io/PrintWriter; getX getY getXSize getYSize 
SourceFile InputOutput.java !                      	     
                 Y     *� *+� *,� �              	                                           �    L"M"N":66� $*� � *� 0Y*� � 2:� 4� � 8� � ;Y� =�� >Y� @:� � CW�� G���*� J� L� >Y� @:		� CM�  � OY� Q� W,� X� \� `:�,� X ��ۄ6
� � OY-� Q� W,
� X� \� `N�

,� c���*-� g� m*� g� o6
� �	� C:+� ;*� c� q*� q� *� J� *� J*� q� sL� 	� L�  Yu� w�6� �� X�      l          T   o   <   x   $+
2� xY� z
� �S� =+
2� xY� �
� �S� %+
2� xY� �
� �S� �  Y�� w��*� q��z�

*� Jd��#*� o*� J� *� m*� q� 	� L�  Y�� w�+*� o2*� m2� �� �� 	� L�  Y�� w�	� L+�       � 9   !  "  #  $  %  &  (  * ) - 9 . A 2 L 3 O 4 U 5 X 3 ` 8 f 9 k < v ? | C  D � E � C � I � J � K � J � N � O � R � T � W � X  [ \ ]  ^% _/ e5 h` ju kx m� n� p� q� s� e� R� {� |� }� ~ 
 � � �    �         � t   �    �    �    �   	 �   )� � �  L� � �  v� � � 	 � ' �  
 � � �  
 � � �  2 � �   �   K � 9   s R R R 0  �  >� & >� � 3 R� *	� �  "   � /            �     H� 0Y*� � 2M,� 4� � $�� �� $+� �� �� � $�� �� �� �Y,� �N-+� �-� ��       2    �  �  �  � " � & � ) � 1 � 5 � > � C � G �    *    H       H �    < � �  > 
 � �  �   	 � ) 0   � f     /     *� m�           �               � f     /     *� o�           �               � f     /     *� q�           �               � f     /     *� J�           �              �    �
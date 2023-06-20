@echo off


 cd com
 cd mycompany
 cd demo
 javac Hello.java
 cd ..
 cd ..
 cd ..
 java com.mycompany.demo.Hello

 cd com
 cd mycompany
 cd oop
 javac Test.java
 cd ..
 cd ..
 cd ..
 java com.mycompany.oop.Test

 cd com
 cd mycompany
 cd util
 javac *.java
 cd ..
 cd ..
 cd ..
 java com.mycompany.util.Demo
 java com.mycompany.util.Hello
 java com.mycompany.util.Test

/*
 * package com.demo.fileHandlingWithThread;
 * 
 * 
 * import java.io.BufferedReader; import java.io.BufferedWriter; import
 * java.io.File; import java.io.FileReader; import java.io.FileWriter; import
 * java.io.IOException;
 * 
 * public class FileThreadSample {
 * 
 * public static void main(String[] args) throws Exception{ // TODO
 * Auto-generated method stub
 * 
 * File writefile = new
 * File("c:\\users\\navee\\desktop\\Display1_File_Output.txt"); BufferedWriter
 * brw = new BufferedWriter(new FileWriter(writefile)); Object o = new Object();
 * for(int index=0; index<5; index++) { FilePrintThread p1 = new
 * FilePrintThread(brw); p1.start(); //Thread.sleep(1000); p1.join(); }
 * brw.close(); }
 * 
 * }
 * 
 * 
 * class FilePrintThread extends Thread{ static int index=0; static
 * BufferedWriter brw;
 * 
 * FilePrintThread(BufferedWriter brw){ this.brw = brw; }
 * 
 * public void run() { print2(); }
 * 
 * 
 * public static synchronized void print2() {
 * 
 * ++index; System.out.println(index); try { brw.write("This is Line number " +
 * index + "\n"); brw.flush(); } catch (IOException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); }
 * 
 * 
 * }
 * 
 * 
 * }
 */
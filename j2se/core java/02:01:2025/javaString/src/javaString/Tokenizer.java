package javaString;

//Demonstration of Java StringTokenizer
import java.util.StringTokenizer;

public class Tokenizer {
 public static void main(String[] args) {
   
     // Input string
     String s = "Hello Geeks how are you";

     // Create a StringTokenizer object 
     // with space as the delimiter
     StringTokenizer st = new StringTokenizer(s, " ");

     // Tokenize the string and print each token
     while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
     }
 }
}

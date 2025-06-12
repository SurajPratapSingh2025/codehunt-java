package javaString;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String s = "Hello World Java";
        StringTokenizer tokenizer = new StringTokenizer(s);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
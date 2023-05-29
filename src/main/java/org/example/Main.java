package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
       JavaStarter javaStarter = new JavaStarter();
       javaStarter.execute("INSERT VALUES " +
                "‘lastName’ = ‘Федоров’ , " +
                "‘id’=3, ‘age’=40, ‘option’=negative, active=true");


    }
}
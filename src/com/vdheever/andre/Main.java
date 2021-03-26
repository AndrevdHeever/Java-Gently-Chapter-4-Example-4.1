package com.vdheever.andre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        Greetings introduction = new Greetings();
        introduction.outputGreeting();
        introduction.close();
    }
}

class Greetings {

    private final BufferedReader keyboard;

    public Greetings(){
        keyboard = new BufferedReader(new InputStreamReader(System.in));
    }

    public void outputGreeting() throws IOException {
        System.out.println("What is your name?\n");
        String name = keyboard.readLine();
        System.out.println("Hello there " + name);
    }

    public void close() throws IOException {
        keyboard.close();
    }

}
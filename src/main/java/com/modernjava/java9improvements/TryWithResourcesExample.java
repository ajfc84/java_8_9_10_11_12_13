package com.modernjava.java9improvements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        Reader inputString = new StringReader("Don't cut any corners");
        BufferedReader bufferedReader = new BufferedReader(inputString);
        try(bufferedReader) {
            System.out.println("bufferedReader.readLine() = " + bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

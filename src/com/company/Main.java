package com.company;

public class Main {

    public static void main(String[] args) {

        Color[] color = Color.values();
        for (Color c : color) {
            System.out.println(c.toString());
        }
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
        Color[] color = Color.values();
        for (Color s : color) {
            System.out.println(s.toString());
        }
    }
}
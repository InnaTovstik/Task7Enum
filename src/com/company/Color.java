package com.company;

public enum Color {
    RED(255, 0, 0),
    GREEN("#00ff00"),
    BLUE("#0000ff"),
    WHITE("#ffffff"),
    BLACK(0, 0, 0);

    private String hex;
    private int r;
    private int g;
    private int b;

    @Override
    public String toString() {
        return "Colors { " + name() + ":  " +
                "hex='" + hex + '\'' +
                ", RGB = " + "("+ r + "," + g +"," + b + ")" +"}";
    }

    Color(String hex) {
        this.hex = hex;
        this.r = findPartRGB(hex.substring(1, 3));
        this.g = findPartRGB(hex.substring(3, 5));
        this.b = findPartRGB(hex.substring(5));
    }

    Color(int r, int g, int b){
        this.hex = "#" +
                findPartHex(r) +
                findPartHex(g) +
                findPartHex(b);
    }

    private static String findPartHex(int partRGB){
        String partHex = Integer.toHexString(partRGB);
        if ( partRGB < 16 )// 16-ричное значение этих чисел начинается с 0
        {
         partHex = "0" + partHex;
        }
       return partHex;
    }

    private static int findPartRGB (String s)
    {
        String digits = "0123456789abcdef";
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }
}

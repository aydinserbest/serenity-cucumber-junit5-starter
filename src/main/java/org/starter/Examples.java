package org.starter;

public class Examples {
    public static void main(String[] args) {
        String regex = "\\d+"; // Bir veya daha fazla rakam
        String text = "12345";
        boolean matches = text.matches(regex); // true döner
    }
}

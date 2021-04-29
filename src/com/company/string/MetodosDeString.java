package com.company.string;

import java.util.Locale;

public class MetodosDeString {
    public static void main(String[] args) {
        String nombre = "Well";
        String traba="trabalenguas";

        System.out.println("nombre.length() " + nombre.length());
        System.out.println("nombre.toUpperCase() "+nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() "+nombre.toLowerCase());
        System.out.println("nombre.equals(\"Well\") = " + nombre.equals("Well"));
        System.out.println("nombre.equalsIgnoreCase(\"Well\") = " + nombre.equalsIgnoreCase("Well"));
        System.out.println("nombre.compareTo(\"Well\") = " + nombre.compareTo("Well"));
        System.out.println("nombre.compareTo(\"Nika\") = " + nombre.compareTo("Nika"));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.indexOf(\"e\") = " + nombre.indexOf("e"));
        System.out.println("nombre.indexOf('E') = " + nombre.indexOf('E'));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        System.out.println("traba.replace(\"a\",\"-\") = " + traba.replace("a","-"));
        System.out.println("traba.lastIndexOf(\"l\") = " + traba.lastIndexOf("l"));
        System.out.println("traba.contains(\"le\") = " + traba.contains("le"));
        System.out.println("traba.startsWith(\"-\") = " + traba.startsWith("-"));
        System.out.println("traba.endsWith(\"tr\") = " + traba.endsWith("tr"));
        System.out.println("traba.trim() = " + traba.trim());

    }
}

package com.company.string;

public class ValidarString {
    public static void main(String[] args) {
        String texto = null;

        boolean isNull = texto == null;
        if(isNull){
            texto = "Curso";
        }
        System.out.println("isNull = " + isNull);
        System.out.println("Texto de prueba" + texto);
        System.out.println("Esta vacio " + texto.isBlank());

    }
}

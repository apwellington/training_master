package com.company.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        var traba = "lalalalal";

        var arr = traba.toCharArray();
        var arr2 = traba.split("a");
        for (var i = 0; i < arr.length; i++) {
            System.out.println("i = " + arr[i]);
        }

        Arrays.stream(arr2).forEach(StringToArray::updateCont);
        System.out.println(cont);
    }

    private static int cont = 0;

    public static void updateCont(String s){
        System.out.println(s);
        cont++;
    }
}

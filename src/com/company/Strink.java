package com.company;

import java.util.ArrayList;
import java.util.List;

public class Strink {

    private static String pair;

    public static String getString(){

        List<String> stringList = new ArrayList<>();
        stringList.add("aa bb cc dd ee ff gg");
        for (String s:stringList) {
             pair = s.toUpperCase();
        }
        return pair;
    }
}

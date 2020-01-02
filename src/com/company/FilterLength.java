package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterLength {

    public static List<Filter> getFilter(){
        return new ArrayList<>(Arrays.asList(
                new Filter("Как "),
                new Filter("то"),
                new Filter("рано"),
                new Filter("на"),
                new Filter("расвете"),
                new Filter("Заглянул"),
                new Filter("в соседний"),
                new Filter(" Сад")
        ));

    }
}

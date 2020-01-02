package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Averege> avereges = Integ.getInteger();
        System.out.println(avereges.stream().mapToDouble(Averege::getAver).average());

       Pair pair = new Pair();
       pair.getUpper();

        List<Filter> filterList = FilterLength.getFilter();
        System.out.println(filterList);
        filterList.stream()
                .filter(u->u.getS().length()==4)
                .map(u->u.getS().toLowerCase())
                .forEach(System.out::print);


    }
}

package com.example.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class practise_1_iterators {
    public static void main(String[] args) {

//

        List<String> lists = new ArrayList<>();
        lists.add("bimarsha");
        lists.add("ghimire");
//

//        using enhanced for each loop

//        for(String all: lists){
//            System.out.println(all);
//        }
//    }
//        using for each loop
//
        lists.forEach((all) -> {
            System.out.println(all);
        });

//        using iterable iterator

        Iterator<String> iterator = lists.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }


}

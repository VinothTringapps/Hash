package org.example;

import java.util.*;
import java.util.logging.*;

public class Treeset {
    public static void main(String[] args) {
        Logger log=Logger.getLogger("TreeSet");
        TreeSet<String> animals=new TreeSet<>();
        animals.add("dog");
        animals.add("cow");
        animals.add("elephant");
        //don't allow Duplicates
        animals.add("cow");
        log.info(String.valueOf(animals));
        TreeSet<String> animals1=new TreeSet<>();
        animals1.add("pandas");
        animals1.add("horses");
        animals1.add("cats");
        log.log(Level.INFO,()->String.valueOf(animals1));
        animals1.addAll(animals);
        log.log(Level.INFO,()->String.valueOf(animals1));
        log.log(Level.INFO,()->String.valueOf(animals1.contains("cow")));
        animals1.remove("cow");
        log.log(Level.INFO,()->String.valueOf(animals1));
        animals1.clear();
        log.log(Level.INFO,()->String.valueOf(animals1));
        log.log(Level.INFO,()->String.valueOf(animals.last()));
        log.log(Level.INFO,()->String.valueOf(animals.first()));


    }
}

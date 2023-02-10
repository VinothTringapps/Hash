package org.example;
import java.util.logging.*;
import  java.util.*;
public class Hashset {
    public static void main(String[] args) {
        Logger log=Logger.getLogger("Hashset");
        HashSet<String> hash=new HashSet<>();
        log.info("Add");
        hash.add("vinoth");
        hash.add("Gopi");
        hash.add("virat");
        log.log(Level.INFO,()->String.valueOf(hash));
        log.info("Remove");
        hash.remove("virat");
        log.log(Level.INFO,()->String.valueOf(hash));
        HashSet<String> hash1=new HashSet<>();
        hash1.add("nitin");
        hash1.add("dhoni");
        hash1.addAll(hash);
        log.log(Level.INFO,()->String.valueOf(hash1));
        hash1.clear();
        log.log(Level.INFO,()->String.valueOf(hash1));

    }
}

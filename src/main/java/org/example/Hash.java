package org.example;

import java.util.*;
import java.util.logging.*;

public class Hash{
    public static void main(String[] args) {
        int choice;
        String name;
        int rollNo;
        HashMap <Integer,String> hash=new HashMap<>();
        hash.put(1,"vi");
        Logger l= Logger.getLogger("Hash");
        System.out.println("Enter the choice :");
        Scanner sc=new Scanner(System.in);
        while(true){
            l.info("1.Add\t2.size\t3.Remove\t4.display\nEnter the Choice :");
             choice= sc.nextInt();

            if(choice==1){
                l.info("Add");

                l.info("Enter the Roll No :");
                rollNo=sc.nextInt();
                sc.nextLine();
                l.info("Enter the Name :");
                 name=sc.nextLine();

                hash.put(rollNo,name);
            }
            else if(choice ==2){
                l.log(Level.INFO,()->"Size ="+hash.size());


            }
            else if(choice ==3){
                l.info("1.value Removal\t 2.Clear\nEnter the Choice :");
                choice=sc.nextInt();


                if(choice==1){
                    l.info("Enter the Value :");
                    rollNo=sc.nextInt();
                    String s=hash.remove(rollNo);
                    l.log(Level.INFO,()->s);
                }
                else {
                    hash.clear();
                }

            }
            else{
                l.info("1.value Display\n 2.Display");
                choice=sc.nextInt();
                sc.nextLine();
                if(choice==1){
                    l.info("Enter the value : ");
                    rollNo=sc.nextInt();
                    String s2=hash.get(rollNo);
                    l.log(Level.INFO,()->s2);
                }

                else {
                    l.log(Level.INFO,()-> String.valueOf(hash));

                }
            }

        }
    }
}
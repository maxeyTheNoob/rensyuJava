package com.company;

import java.util.ArrayList;
import java.util.List;

public class NameList {
    private List names = new ArrayList();
    public synchronized void add(String name){
        names.add(name);
    }
    public synchronized void printAll(){
        for (int i =0;i<names.size();i++){
            System.out.print(names.get(i)+"");
        }
    }
    public static void main(String argsdsd[]){
        final NameList sl = new NameList();
        for(int i =0;i<2;i++){
            new Thread(){
                public void run(){
                    sl.add("a");
                    sl.add("b");
                    sl.add("c");
                    sl.printAll();
                }
            }.start();
        }
    }
}

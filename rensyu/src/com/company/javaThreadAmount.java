package com.company;

public class javaThreadAmount {
    private static Object s = new Object();
    private static int count =0;
    public static void main(String argssss[]){
        for(;;){
            new Thread(new Runnable(){
                public void run(){
                    synchronized(s){
                        count +=1;
                        System.err.println("new thread#"+ count);
                    }
                    for(;;){
                        try{
                            Thread.sleep(1000);
                        }catch(Exception e){
                            System.err.println(e);
                        }
                    }
                }

            }).start();
        }
    }
}

package com.company;

public class NewStringTest {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String a[]){
        NewStringTest nst1 = new NewStringTest();
        NewStringTest nst2 = new NewStringTest();
        nst1.change(nst1.str,nst1.ch);
        System.out.print(nst1.str+"and");
        System.out.println(nst1.ch);
        System.out.println(nst2.Nchange(nst2.str,nst2.ch)+"and"+nst2.ch);
    }
    public  void change(String str, char ch[]){
        str="ok";
        ch[0]='A';
    }
    public String Nchange(String str, char ch[]){
        String Nstr= new String("test");
        str = Nstr;
        ch[0]='A';
        return str;
    }
}

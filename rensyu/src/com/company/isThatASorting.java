package com.company;

public class isThatASorting {
    public static void main(String aaaaaaaaa[]){
        int[] a={2,4,6,8,3,6,9,12};
        doSomething(a,0,a.length-1);
        for(int i=0;i<a.length-1;i++)
            System.out.print(a[i]+" ");
    }
    private static void doSomething(int[]a,int start,int end){
        if(start<end){
            int p=core(a,start,end);
            doSomething(a,start,p-1);
            doSomething(a,p+1,end);
        }
    }
    private static int core(int[]a,int start,int end){
        int x=a[end];
        int i=start;
        for(int j=start;j<=end -1;j++){
            if(a[j]>=x){
                swap(a,i,j);
                i++;
            }
        }swap(a,i,end);
        return i;
    }
    private  static void swap(int[]a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

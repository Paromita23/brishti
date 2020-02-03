package com.hexaware.ftp115;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int sum(int x,int y){
        return x+y;
    }
    
    public static int minArray(int[] x){
        int min=x[0];
        for(int i=1;i<x.length;i++){
            if(min>x[i]){
            min=x[i];
            }
        }
        return min;
    }
    public static int max(int a, int b, int c){
        int m =a;
        if(m<b) {
            m=b;
        } 
        if (m<c){
            m=c;
        }
        return m;
    }
    public static String sayHello() {
        return "Welcome to JUNIT";
    }

    public static boolean even(int x){
        if(x%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}

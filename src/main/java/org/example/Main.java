package org.example;

import javax.xml.namespace.QName;

public class Main {
    public int commonFactors(int a, int b) {
       int sum=0;
       if (a>b){
           for (int i = 1; i <= b; i++) {
               if (a%i==0&&b%i==0)sum++;
           }
       }else
        for (int i = 1; i <= a; i++) {
            if (a%i==0&&b%i==0)sum++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.commonFactors(25,30));






    }
}
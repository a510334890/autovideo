package com.zhang.app.controller;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        test test = new test();
        List math = test.getMath(1, 2, 3, 4, 5, 6);
        System.out.println(math);
    }
   public List getMath(int ... i){
       List a = new ArrayList();
       for (int j = 0; j < i.length; j++) {
           a.add(i[j]);
       }
       return a;
   }


}

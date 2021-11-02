package com.huangjiabin;
/*
    Integer：-128~127 在同一个对象中
*/
public class _03Integer {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        // i1 == i2? true or false
        System.out.println(i1 == i2);//true


        Integer i3 = 128;
        Integer i4 = 128;
        // i3 == i4? true or false
        System.out.println(i3 ==i4);//true
    }
}

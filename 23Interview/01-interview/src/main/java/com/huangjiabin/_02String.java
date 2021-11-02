package com.huangjiabin;

/*
    "" 常量池
    new 栈
*/
public class _02String {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        // S1 == S2? true or false
        System.out.println(s1==s2); //false

        String s3 = s1.intern(); //找常量池中是否存在该字符串，如果存在返回指向字符串常量池的引用
        //s2 == s3? true or false
        System.out.println(s2==s3); //true
    }
}

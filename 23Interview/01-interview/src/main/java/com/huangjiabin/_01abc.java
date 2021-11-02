package com.huangjiabin;

import java.lang.reflect.Field;

/*
    在中间可以添加N行代码但必须保证s引用的指向不变，最终将输出变成abcd
*/
public class _01abc {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = new String("abc");
        Field field = s.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(s,"abcd".toCharArray());
        System.out.println(s);
    }

}

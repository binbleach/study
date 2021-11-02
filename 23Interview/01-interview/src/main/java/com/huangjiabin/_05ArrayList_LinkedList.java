package com.huangjiabin;

import java.util.ArrayList;
import java.util.LinkedList;

/*
    ArrayList：数组，查询快。直接从后面增加元素也挺快的，不过要是涉及到指定下标和扩容就慢了
    LinkedList:链表，增 删快，额外实现了Deque接口是双端队列
*/
public class _05ArrayList_LinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");//可能涉及扩容
        arrayList.add(3,"1");//可能涉及扩容移动

        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add(3,"1");

        System.out.println(arrayList);
        System.out.println(linkedList);
    }
}

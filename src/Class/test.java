package Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Girl g = new Girl("关晓彤",100);
        Boy l = new Boy("鹿晗",175);
        g.love(l);
        g.tall();

        //下面使无关的
        HashMap<String,Integer> map = null;
        List<Map> list = new ArrayList();
        for(int i =0;i<3;i++){
            map = new HashMap();
            map.put("你好",i);
            list.add(map);
        }
        list.forEach(li-> System.out.println(li));
        //
        System.out.println(2==11/4);

        ArrayList<String> list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("a");
        list1.remove("a");
        //list1.add(3,300);
        for(String a:list1 ){
            System.out.println(a);
        }

    }
}

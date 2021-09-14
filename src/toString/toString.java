package toString;
import Override.Student;
import org.w3c.dom.ls.LSOutput;

public class toString {
    public static void main(String[] args) {
        Student i = new Student(0,"mt",21,17.0);//i是引用数据类型没有重写toString
        System.out.println(i.toString()); // toString来至Object
        System.out.println(i);  //两者结果一支
    }

}

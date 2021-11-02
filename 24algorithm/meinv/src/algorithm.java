public class algorithm {
    public static void main(String[] args) {
        //System.out.println(algorithm.查找重复数字之原地置换());
        /*for (int i : algorithm.冒泡排序()) {
            System.out.print(i);
        }*/
        for (int i : algorithm.插入排序()) {
            System.out.print(i);
        }
    }

    static int[] 冒泡排序(){
        int a[]={3,2,6,4,5,1,3};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    static int[] 插入排序(){
        int a[]={3,2,6,4,5,1,3};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
        return a;
    }

    static int 查找重复数字之原地置换(){   //会有下标越界的风险
        int a[]={3,2,6,4,5,1,3};
        for(int i=0;i<a.length;i++){
            while (a[i]!=i){
                if(a[i]==a[a[i]]){      //如果查到重复数相等返回
                    return a[i];
                }
                int temp=a[i];      //无重复数继续交换
                a[i]=a[a[i]];
                a[temp]=temp;
            }
        }
        return -1;
    }

}

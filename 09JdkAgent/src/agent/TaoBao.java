package agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TaoBao implements InvocationHandler {
    Object target = null;
    public TaoBao(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //不改动源代码UsbKingFactory的情况下功能增强
        int price=(int)method.invoke(target,args);
        price=price+20;
        return price;
    }
}

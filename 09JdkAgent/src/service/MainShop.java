package service;

import agent.TaoBao;
import factory.UsbKingFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        USB factory = new UsbKingFactory();
        InvocationHandler taobao = new TaoBao(factory);
        USB a=(USB) Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),
                taobao);
        System.out.println(a.price(1));
        System.out.println(a.getClass().getName()); //com.sun.proxy.$Proxy0
    }
}

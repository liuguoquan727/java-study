package proxy.dynamic;

import java.lang.reflect.Proxy;
import proxy.IPlay;
import proxy.IService;
import proxy.RealService;
import proxy.statics.RealPlay;

/**
 * Descriptions: 动态代理 https://juejin.im/post/591c5fe5a22b9d0058439333 Created by liuguoquan on
 * 2017/7/30.
 */

public class DynamicProxyDemo {

  public static void main(String[] args) {
    //代理RealService
    IService realService = new RealService();
    IService proxy = (IService) Proxy.newProxyInstance(IService.class.getClassLoader(),
        new Class[] {IService.class}, new SimpleInvocationHandler(realService));
    proxy.sayHello();

    //代理RealPlay
    IPlay realPlay = new RealPlay();
    IPlay proxyPlay = (IPlay) Proxy.newProxyInstance(IPlay.class.getClassLoader(),
        new Class[] {IPlay.class}, new SimpleInvocationHandler(realPlay));
    proxyPlay.play();
  }
}

package com.lgq.study.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Descriptions:动态代理类 编写通用的代理逻辑，用于各种类型的被代理对象
 *
 * Created by liuguoquan on 2017/7/30.
 */

public class SimpleInvocationHandler implements InvocationHandler {

  private Object realObj;

  public SimpleInvocationHandler(Object realObj) {
    this.realObj = realObj;
  }

  /**
   * @param proxy 代理对象本身
   * @param method 正在被调用的方法
   * @param args 表示方法的参数
   * @throws Throwable
   */
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("Enter: " + method.getName());
    //调用实际对象对应方法
    Object result = method.invoke(realObj, args);
    System.out.println("Left: " + method.getName());
    return result;
  }
}

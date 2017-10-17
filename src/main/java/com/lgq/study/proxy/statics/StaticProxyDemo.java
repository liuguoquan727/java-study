package com.lgq.study.proxy.statics;

import com.lgq.study.proxy.IService;
import com.lgq.study.proxy.RealService;

/**
 * Descriptions: 静态代理 Created by liuguoquan on 2017/7/30.
 */

public class StaticProxyDemo {

  public static void main(String[] args) {
    IService service = new RealService();
    IService proxyService = new TraceProxy(service);
    proxyService.sayHello();
  }
}

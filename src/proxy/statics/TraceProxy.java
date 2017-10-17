package proxy.statics;

import proxy.IService;

/**
 * Descriptions:代理类
 *
 * Created by liuguoquan on 2017/7/30.
 */

public class TraceProxy implements IService {

  private IService realService;

  public TraceProxy(IService realService) {
    this.realService = realService;
  }

  @Override
  public void sayHello() {
    System.out.println("Enter");
    realService.sayHello();
    System.out.println("Left");
  }
}

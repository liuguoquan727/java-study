package proxy;

/**
 * Descriptions: 实际对象
 *
 * Created by liuguoquan on 2017/7/30.
 */

public class RealService implements IService {
  @Override
  public void sayHello() {
    System.out.println("Hello World!");
  }
}

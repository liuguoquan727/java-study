package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Descriptions: 反射Demo https://juejin.im/post/5909ef73b123db3ee49d288a Created by liuguoquan on
 * 2017/7/30.
 */

public class ReflectDemo {

  public static final String NAME = "java.util.Date";

  public static void main(String[] args) {
    //获取类的Class对象
    Class<String> myClass = String.class;
    System.out.println(myClass);

    //获取的对象的Class对象╳
    String str = new String();
    Class<? extends String> strClass = str.getClass();
    System.out.println(strClass);

    //根据完整的类路径来获取Class对象
    Class<?> class1 = null;
    try {
      class1 = Class.forName("java.lang.String");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println(class1);

    classForName();

    //ReflectUtil.printConstructs(ReflectDemo.NAME);
    //ReflectUtil.printMethods(ReflectDemo.NAME);
    ReflectUtil.printFields(ReflectDemo.NAME);
    ReflectUtil.printSuperClass("java.lang.reflect.Method");
    ReflectUtil.printIntefaces(ReflectDemo.NAME);
  }

  /**
   * 根据完整的类路径来获取Class对象
   */
  public static void classForName() {

    Class<?> myClass = null;

    try {
      //1.获取Class对象
      myClass = Class.forName("com.liuguoquan.reflect.Student");
      //2.通过Class对象获取Constructor,并传入构造函数的参数类型
      Constructor<?> constructor = myClass.getConstructor(String.class, String.class, int.class);
      constructor.setAccessible(true);
      //3.通过Constructor创建Student对象
      Student student = (Student) constructor.newInstance("liu", "male", 28);
      System.out.println("obj: " + student.toString());

      //只能获取私有方法
      Method method = student.getClass().getMethod("getName");
      String name = (String) method.invoke(student);
      System.out.println(name);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

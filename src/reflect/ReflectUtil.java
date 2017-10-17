package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Descriptions:
 *
 * Created by liuguoquan on 2017/7/30.
 */

public class ReflectUtil {

  /**
   * 获取所有构造函数
   */
  public static void printConstructs(String name) {
    try {
      Class<?> clz = Class.forName(name);

      //Constructor[] constructors = clz.getConstructors(); //获取公有构造函数
      Constructor[] constructors = clz.getDeclaredConstructors();

      for (Constructor constructor : constructors) {
        System.out.println(constructor.toString());
        //类型 public private
        Modifier.toString(constructor.getModifiers());
        Class[] params = constructor.getParameterTypes();
        for (Class param : params) {
          //param.getName(); 参数名
        }
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  /**
   * 获取所有方法
   */
  public static void printMethods(String name) {
    try {
      Class<?> clz = Class.forName(name);

      //Method[] methods = clz.getMethods(); //获取公有方法
      Method[] methods = clz.getDeclaredMethods();

      for (Method method : methods) {
        System.out.println(method.toString());
        System.out.println(Modifier.toString(method.getModifiers()));
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  /**
   * 获取成员变量
   * @param name
   */
  public static void printFields(String name) {
    try {
      Class<?> clz = Class.forName(name);
      //Field[] fields = clz.getFields(); //获取公有成员变量
      Field[] fields = clz.getDeclaredFields();

      for (Field field : fields) {
        System.out.println(field.toString());
        Modifier.toString(field.getModifiers());
        Modifier.isPrivate(field.getModifiers());
        Modifier.isStatic(field.getModifiers());
        Modifier.isFinal(field.getModifiers());
      }

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  /**
   * 获取父类
   * @param name
   */
  public static void printSuperClass(String name) {
    try {
      Class<?> clz = Class.forName(name);

      Class<?> superclass = clz.getSuperclass();

      while (superclass != null) {
        System.out.println(superclass.getName());
        superclass = superclass.getSuperclass();
      }

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  /**
   * 获取接口
   * @param name
   */
  public static void printIntefaces(String name) {
    try {
      Class<?> clz = Class.forName(name);

      Class<?>[] interfaces = clz.getInterfaces();

      for (Class<?> anInterface : interfaces) {
        System.out.println(anInterface.getName());
      }

    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}

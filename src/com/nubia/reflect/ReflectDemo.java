package com.nubia.reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import com.nubia.dao.PersonReflect;
import com.nubia.dao.PersonReflectSon;
import com.nubia.log.LogHandler;
/*
 1、Java反射的概念
 反射含义：可以获取正在运行的Java对象。
 2、Java反射的功能
 1)可以判断运行时对象所属的类
 2)可以判断运行时对象所具有的成员变量和方法
 3)通过反射甚至可以调用到private的方法
 4)生成动态代理
 3、实现Java反射的类
 1)Class：它表示正在运行的Java应用程序中的类和接口
 2)Field：提供有关类或接口的属性信息，以及对它的动态访问权限
 3)Constructor：提供关于类的单个构造方法的信息以及对它的访问权限
 4)Method：提供关于类或接口中某个方法信息
 4、编写Java反射程序的步骤：
 1)必须首先获取一个类的Class对象
 例如：
 Class c1 = Test.class;
 Class c2 = Class.forName(“com.reflection.Test”);
 Class c3 = new Test().getClass();
 2)然后分别调用Class对象中的方法来获取一个类的属性/方法/构造方法的结构
 5反射调用方法，可以通过Method类的invoke方法实现动态方法的调用
 //public Object invoke(Object obj, Object... args)
 //第一个参数代表对象
 //第二个参数代表执行方法上的参数
 //若反射要调用类的某个私有方法，可以在这个私有方法对应的Mehtod对象上先
 调用setAccessible(true)
 6		c1.getField(String fieldName)：得到共有的某个特定的属性对象
 c1.getFields();只能得到共有的
 c1.getDeclaredFields();包括公共、保护、默认（包）访问和私有字段，但不包括继承的字段
 */
public class ReflectDemo {
    private static String message = null;
    public static void main(String[] args) throws Exception {
        // 获取一个类的Class对象
        Class<?> c1 = PersonReflect.class;
        Class<?> c2 = Class.forName("BasicDao.Person_Reflect");
        Class<?> c3 = new PersonReflectSon().getClass();
        // 获取指定的包名
        String packageName1 = c1.getPackage().getName();// out->BasicDao
        String packageName2 = c2.getPackage().getName();// out->BasicDao
        LogHandler.createUnSynInstance(ReflectDemo.class).info("包名为：" + packageName1);
        // 获取类的修饰符
        int mod = c1.getModifiers();
        String modifier = Modifier.toString(mod);
        message = "类的修饰符为：" + modifier + "  " + "mod值为:" + String.valueOf(mod);
        LogHandler.createUnSynInstance(ReflectDemo.class).info(message);
        // 获取指定类的完全限定名
        String className = c1.getName();
        LogHandler.createUnSynInstance(ReflectDemo.class).info("类完全限定名称为：" + className);
        // 获取指定类的父类(向上一级)
        Class<?> superClazz = c3.getSuperclass();
        LogHandler.createUnSynInstance(ReflectDemo.class).info(superClazz.getName());
        // 获取实现的接口集合
        Class<?>[] interfaces = c1.getInterfaces();
        for (Class<?> clazz : interfaces) {
            System.out.print("实现的接口：" + clazz.getName() + " ");
        }
        // 获取指定类的成员变量
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            modifier = Modifier.toString(field.getModifiers());// 每个成员的访问修饰符
            Class type = field.getType();// 获取字段的数据类型所对应的Class对象
            String name = field.getName();// 获取字段名
            if (type.isArray()) {// 如果是数组类型则需要特别处理
                String arrType = type.getComponentType().getName() + "[]";
                LogHandler.createUnSynInstance(ReflectDemo.class).info(
                        modifier + '\t' + arrType + '\t' + name + ";");
            } else {
                LogHandler.createUnSynInstance(ReflectDemo.class).info(
                        modifier + '\t' + type + '\t' + name + ";");
            }
        }
        // 获取类的构造方法
        Constructor[] construct = c1.getDeclaredConstructors();
        for (Constructor c : construct) {
            String name = c.getName();// 构造方法名
            modifier = Modifier.toString(c.getModifiers());// 修饰符
            LogHandler.createUnSynInstance(ReflectDemo.class)
                    .info("" + modifier + " " + name + "(");
            Class<?>[] parameters = c.getParameterTypes();// 构造方法的参数
            for (int i = 0; i < parameters.length; i++) {
                if (i > 0){
                    LogHandler.createUnSynInstance(ReflectDemo.class).info(" (");
                }
                if (parameters[i].isArray()) {
                    LogHandler.createUnSynInstance(ReflectDemo.class).info(
                            parameters[i].getComponentType().getName() + "[]");
                } else {
                    LogHandler.createUnSynInstance(ReflectDemo.class).info(parameters[i].getName());
                }
            }
            LogHandler.createUnSynInstance(ReflectDemo.class).info(");");
        }
        LogHandler.createUnSynInstance(ReflectDemo.class).info(
                "-----------------------成员方法---------------------");
        // 获取成员方法 public static void main(String[] args)
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            // 获取修饰符
            modifier = Modifier.toString(method.getModifiers());
            // 获取是否静态
            // 获取返回值类型
            Class<?> returnType = method.getReturnType();
            if (returnType.isArray()){
                LogHandler.createUnSynInstance(ReflectDemo.class).info(
                        returnType.getComponentType().getName() + "[]");
            } else{
                LogHandler.createUnSynInstance(ReflectDemo.class).info(returnType.getName());
            }
            // 成员方法名称
            method.getName();
            // 参数类型和返回值名称
            Class<?>[] pt = method.getParameterTypes();// 参数类型
            for (Class<?> PT : pt) {
                PT.getName();// 参数名称
                PT.getTypeName();
            }
        }
        LogHandler.createUnSynInstance(ReflectDemo.class).info(
                "---------------方法使用--------------------");
        executeMethod(c1);
    }
    /*-----------------------------------------------------------------------------------------*/
    // 方法使用：给类的属性赋值
    static void executeMethod(Class<?> c) throws Exception {
        PersonReflect pr = (PersonReflect) c.newInstance();
        Method method = c.getDeclaredMethod("setName", String.class);
        method.invoke(pr, "tudou");
        LogHandler.createUnSynInstance(ReflectDemo.class).info(pr.getName());
        method = c.getDeclaredMethod("setAge", int.class);// 参数第一个表示方法名称，第二个参数类型
        method.setAccessible(true);
        method.invoke(pr, 20);
        LogHandler.createUnSynInstance(ReflectDemo.class).info(pr.getAge());
    }
}

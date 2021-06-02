package com.xiao.boot;

import ch.qos.logback.classic.db.DBHelper;
import com.xiao.boot.bean.Car;
import com.xiao.boot.bean.Pet;
import com.xiao.boot.bean.User;
import com.xiao.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // 1、返回我们的IOC 容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        // 2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name: names){
            System.out.println("name:"+name);
        }

        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("beanDefinitionCount："+beanDefinitionCount);

        //3、从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件："+(tom01 == tom02));

        //4、com.xiao.boot.config.MyConfig$$EnhancerBySpringCGLIB$$51f1e1ca@1654a892
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user == user1);

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);

        System.out.println("用户的宠物："+(user01.getPet() == tom));

        //5、获取组件
        String[] beanNamesForType = run.getBeanNamesForType(User.class);

        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);

        boolean tom11 = run.containsBean("tom");
        System.out.println("容器中Tom组件："+tom11);//false

        boolean user011 = run.containsBean("user01");
        System.out.println("容器中user01组件："+user011);//true

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件："+tom22);//true

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println("haha："+haha);//true
        System.out.println("hehe："+hehe);//true

        Car car = run.getBean(Car.class);
        System.out.println("car brand："+car.getBrand());
        System.out.println("car price："+car.getPrice());

    }
}



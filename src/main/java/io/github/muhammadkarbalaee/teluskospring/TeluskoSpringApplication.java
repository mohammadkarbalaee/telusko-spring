package io.github.muhammadkarbalaee.teluskospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeluskoSpringApplication {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("main.xml");
    Vehicle vehicle = (Vehicle) applicationContext.getBean("car");
    vehicle.drive();
  }

}

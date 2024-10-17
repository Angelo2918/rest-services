package com.itschool.rest_services;

import com.itschool.rest_services.annotation.Cat;
import com.itschool.rest_services.annotation.Dog;
import com.itschool.rest_services.annotation.RunImideatly;
import com.itschool.rest_services.annotation.VeryImportant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SpringBootApplication
public class RestServicesApplication {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        SpringApplication.run(RestServicesApplication.class, args);
//        Cat cat = new Cat("Stela");
//        Dog dog = new Dog();
//
//        if (cat.getClass().isAnnotationPresent(VeryImportant.class)) {
//            System.out.println("This thing is very important!");
//        } else
//            System.out.println("This thing is not important: (");
//
//        ///using reflection
//
//        for(Method method: cat.getClass().getDeclaredMethods()){
////            if (method.isAnnotationPresent(RunImideatly.class)){
////                method.invoke(cat);
////            }
//       if (method.isAnnotationPresent(RunImideatly.class)){
//           RunImideatly runImideatly = method.getAnnotation(RunImideatly.class);
//
//           for (int i=0;i< runImideatly.times();i++){
//               method.invoke(cat);
//           }
//
//       }
//

       // }


    }
}

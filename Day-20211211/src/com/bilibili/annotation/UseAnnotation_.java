package com.bilibili.annotation;

import com.bilibili.enumDemo.Color;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;

public class UseAnnotation_ {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.bilibili.annotation.methods");
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println("-------------------------");

        ConfigAnno configAnno = aClass.getAnnotation(ConfigAnno.class);
        String className = configAnno.className();
        String methodName = configAnno.methodName();
        System.out.println(className+"-----"+methodName);
    }
}

@OneAnnotation_(color = Color.GREEN)
@ConfigAnno(className = "com.bilibili.annotation.methods", methodName = "method")
class methods{
    @Test
    public void method(){
        System.out.println("test");
    }
}

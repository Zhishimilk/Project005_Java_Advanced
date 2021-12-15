package com.bilibili.threadException;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo01 {
    //原子性
    /**
     *
     * 概述 : 所谓的原子性是指在一次操作或者多次操作中，要么所有的操作全部都得到了执行并且不会受到任何因素的
     * 干扰而中断，要么所有的操作都不执行，多个操作是一个不可以分割的整体。
     */
    //TODO volatile关键字不能保证原子性
    // 解决方案1 : 我们可以给count++操作添加锁，那么count++操作就是临界区中的代码，临界区中的代码一次只能被
    // 一个线程去执行，所以count++就变成了原子操作。
    // 解决方案2 : AtomicInteger
    //                          概述：java从JDK1.5开始提供了java.util.concurrent.atomic包(简称Atomic包)，这个包中的原子操作类提供了一种
    //                          用法简单，性能高效，线程安全地更新一个变量的方式。因为变
    //                          量的类型有很多种，所以在Atomic包里一共提供了13个类，属于4种类型的原子更新方式，分别是原子更新基本类
    //                          型、原子更新数组、原子更新引用和原子更新属性(字段)。本次我们只提到
    //                          使用原子的方式更新基本类型，使用原子的方式更新基本类型Atomic包提供了以下3个类：
    //                          AtomicBoolean： 原子更新布尔类型
    //                          AtomicInteger： 原子更新整型
    //                          AtomicLong： 原子更新长整

}

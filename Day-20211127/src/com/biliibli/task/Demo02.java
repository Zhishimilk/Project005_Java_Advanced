package com.biliibli.task;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
//        双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
//        红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。
//	（要求同色号码不重复、使用HashSet集合实现）

        Random rd = new Random();
        HashSet<ball> balls = new HashSet<>();

        balls.add(new ball("蓝色", rd.nextInt(16)+1));
        while (balls.size() < 7)
            balls.add(new ball("红色", rd.nextInt(33)+1));

        for (ball ball : balls) {
            System.out.println(ball);
        }
    }
}

class ball{
    private String color;
    private int num;

    public ball() {
    }

    public ball(String color, int num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ball{" +
                "color='" + color + '\'' +
                ", num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ball)) return false;
        ball ball = (ball) o;
        return num == ball.num && Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        if(color.equals("蓝色"))
            return 0;
        return Objects.hash(color, num);
    }
}

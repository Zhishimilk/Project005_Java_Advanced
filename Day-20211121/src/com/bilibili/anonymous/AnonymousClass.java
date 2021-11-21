package com.bilibili.anonymous;

public class AnonymousClass {
    public static void main(String[] args) {
        new Music() {
            @Override
            public void open() {
                System.out.println("播放音乐");
            }
        }.open();

        new Music() {
            @Override
            public void open() {
                System.out.println("收音机");
            }
        }.open();

        use(new Music() {
            @Override
            public void open() {
                System.out.println("广播");
            }
        });

    }

    public static void use(Music music){
        music.open();
    }
}


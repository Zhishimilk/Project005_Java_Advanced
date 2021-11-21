package com.bilibili.anonymous;

public class MusicalInstrumentsTest {

    public static void main(String[] args) {

        startPlay(new MusicalInstruments() {
            @Override
            public void play(String name) {
                System.out.println(name+"钢琴演奏");
            }
        });

        startPlay(name -> System.out.println(name+"小提琴演奏"));
    }

    public static void startPlay(MusicalInstruments musicalInstrument){
        musicalInstrument.play("demo");
    }
}

@FunctionalInterface
interface MusicalInstruments{
    public abstract void play(String name);
}

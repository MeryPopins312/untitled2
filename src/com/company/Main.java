package com.company;

public class Main {

    public static void main(String[] args) {
        Boss bb = new Boss();
        bb.setBossDamage(66);
        bb.setBossHealth(700);
        bb.setBossDefenceType("Boy");
        System.out.println(bb.getBossDamage() + " " + bb.getBossHealth() + " " + bb.getBossDefenceType() + " ");


    }


    public static void Hero() {
        Hero fire = new Hero(300, 26, "Огонь");
        System.out.println(fire.getHeroHealth() + "" + fire.getHeroDamage() + "" + fire.getHeroSuperPower() + "");
    }

    public static void createHeroes() {
        Hero tank = new Hero(250, 30, "Удар Кулаком");
        Hero snake = new Hero(200, 21, "Ядовитый Кусь");
        Hero witch = new Hero(400, 38, "Магический Шар");

    }

    public static int masH() {

    }


}

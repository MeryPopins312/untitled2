package com.company;

public class Hero {

    private int heroHealth;
    private int heroDamage;
    private String heroSuperPower;

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperPower() {
        return heroSuperPower;
    }


    public Hero(int heroHealth, int heroDamage, String heroSuperPower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperPower = heroSuperPower;
    }

    public Hero(int heroDamage, int heroHealth) {
        this.heroDamage = heroDamage;
        this.heroHealth = heroHealth;
    }
}




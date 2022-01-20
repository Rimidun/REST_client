package com.spring.rest.entity;

public class HeroesDota {

    private int id;
    private String name;
    private String race;
    private String attribute;
    private int damage;

    public HeroesDota() {
    }

    public HeroesDota(String name, String race, String attribute, int damage) {
        this.name = name;
        this.race = race;
        this.attribute = attribute;
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "HeroesDota{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", attribute='" + attribute + '\'' +
                ", damage=" + damage +
                '}';
    }
}

package com.workintech.zoo.entity;

import lombok.Data;

@Data
public class Kangaroo extends Animal {
    private double height;
    private boolean isAgressive;

    public Kangaroo(int id, String name, double weight, GENDER gender, double height, boolean isAgressive) {
        super(id, name, weight, gender);
        this.height = height;
        this.isAgressive = isAgressive;
    }
}
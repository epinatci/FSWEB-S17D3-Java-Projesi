package com.workintech.zoo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Koala extends Animal{
    private int sleepHour;

    public Koala(int id, String name, double weight, GENDER gender, int sleepHour) {
        super(id, name, weight, gender);
        this.sleepHour = sleepHour;
    }
}
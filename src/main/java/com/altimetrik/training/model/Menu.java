package com.altimetrik.training.model;

import javax.persistence.*;

@Entity
@Table
public class Menu {

    @GeneratedValue
    @Id
    private Long id;

    private String type;

    private String info;

    @ManyToOne
    private Restaurant restaurant;

    public Menu() {

    }

    public Menu(Long id, String type, String info) {
        this.id = id;
        this.type = type;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}

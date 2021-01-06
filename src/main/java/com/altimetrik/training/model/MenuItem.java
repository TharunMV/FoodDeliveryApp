package com.altimetrik.training.model;

import javax.persistence.*;

@Entity
@Table
public class MenuItem {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

    private String info;

    private Double price;

    @ManyToOne
    private Menu menu;

    public MenuItem() {

    }

    public MenuItem(Long id, String name, String info, Double price) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                '}';
    }
}

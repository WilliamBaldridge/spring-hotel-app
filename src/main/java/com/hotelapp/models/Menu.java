package com.hotelapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(generator = "menu_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "menu_id", sequenceName = "menu_id")

    private Integer menuId;
    private String menuName;
    private double price;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    @JsonIgnore // will prevent stackoverflow when printing JSON by looping hotels because has connection between these 2 classes
    private Hotel hotel;


    public Menu(String menuName, double price) {
        this.menuName = menuName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                '}';
    }
}

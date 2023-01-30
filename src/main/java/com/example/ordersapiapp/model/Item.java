package com.example.ordersapiapp.model;


import jakarta.persistence.*;
import jdk.jfr.DataAmount;



@Entity
@Table(name ="item_t")
public class Item {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String itemName;
    private Long itemArticle;

    public Item() {
        id = -1;
        itemName = "undefained";
        itemArticle = -1L;
    }

    public Item(String itemName,Long itemArticle) {
        this.itemArticle = itemArticle;
        this.itemName = itemName;
    }

    public Item(Integer id, String itemName, Long itemArticle) {

        this.id = id;
        this.itemName = itemName;
        this.itemArticle = itemArticle;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getItemArticle() {
        return itemArticle;
    }

    public void setItemArticle(Long itemArticle) {
        this.itemArticle = itemArticle;
    }

    @Override
    public String toString(){
        return id + "-" + itemName + "-" + itemArticle;
    }
}



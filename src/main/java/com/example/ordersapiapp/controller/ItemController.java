package com.example.ordersapiapp.controller;

import com.example.ordersapiapp.model.Item;
import com.example.ordersapiapp.model.dao.item.IDaoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")

public class ItemController {

    @Autowired
    private IDaoItem daoItem;


    @GetMapping("/all")
    public List<Item> all() {
        return daoItem.findAll();
    }

    @GetMapping("/get")
    public Optional<Item> get(@RequestParam Integer id) {
        return daoItem.findById(id);
    }

    @PostMapping("/save")
    public Item save(@RequestParam String itemName,
                     @RequestParam Long itemArticle) {

        Item item = new Item(itemName, itemArticle);
        return daoItem.save(item);
    }

    @PostMapping("/update")
    public Item update(@RequestParam Integer id,
                       @RequestParam(required = false) String itemName,
                       @RequestParam(required = false) Long itemArticle) {

        Item item = new Item(id, itemName, itemArticle);
        return daoItem.update(new Item(id,itemName,itemArticle));
    }

    @GetMapping("/ping")
    public String ping() {
        return "item pong";
    }

}

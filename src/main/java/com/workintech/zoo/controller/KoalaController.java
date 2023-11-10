package com.workintech.zoo.controller;

import com.workintech.zoo.entity.GENDER;
import com.workintech.zoo.entity.Koala;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koalas")
public class KoalaController {
    private Map<Integer, Koala> koalas;

    public void init(){
        koalas = new HashMap<>();
        koalas.put(1, new Koala(1, "jack", 25, GENDER.MALE, 18) );
    }

    @GetMapping("/")
    public List<Koala> findAll(){
        return koalas.values().stream().toList();
    }
    @GetMapping("/{id}")
    public Koala find(@PathVariable int id){
        return koalas.get(id);
    }

    @PutMapping("/{id}")
    public Koala update(@PathVariable int id, @RequestBody Koala koala) {

        if (koalas.containsKey(id)) {
            koalas.put(id, koala);
            return koala;
        } else {
            return save(koala);
        }

    }
    @PostMapping("/{id}")
    public Koala save(@RequestBody Koala koala){
        koalas.put(koala.getId(), koala);
        return koala;
    }

    @DeleteMapping("/{id}")
    public Koala remove(@PathVariable int id){
        return koalas.remove(id);
    }

}
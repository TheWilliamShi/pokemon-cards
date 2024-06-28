package com.example.htmxtestserver.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class MainController {
    @GetMapping
    public String home(Model model) {
        model.addAttribute("pokemonName", "Pikachu");
        return "index";
    }

    @GetMapping("/pokemon")
    public String getPokemon(@RequestParam("name") String name, Model model) {
        model.addAttribute("pokemonName", name);
        return "pokemon";
    }

    @DeleteMapping("/deletePokemon")
    @ResponseBody
    public String deletePokemon() {
        return "";
    }

    @PostMapping("/createPokemon")
    public String createPokemon(@RequestParam("pokemon-name") String name, Model model) {
        model.addAttribute("pokemonName", name);
        return "index :: card";
    }
}

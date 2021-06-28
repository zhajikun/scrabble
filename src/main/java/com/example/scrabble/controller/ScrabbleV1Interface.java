package com.example.scrabble.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
public interface ScrabbleV1Interface {

    @GetMapping(value = "words/{letters}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<String> getScrabble(@PathVariable String letters);

    @GetMapping(value = "search/{letters}", produces = MediaType.APPLICATION_JSON_VALUE)
    boolean searchScrabble(@PathVariable String letters);

}

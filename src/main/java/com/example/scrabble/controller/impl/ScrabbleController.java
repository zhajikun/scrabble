package com.example.scrabble.controller.impl;

import com.example.scrabble.controller.ScrabbleV1Interface;
import com.example.scrabble.service.ScrabbleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ScrabbleController implements ScrabbleV1Interface {

    @Autowired
    private ScrabbleService scrabbleService;

    @Override
    public List<String> getScrabble(String letters) {

        return scrabbleService.getScrabbleList(letters);
    }
}

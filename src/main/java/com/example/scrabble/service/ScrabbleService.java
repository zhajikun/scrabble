package com.example.scrabble.service;

import com.example.scrabble.model.Trie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

@Service
@Slf4j
public class ScrabbleService {

   private Trie trie;
   private String fileName = "dictionary.txt";

    @PostConstruct
    private void initDictionary(){
        System.out.println("reading dict!");
        trie = new Trie();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(line -> {
                System.out.println(line);
                trie.insert(line);

            });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<String> getScrabbleList(String letters){

       log.info("Input word is: " + letters);

        return Arrays.asList("Hello", "World!");
    }

    public boolean searchScrabble(String letters) {

        return trie.search(letters);
    }
}

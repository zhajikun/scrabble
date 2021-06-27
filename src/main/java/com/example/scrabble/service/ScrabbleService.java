package com.example.scrabble.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
@Slf4j
public class ScrabbleService {

   Set<String> dictionarySet;
   private int count = 0;

    @PostConstruct
    private void initDictionary(){
        System.out.println("reading dict!");
        dictionarySet = getDictionarySet();
        count++;
    }

    public List<String> getScrabbleList(String letters){

       log.info("Input word is: " + letters);
     //   return Arrays.asList("Hello ", letters, " ! ");
       List<String> list = new ArrayList<>(dictionarySet);
        return list;
    }

    private Set<String> getDictionarySet(){
        if(null == dictionarySet){
            dictionarySet = new TreeSet<>();
            dictionarySet.add("count: " + count);
            dictionarySet.add("test");
            dictionarySet.add("World");
            dictionarySet.add("Hello");
        }

        return dictionarySet;
    }
}

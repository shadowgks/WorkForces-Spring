package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Reading {
    private ReadingList readingList;
    private List<ReadingList> readignList;
    private Set<Integer> numbers;
    private Map<Integer, String> dataMap;

    //Constructor
    public Reading(ReadingList readingList){}

    // I'm using this methode because i want the first methode run <i doit that in bean>
    public void init(){
        System.out.println("Hello");
    }
    // I'm using this methode because i want the last methode run <i doit that in bean>
    public void destroy(){
        System.out.println("By by");
    }

    //    Setter & Getter Interface ReadingList
    public ReadingList getReadingList() {
        return readingList;
    }
    public void setReadingList(ReadingList readingList) {
        this.readingList = readingList;
    }

    //    Setter & Getter List readignList
    public List<ReadingList> getReadignList() {
        return readignList;
    }
    public void setReadignList(List<ReadingList> readignList) {
        this.readignList = readignList;
    }

    //    Setter & Getter Set numbers
    public Set<Integer> getNumbers() {
        return numbers;
    }
    public void setNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
    }

    //    Setter & Getter Map dataMap
    public Map<Integer, String> getDataMap() {
        return dataMap;
    }
    public void setDataMap(Map<Integer, String> dataMap) {
        this.dataMap = dataMap;
    }
}

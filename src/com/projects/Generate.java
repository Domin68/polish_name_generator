package com.projects;

import java.util.Random;
import java.util.Scanner;

public class Generate {
    //method for generating random gender, and number of data to create
    private void dataCreator(int numberOfExamples, RandomData rndData) {
        Random rnd = new Random();
        for (int i = 0; i < numberOfExamples; i++) {
            if (rnd.nextBoolean()) {
                rndData.createPerson(true);
            } else {
                rndData.createPerson(false);
            }
        }
    }
    //method to use in main file 
    public void run(){
        RandomData rndData = new RandomData();
        rndData.dataFromTxt();
        System.out.print("Set the number of people: ");
        Scanner scan = new Scanner(System.in);
        dataCreator(scan.nextInt(), rndData);
        rndData.getPeople();
    }
    public Generate() {
    }
}


package com.projects;

import java.util.Random;
import java.util.Scanner;

public class Generate {
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


package com.projects;

import java.util.Random;
import java.util.Scanner;

public class Generate {
    /**
     * method is for generating random gender, and amount of examples to create
     * @param numberOfExamples amount of examples
     * @param rndData is for keeping gender random
     */
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

    /**
     * method run() is for running whole project in main
     */
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


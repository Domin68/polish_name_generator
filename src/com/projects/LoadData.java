package com.projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadData {
    /**
     *  Lists for keeping names loaded from .txt files
     */
    private List<String> maleNamesDB = new ArrayList<>();
    private List<String> femaleNamesDB = new ArrayList<>();
    private List<String> surnamesDB = new ArrayList<>();
    /**
     *  path of the .txt files with malenames, femlenames and surnames
     */
    private String maleNamePath = "src/com/projects/MaleNames.txt";
    private String femaleNamePath = "src/com/projects/FemaleNames.txt";
    private String surnamePath = "src/com/projects/Surnames.txt";

    public LoadData() {
    }

    public List<String> getMaleNamesDB() {
        if (femaleNamesDB.isEmpty()) {
            System.out.println("Empty file with male names");
        }
        return maleNamesDB;
    }

    public List<String> getFemaleNamesDB() {
        if (femaleNamesDB.isEmpty()) {
            System.out.println("Empty file with female names");
        }
        return femaleNamesDB;
    }

    public List<String> getSurnamesDB() {
        if (femaleNamesDB.isEmpty()) {
            System.out.println("Empty file with surnames");
        }
        return surnamesDB;
    }


    public String getMaleNamePath() {
        return maleNamePath;
    }

    public void setMaleNamePath(String maleNamePath) {
        this.maleNamePath = maleNamePath;
    }

    public String getFemaleNamePath() {
        return femaleNamePath;
    }

    public void setFemaleNamePath(String femaleNamePath) {
        this.femaleNamePath = femaleNamePath;
    }

    public String getSurnamePath() {
        return surnamePath;
    }

    public void setSurnamePath(String surnamePath) {
        this.surnamePath = surnamePath;
    }

    /**
     *  method dataFromTxt() is responsible for reading .txt file and adding names to Lists
     */
    public void dataFromTxt(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(maleNamePath));
            while (bufferedReader.readLine() != null) {
                maleNamesDB.add(bufferedReader.readLine());
            }
            bufferedReader = new BufferedReader(new FileReader(femaleNamePath));
            while (bufferedReader.readLine() != null) {
                femaleNamesDB.add(bufferedReader.readLine());
            }
            bufferedReader = new BufferedReader(new FileReader(surnamePath));
            while (bufferedReader.readLine() != null) {
                surnamesDB.add(bufferedReader.readLine());

            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}

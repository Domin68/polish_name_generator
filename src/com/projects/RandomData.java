package com.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomData extends LoadData {
    /**
     * List of generated names+surnames
     */
    private List<String> people = new ArrayList<>();

    /**
     * List of surnames for females with ending witch suits for female surname
     */
    private List<String> surnameForFemale = new ArrayList<>();


    public RandomData() {
    }

    public List<String> getSurnameForFemale() {
        return surnameForFemale;
    }

    public List<String> getPeople() {
        for (String person: people) {
            System.out.println(person);
        }
        return people;
    }
    /**
     *  method femaleSurnames() is for changing surnames for females (diffrent forms of surname regarding to gender)
     */
    public void femaleSurnames() {
        String femaleSurname;
        for (int i = 0; i < getSurnamesDB().size(); i++) {
            if (getSurnamesDB().get(i).endsWith("i")) {
                femaleSurname = getSurnamesDB().get(i);
                StringBuilder builder = new StringBuilder(femaleSurname);
                builder.setCharAt(builder.length() - 1, 'a');
                String femaleSurname2 = builder.toString();
                surnameForFemale.add(femaleSurname2);
            } else
                surnameForFemale.add(getSurnamesDB().get(i));
        }
    }
    /**
     * method createPerson() is for generating name+surname and adding it to List
     * @param isMale stands for male or female name + surname
     */

    public void createPerson(boolean isMale) {
        Random rnd = new Random();
        if (isMale) {
            people.add(getMaleNamesDB().get(rnd.nextInt(getMaleNamesDB().size())) + " " + getSurnamesDB().get(rnd.nextInt(getSurnamesDB().size())));
        } else {
            femaleSurnames();
            people.add(getFemaleNamesDB().get(rnd.nextInt(getFemaleNamesDB().size())) + " " + surnameForFemale.get(rnd.nextInt(surnameForFemale.size())));
        }

    }
}


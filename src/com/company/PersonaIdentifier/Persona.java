package com.company.PersonaIdentifier;

import com.company.Minion_Master;

import javax.swing.*;
import java.util.ArrayList;

public class Persona extends Minion_Master {

        //Basic Human attributes
        String name;
        int age;
        String affiliation;
        String gender ;
        String race;
        //Medical Records
        //Public Records?
        //Picture Profile

        //Add to array of known people
        ArrayList<Persona> person = new ArrayList<>();


        public Persona(String name, int age ,String affiliation ,String gender ,String race)
        {
            this.name = name;
            this.age = age;
            this.affiliation = affiliation;
            this.gender = gender;
            this.race = race;
            //this.pic = pic object
        }

        //Getters
        //-------------------------------------------------------------------------------------------------------------

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getAffiliation(){
            return affiliation;
        }

        public String getGender(){
            return gender;
        }

        public String getRace(){
            return race;
        }

        //Setters
        //--------------------------------------------------------------------------------------------------------------

        public void setName(String newName)
        {
            this.name = newName;
        }

        public void setAge(int newAge)
        {
            this.age = newAge;
        }

        public void setAffiliation(String newAffiliation)
        {
            this.affiliation = newAffiliation;
        }

        public void setGender(String newGender)
        {
            this.gender = newGender;
        }

        public void setRace(String newRace)
        {
            this.race = newRace;
        }



}

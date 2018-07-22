package com.company.PersonaIdentifier;

import com.company.Minion_Login;
import com.company.Minion_Master;

import javax.swing.*;
import java.util.ArrayList;

public class PersonMaker extends Minion_Master {

    private String info = null;

    ArrayList<Persona> person = new ArrayList<>();


    //--------------------------------------------------------------------------------------------------------------
    //Get Persona and Set Persona

    //pass in array of persons added and search by name. If name = name of person in list bring forward that person's data
    public void getPerson(String name)
    {
        Persona persona = null;

        for(int i = 0; i < person.size(); i++){
            if(name.equals(person.get(i).getName().toUpperCase()) || name.equals(person.get(i).getName().toLowerCase())){
                persona = person.get(i);
                JOptionPane.showMessageDialog(null, "PERSON: \n \n" +
                        " NAME: " + persona.getName() + " \n" +
                                " AGE: " + persona.getAge() + " \n" +
                                " AFFILIATION: " + persona.getAffiliation() + " \n" +
                                " GENDER: " + persona.getGender() + " \n" +
                                " RACE: " + persona.getRace() + " \n");
            }
        }
    }

    public void addPersona(Persona Person){
        person.add(Person);
    }

    //------------------------------------------------------------------------------------------------------------------

    public void personaInterface(){

        info = JOptionPane.showInputDialog(null, "PERSONA DATABASE \n " +
                " ---------------------- \n What do you wish to do here: \n ---------------------- \n  ADD  \n CHECK \n \n GO TO CATEGORIES");

        if(info.equals("add") || info.equals("ADD")){
            //add to person list
            String name = JOptionPane.showInputDialog(null, "PERSON'S NAME:" );
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "PERSON'S AGE:" ));
            String affiliation = JOptionPane.showInputDialog(null, "PERSON'S AFFILIATION:" );
            String gender = JOptionPane.showInputDialog(null, "PERSON'S GENDER:" );
            String race = JOptionPane.showInputDialog(null, "PERSON'S RACE:" );

            Persona Person = new Persona(name, age, affiliation, gender, race);
            addPersona(Person);
            //set later to edit persons in system
        }

        if(info.equals("CHECK") || info.equals("check")){
            //search for person and bring forward data
            String name = JOptionPane.showInputDialog(null, "SEARCH PERSON'S NAME:" );
            getPerson(name);
        }

        if(info.equals("categories") || info.equals("CATEGORIES") || info.equals("back") || info.equals("BACK")){
            logins.interfaceForUser();
        }

        if(info.equals("logoff") || info.equals("LOGOFF")){
            JOptionPane.showMessageDialog(null, "Logging Off, Goodbye Master");
            System.out.println("Logging Off");
            System.exit(0);
        }

        else{
            personaInterface();
        }


    }

}

package com.company;

import com.company.Minion_Master;
import com.company.PersonaIdentifier.Persona;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Minion_Login extends Minion_Master {

    //------------------------------------------------------------------
    private String logInResponse = "Welcome Avaree";
    private String logInERRORuser = "///////////USERNAME ENTRY FAILED///////////";
    private String logInERRORpass = "///////////PASSWORD ENTRY FAILED///////////";
    private Boolean intializeNest = false;
    private String info = null;
    private String logOff = "log off";

    //Will have to turn each category into an object class to which can be pulled with individual methods related to each
    // respective class (i.e. music = searches database for music related by song name with artist name, suit = diagnostics)


    private String music = "MUSIC";
    private String suit = "SUIT";
    private String persona = "PERSONA";
    private String[] categories = {music, suit, persona};

    //------------------------------------------------------------------

    public void login(String user,String pass)
    {

        if(!user.equals(username)){
            System.out.println(logInERRORuser);
            login(user, pass);
            JOptionPane.showMessageDialog(null, "INVALID USERNAME");
        }
        if(!pass.equals(password)){
            System.out.println(logInERRORpass);
            login(user, pass);
            JOptionPane.showMessageDialog(null, "INVALID PASSWORD");
        }
        if(user.equals(username) && pass.equals(password)){
            JOptionPane.showMessageDialog(null, "Initialization process started:\n Welcome to NEST.");
            System.out.println("Initialization process started:\n  Welcome to NEST.");
            intializeNest = true;
            if(intializeNest = true){
                interfaceForUser();
            }
        }
    }

    public void interfaceForUser() {
        //JOptionPane.showMessageDialog(null, "Please tell us what you desire: ");
        info = JOptionPane.showInputDialog(null, "Please tell us what you desire: \n \n MUSIC \n SUIT \n PERSONA" );
        System.out.println(info);

        for(int i = 0; i < categories.length; i++){


            //String item = categories[i].toString();
            String muse = categories[0].toString();
            String suit = categories[1].toString();
            String pers = categories[2].toString();

            if(info.contains(muse) && !info.equals(muse)){
                int option = JOptionPane.showConfirmDialog(null, "Did you mean " + muse,"Category", 0,1);
                if(option == 0){
                    musics.musicInterface();
                }
                if(option == 1){
                    interfaceForUser();
                }
            }

            if(info.contains(suit) && !info.equals(suit)){
                int option = JOptionPane.showConfirmDialog(null, "Did you mean " + suit,"Category", 0,1);
                if(option == 0){
                    //Will need to buy necessary components to continue with this feature(Body Scanners, BPM readers, Heart tracking, etc)
                    //Initialize suit
                }
                if(option == 1){
                    interfaceForUser();
                }
            }

            if(info.contains(pers) && !info.equals(pers)){
                int option = JOptionPane.showConfirmDialog(null, "Did you mean " + pers,"Category", 0,1);
                if(option == 0){
                    peeps.personaInterface();
                }
                if(option == 1){
                    interfaceForUser();
                }
            }

            if(info.equals(muse.toLowerCase()) || info.equals(muse.toUpperCase())){

                musics.musicInterface();
            }

            if(info.equals(suit.toLowerCase()) || info.equals(suit.toUpperCase())){

                //TAKE TO ITEM'S CATEGORY INTERFACE
            }

            if(info.equals(pers.toLowerCase()) || info.equals(pers.toUpperCase())){
                peeps.personaInterface();
            }

            if(info.equals(logOff.toUpperCase()) || info.equals(logOff.toLowerCase())){

                //eventually when suit name becomes integrated here Master will be suit name
                JOptionPane.showMessageDialog(null, "Logging Off, Goodbye Master");
                System.out.println("Logging Off");
                System.exit(0);
            }

            /*else{
                JOptionPane.showMessageDialog(null, "INVALID DESIRE \n PLEASE ASK AGAIN");
                interfaceForUser();
            }*/
        }
    }
}

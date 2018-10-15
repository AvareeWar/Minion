package com.company;

import com.company.Minion_Master;

import java.util.ArrayList;
import java.util.Scanner;

public class Minion_Commands_Responses extends Minion_Master
{

    //-------------------------------------------------------------------

    //Main system initializer before every command
    String minion = "Minion ";

    
    //-------------------------------------------------------------------
    //Voice commands recognized by bot

    String hello = "hello ";// add minion after Hello

    String userName = "josh";
    String passWord = "base";

    String logIn = "log in";
    String logOff = "log off";
    String shutdown = "shutdown";
    String music = "play song";

    public ArrayList<String> commandAddition(ArrayList<String> list)
    {
            list.add(hello + " " + minion);
            list.add(userName);
            list.add(passWord);
            list.add(minion + " " + logIn);
            list.add(minion + " " + logOff);
            list.add(minion + " " + shutdown);
            list.add(minion + " " + music);
            list.add(minion + " " + shutdown);
            return list;
    }

    //-------------------------------------------------------------------
    //Responses from system after commands

    String user = "Username?";
    String pass = "Password?";

    String welcome = "Welcome, Master";
    String in = "Logging In";
    String off = "Logging Off";
    String muse = "Playing song: "; // integrate Spodify and alexa API
    String sd = "Shutting down";

    public ArrayList<String> responseAddition(ArrayList<String> list)
    {
            list.add(user);
            list.add(pass);
            list.add(welcome);
            list.add(in);
            list.add(off);
            list.add(muse);
            list.add(sd);
            return list;
    }

    public String determineResponse()
    {
        String res = "";
        Scanner stdin = new Scanner(System.in);
        while(stdin.hasNextLine())
        {
            String line = stdin.nextLine();
            //String[] tokens = line.split(" ");
            if(line == logIn)
            {
                res = user + ", " + pass;
            }
            if(line == logOff)
            {
                res = off;
            }
            if(line == hello + " " + minion)
            {
                res = welcome;
            }
            if(line == music)
            {
                res = muse;
            }
            if(line == shutdown)
            {
                res = sd;
            }
        }
        return res;
    }

}

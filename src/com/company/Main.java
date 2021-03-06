package com.company;

import com.sun.java.accessibility.util.Translator;

import javax.swing.*;
import javax.swing.plaf.InternalFrameUI;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application
{

    public static Minion_Master master = new Minion_Master();
    public static Minion_Commands_Responses comres = new Minion_Commands_Responses();
    public static Minion_Login Login = new Minion_Login();


    Button button;

    public static void main(String[] args) {
	// write your code here

        //launch(args);

        String input = JOptionPane.showInputDialog(null, "MINION");
        String users = JOptionPane.showInputDialog(null, "USERNAME?");
        String passes = JOptionPane.showInputDialog(null, "PASSWORD?");

        /*Audio audio = Audio.getInstance();
        InputStream sound = audio.getAudio("This is a test", Language.ENGLISH);
        audio.play(sound);*/


        master.intializeStartup(users, passes, input);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MINION LOGIN");
        button = new Button();
        button.setText("Login");
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public String determineResponse()
    {
        String res = "";
        Scanner stdin = new Scanner(System.in);
        while(stdin.hasNextLine())
        {
            String line = stdin.nextLine();
            if(line == comres.logIn)
            {
                res = comres.user + ", " + comres.pass;
            }
            if(line == comres.logOff)
            {
                res = comres.off;
            }
            if(line == comres.hello + " " + comres.minion)
            {
                res = comres.welcome;
            }
            if(line == comres.music)
            {
                res = comres.muse;
            }
            if(line == comres.shutdown)
            {
                res = comres.sd;
            }
        }
        return res;
    }


}

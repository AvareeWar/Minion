package com.company.SuitPackageInfo;

public class SuitInterface {


    //Preliminary Data display
    public String suitName = null;
    public int suitID = 0;

    //Biometric Data display
    public String suitOwner = null;
    public int heartrate = 0;
    public int bloodPressure = 0;


    public String getSuitName(String suit){
        suit = suitName;
        return suit;
    }

    public int getSuitID(int suit){
        suit = suitID;
        return suit;
    }
}

package com.company;

public class Lection {
    String Name;
    double Starting;
    double Ending;
    public String GetName(){
        return Name;
    }
    public void SetName(){
        this.Name=Name;
    }
    public double GetStarting(){
        return Starting;
    }
    public void SetStarting(){
        this.Starting=Starting;
    }
    public double GetEnding(){
        return Ending;
    }
    public void SetEnding(){
        this.Ending=Ending;
    }
    public String PrintInfo() {
        return Name + ": " + Starting + " - " + Ending;
    }
}

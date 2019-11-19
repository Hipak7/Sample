package com.example.topic1;

public class additionClass {
    private boolean addition;
    private float firstvalue, secondvalue;

    public boolean isAddition() {
        return addition;
    }

    public void setAddition(boolean addition) {
        this.addition = addition;
    }

    public float getFirstvalue() {
        return firstvalue;
    }

    public void setFirstvalue(float firstvalue) {
        this.firstvalue = firstvalue;
    }

    public float getSecondvalue() {
        return secondvalue;
    }

    public void setSecondvalue(float secondvalue) {
        this.secondvalue = secondvalue;
    }

    public float addition(float firstvalue,float secondvalue){

        return firstvalue+secondvalue;

    }


}

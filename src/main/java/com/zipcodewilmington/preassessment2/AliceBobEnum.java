package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    BOB, ALICE;

    public String getCatchPhrase() {
        String strRet = "";
        if(isAlice()){
          strRet = "Hey, my name is " + this.ALICE + "!";
        }
        else if(isBob()){
            strRet = "Hey, my name is " + this.BOB + "!";
        }
        return strRet;
    }

    public boolean isAlice() {
        if (this.equals(ALICE))
            return true;
        else
            return false;
    }

    public boolean isBob() {
        if (this.equals(BOB))
            return true;
        else
            return false;
    }
}

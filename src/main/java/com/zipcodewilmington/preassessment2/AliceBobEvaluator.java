package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    String inputStr;

    public AliceBobEvaluator(String input) {
        this.inputStr = input.toUpperCase();
    }

    public boolean isAlice() {
        if (this.inputStr.equals(AliceBobEnum.ALICE.toString()))
            return true;
        else
            return false;
    }

    public boolean isBob() {
        if(this.inputStr.equals(AliceBobEnum.BOB.toString()))
            return true;
        else
        return false;
    }

}

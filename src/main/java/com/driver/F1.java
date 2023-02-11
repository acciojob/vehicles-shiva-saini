package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super.name = name;
        super.isManual = isManual;
//        super(name,1,2,3,true,"hellp",3);
        setManual(isManual);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = this.getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            super.stop();
            super.currentGear = 1;

        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
            changeSpeed(newSpeed, super.currentDirection);
            if(newSpeed<=50) super.changeGear(1);
            else if(newSpeed<=100) super.changeGear(2);
            else if(newSpeed<=150) super.changeGear(3);
            else if(newSpeed<=200) super.changeGear(4);
            else if(newSpeed<=250) super.changeGear(5);
            else super.changeGear(6);
        }
    }
}

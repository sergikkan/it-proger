package com.itProger;

public class BMW extends Car{
    private boolean isMperfomance=false;

    BMW(boolean isMperfomance, String model,float weight,String color, boolean isWork, short speed){
        super(model, weight, color, isWork);
        this.isMperfomance=isMperfomance;
        this.speed = speed;
    }

    void  printAll(){
        super.printAll();
        String isMPerfomance= this.isMperfomance ? "является" : "не является";
        System.out.println("Машина " + isMPerfomance + " М перфоманс");
        super.engine.drive();
    }

    @Override
    void startEngine() {
        System.out.println("Машина заводится с кнопки");
    }


}

package day03;


public class Curtain {
    public boolean powerState;

    public Curtain() {
        
        this.powerState = false; 
    }

    public void turnOn(){
        if (!powerState) {
            powerState = true;
            System.out.println("Curtain is now ON.");
        }
    }

    public void turnOff() {
        if (powerState) {
            powerState = false;
            System.out.println("Curtain is now OFF.");
        }
    }

    public boolean isOn() {
        return powerState;
    }
}

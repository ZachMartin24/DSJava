
//Zach Martin

class Fan {

    final int Max_Speed = 3;
    int Speed = 0;
    boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        Speed = 0;
    }

    public void increaseSpeed() {
        // increase the speed if the fan is on and below the maximum speed.
        if (isOn && Speed < Max_Speed) {
            Speed = Speed + 1;
        }
    }

    public void decreaseSpeed() {
        // decrease the speed if the fan is on and above minimum speed.
        if (isOn && Speed > 0) {
            Speed = Speed - 1;
        }
    }

    public Object getSpeed() {
        return Speed;
    }
}

public class Class {
    public static void main(String[] args) {
        // create an object using the Fan class.
        Fan fan = new Fan();

        // what's the initial state?
        System.out.printf("Fan is %s, speed = %d%n", fan.isOn() ? "on" : "off", fan.getSpeed());

        // turn on the fan and increase the speed.
        fan.turnOn();
        for (int i = 0; i < 4; i++) {
            System.out.println("Increasing speed");
            fan.increaseSpeed();
            System.out.printf("Fan is %s, speed = %d%n", fan.isOn() ? "on" : "off", fan.getSpeed());
        }

        // decrease the speed and turn off the fan.
        for (int i = 0; i < 3; i++) {
            System.out.println("Decreasing speed");
            fan.decreaseSpeed();
            System.out.printf("Fan is %s, speed = %d%n", fan.isOn() ? "on" : "off", fan.getSpeed());
        }
        fan.turnOff();
        System.out.printf("Fan is %s, speed = %d%n", fan.isOn() ? "on" : "off", fan.getSpeed());

    }
}

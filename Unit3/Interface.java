
interface DeskLamp {
    // Methods to get and set the lamp's state
    public boolean isOn();

    public void turnOn();

    public void turnOff();

    // Methods to adjust the brightness
    public int getBrightness();

    public void increaseBrightness();

    public void decreaseBrightness();
}

class LEDDeskLamp implements DeskLamp {
    private boolean isOn = false;
    private int brightness = 0;

    // Implement interface methods
    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        brightness = 0;
    }

    public int getBrightness() {
        return brightness;
    }

    public void increaseBrightness() {
        if (isOn && brightness < 100) {
            brightness += 10;
        }
    }

    public void decreaseBrightness() {
        if (isOn && brightness > 0) {
            brightness -= 10;
        }
    }
}

public class Interface {
    public static void main(String[] args) {
        // create an object using the LEDDeskLamp class.
        LEDDeskLamp deskLamp = new LEDDeskLamp();

        // what's the initial state?

        System.out.printf("Lamp is %s, brightness = %d%n", deskLamp.isOn() ? "on" : "off",
                deskLamp.getBrightness());

        // turn on the lamp and increase brightness.
        deskLamp.turnOn();
        for (int i = 0; i < 3; i++) {
            System.out.println("Increasing brightness");
            deskLamp.increaseBrightness();
            System.out.printf("Lamp is %s, brightness = %d%n", deskLamp.isOn() ? "on" : "off",
                    deskLamp.getBrightness());
        }
        {

            // decrease brightness and turn off the lamp.
            for (int i = 0; i < 2; i++) {
                System.out.println("Decreasing brightness");
                deskLamp.decreaseBrightness();
                System.out.printf("Lamp is %s, brightness = %d%n", deskLamp.isOn() ? "on" : "off",
                        deskLamp.getBrightness());
            }
            deskLamp.turnOff();
            System.out.printf("Lamp is %s, brightness = %d%n", deskLamp.isOn() ? "on" : "off",
                    deskLamp.getBrightness());

        }
    }
}
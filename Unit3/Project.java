
//Zach Martin
//10-20-23
import java.util.Scanner;

class DoorSystem {
    // Switches
    boolean LeftSwitch = false;
    boolean RightSwitch = false;
    // Handles
    boolean InLeftDoorHandle = false;
    boolean InRightDoorHandle = false;
    boolean OutLeftDoorHandle = false;
    boolean OutRightDoorHandle = false;
    Gearshift currentGear = Gearshift.PARK;

    boolean MasterSwitch = true;

    boolean Childlock = false;

    enum Gearshift {
        PARK, DRIVE, GEAR1, GEAR2, GEAR3, NUETRAL, REVERSE
    }

    public DoorSystem(String initialState) {
        updateState(initialState);
    }

    public void updateState(String newState) {
        if (newState.length() >= 9) {
            if (newState.charAt(0) == '1') {
                LeftSwitch = true;
            } else {
                LeftSwitch = false;
            }
        }
        if (newState.length() >= 9) {
            if (newState.charAt(1) == '1') {
                RightSwitch = true;
            } else {
                RightSwitch = false;
            }
        }
        if (newState.length() >= 9) {
            if (newState.charAt(2) == '1') {
                InLeftDoorHandle = true;
            } else {
                InLeftDoorHandle = false;
            }
        }
        if (newState.length() >= 9) {
            if (newState.charAt(3) == '1') {
                InRightDoorHandle = true;
            } else {
                InRightDoorHandle = false;
            }
        }
        if (newState.length() >= 9) {
            if (newState.charAt(5) == '1') {
                OutRightDoorHandle = true;
            } else {
                OutRightDoorHandle = false;
            }
        }
        if (newState.length() >= 9) {
            if (newState.charAt(4) == '1') {
                OutLeftDoorHandle = true;
            } else {
                OutLeftDoorHandle = false;
            }
        }
        if (newState.length() >= 9) {
            if (newState.charAt(6) == '1') {
                MasterSwitch = true;
            } else {
                MasterSwitch = false;
            }
        }
        if (newState.length() >= 9) {
            if (newState.charAt(7) == '1') {
                Childlock = true;
            } else {
                Childlock = false;
            }
        }
        if (newState.length() >= 9) {
            if (newState.charAt(8) == 'P') {
                currentGear = Gearshift.PARK;
            } else {
                if (newState.charAt(8) == 'D') {
                    currentGear = Gearshift.DRIVE;
                } else {
                    if (newState.charAt(8) == '1') {
                        currentGear = Gearshift.GEAR1;
                    } else {
                        if (newState.charAt(8) == '2') {
                            currentGear = Gearshift.GEAR2;
                        } else {
                            if (newState.charAt(8) == '3') {
                                currentGear = Gearshift.GEAR3;
                            } else {
                                if (newState.charAt(8) == 'N') {
                                    currentGear = Gearshift.NUETRAL;
                                } else {
                                    if (newState.charAt(8) == 'R') {
                                        currentGear = Gearshift.REVERSE;
                                    } else {
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

    }

    public boolean isLeftOpen() {
        // is it park?
        if (currentGear == Gearshift.PARK) {
            // check other conditions.
            if (MasterSwitch == true) {
                if (InLeftDoorHandle == true) {
                    return true;
                } else {
                    if (OutLeftDoorHandle == true) {
                        return true;
                    } else {
                        return false;
                    }
                }
                // check other conditions.
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean isRightOpen() {
        // is it park?
        if (currentGear == Gearshift.PARK) {
            // check other conditions.
            if (MasterSwitch == true) {
                if (InRightDoorHandle == true) {
                    return true;
                } else {
                    if (OutRightDoorHandle == true) {
                        return true;
                    } else {
                        return false;
                    }
                }
                // check other conditions.
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

public class Project {

    public static void main(String[] args) throws Exception {

        String intialState = "10000001P";
        DoorSystem doorSystem = new DoorSystem("00110110P");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print(" Enter a status for the car ( Ex: 01001001P )");
            String Input = scanner.nextLine();

            doorSystem.updateState(Input);

            if (doorSystem.isLeftOpen()) {
                System.out.println("Left door is open.");
            } else {
                System.out.println("Left door is closed.");
            }

            if (doorSystem.isRightOpen()) {
                System.out.println("Right door is open.");
            } else {
                System.out.println("Right door is closed.");
            }

        }

    }
}
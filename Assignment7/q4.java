//package Assignment;
interface Remote {
    void powerOn();
    void powerOff();
    void changeChannel(int c);
}

class Television implements Remote {
    private boolean on = false; 
    private int cc = 0; // Current channel number k liye

    public void powerOn() {
        if (!on) {
            on = true;
            System.out.println("TV is now on");
        } else {
            System.out.println("TV is already on");
        }
    }

    public void powerOff() {
        if (on) {
            on = false;
            System.out.println("TV is off");
        } else {
            System.out.println("TV is alreaady off");
        }
    }

    public void changeChannel(int c) {
        if (on) {
            if (c > 0) { // Ensuring valid channel number
                cc =c;
                System.out.println("Channel changed to " + cc);
            } else {
                System.out.println("Invalid channel number");
            }
        } else {
            System.out.println("Power on the TV first");
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        Television t = new Television();
        t.powerOn();
        t.changeChannel(109);
        t.powerOff();
        t.changeChannel(102); 
    }
}


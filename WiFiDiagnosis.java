import java.util.Scanner;

public class WiFiDiagnosis {

    public static void main( String [] args) {

        String Userinput;
        boolean cont = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
        System.out.println (" First step: reboot your computer\n");
        System.out.println("Are you able to connect with the internet? (yes or no)");
        Userinput = scanner.next();

        if(Userinput.equals("yes") && cont) {
            System.out.println("Rebooting your computer seemed to work");
            cont = false;
        } else if(Userinput.equals("no")) {
            System.out.println("Second step: reboot your router\n");
            System.out.println("Now are you able to connect with the internet? (yes or no)");
            Userinput = scanner.next();
        }

        if(Userinput.equals("yes") && cont) {
            System.out.println("rebooting your router seemed to work");
            cont = false;
        } else if(Userinput.equals("no")) {
            System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\n" +
                    "Now are you able to connect with the internet? (yes or no)\n");
            Userinput = scanner.next();
        }

        if(Userinput.equals("yes") && cont) {
            System.out.println("rebooting your router seemed to work");
            cont = false;
        } else if(Userinput.equals("no")) {
            System.out.println("move your computer closer to your router\n" +
                    "Now are you able to connect with the internet? (yes or no)\n");
            Userinput = scanner.next();
        }

        if(Userinput.equals("yes") && cont) {
            System.out.println("rebooting your router seemed to work");
            cont = false;
        } else if(Userinput.equals("no")) {
            System.out.println("Fifth step: contact your ISP\n" +
                    "Make sure your ISP is hooked up to your router.");
        }

        }



    }


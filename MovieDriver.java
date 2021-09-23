import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class MovieDriver {
    public static void main(String [] args) {
        Scanner myObj = new Scanner(System.in);
        Movie spidermanOne =  new  Movie ();
        System.out.println(" What is the title of the movie");
        spidermanOne.setTitle(myObj.nextLine());
        System.out.println("What is the movie rating");
        String userinputRating = myObj.nextLine();
        spidermanOne.setRating(userinputRating);
        System.out.println(" how many number of tickets sold at the theater");
        int userinputnumber = myObj.nextInt();
        spidermanOne.setSoldTickets(userinputnumber);
        System.out.println(spidermanOne.toString());
             char Userinput = 'y';

        while (Userinput == 'y'){
            Scanner sc=new Scanner(System.in);

            System.out.println(" Enter the movie name");
            spidermanOne.setTitle(sc.nextLine());
            System.out.println(" enter the rating of the movie");
            spidermanOne.setRating(sc.next());
            System.out.println(" enter the number of tickets sold for this movie");
            spidermanOne.setSoldTickets(sc.nextInt());
            System.out.println(spidermanOne.toString());
            System.out.println(" do you want to enter another? + ( y or n)");

            Userinput = sc.next().charAt(0);
            System.out.println("Good bye");
        }


    }
}

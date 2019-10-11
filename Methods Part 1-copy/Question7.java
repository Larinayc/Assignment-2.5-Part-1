import java.util.Scanner;

public class Question7{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ans = "y";

        while (ans.equals("y")){
            int r = 0;
            int sum = 0;

            System.out.print ("How many dice do you want to roll? ");
            int roll = sc.nextInt();
            System.out.print ("How many sides do these dice have? ");
            int sides = sc.nextInt();

            System.out.println (" ");
            System.out.println ("You rolled: ");
            for (int i = 0; i < roll; i ++){
                r = rollDie(sides);
                System.out.println (r + " ");
                sum = sum + r;
            }
            System.out.println (" ");
            System.out.println ("Your total: " + sum);
            System.out.println (" ");

            System.out.println ("Again? [y,n]");
            ans = sc.next();

        }

    }

    public static int rollDie(int n){
        return (int) (Math.random()* n) + 1;
    }
}

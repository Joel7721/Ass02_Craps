import java.util.Scanner;
import java.util.Random;
public class CrapsGame {
    public static void main(String[] args) {

        int sum = 0;
        int newSum = 0;
        int roll1 = 0;
        int roll2 = 0;
        int roll3 = 0;
        int roll4 = 0;
        String trash = "";
        String userResp = "";
        boolean done = false;
        boolean done2 = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Joel Mensah's Craps Game!");
        System.out.println(" ");
        do{

        Random rnd = new Random();

        roll1 = rnd.nextInt(6) + 1;
        roll2 = rnd.nextInt(6) + 1;
        sum = roll1 + roll2;

        System.out.println("Your first roll is a: " + roll1);// + " Your second roll is a: " + roll2);
        System.out.println("Your second roll is a: " + roll2);
        System.out.println("The sum of the two rolls is: " + sum);
        System.out.println(" ");

            if(sum == 2 || sum == 3 || sum == 12){
                System.out.println("You have rolled a craps: " + sum + " You have lost...");
                System.out.println("Do you want to play again [Y/N]");
                userResp = scanner.nextLine();

                if (userResp.equalsIgnoreCase("N")) {
                    done = true;
                } else{
                    done = false;
                }
            }

            if(sum == 7 || sum == 11){
                System.out.println("You have rolled a natural: " + sum + " You have won!");
                System.out.println("Do you want to play again [Y/N]");
                userResp = scanner.nextLine();

                if (userResp.equalsIgnoreCase("N")) {
                    done = true;

                } else{
                    done = false;
                }
            }

            if(sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
                System.out.println("You have rolled the sum of " + sum + " which will now become your point sum.");
                System.out.println(" ");
                do {
                    roll3 = rnd.nextInt(6) + 1;
                    roll4 = rnd.nextInt(6) + 1;
                    newSum = roll3 + roll4;

                    System.out.println("Your first roll in the second set is: " + roll3);
                    System.out.println("Your second roll in the second set is: " + roll4);
                    System.out.println("The sum of the second set of rolls is: " + newSum);
                    System.out.println(" ");

                    if(newSum == 7){
                        System.out.println("You have now rolled the sum of: " + newSum + ". You lose...");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            done = true;
                            done2 = true;
                        } else{
                            done = false;
                            done2 =true;
                        }
                    }
                    else if(newSum == sum){
                        System.out.println("You have now rolled the sum of " + newSum + " which matches your point sum. You Win!");
                        System.out.println("Do you want to play again [Y/N]");
                        userResp = scanner.nextLine();

                        if (userResp.equalsIgnoreCase("N")) {
                            done = true;
                            done2 = true;
                        } else{
                            done = false;
                            done2 =true;
                        }
                    }
                    else {
                        done2 = false;
                    }

                }while(!done2);


            }



        }while(!done);

    }
}

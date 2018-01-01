import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fnum, snum, answer;
        // firstNumber, SecondNumber

        //accepts the following number inputs and stores them
        System.out.println("Enter first number");
        fnum = input.nextDouble();
        System.out.println("Enter Second number");
        snum = input.nextDouble();

        //store answer to addition
        answer = fnum + snum;

        //print out
        System.out.println(answer);
    }
}

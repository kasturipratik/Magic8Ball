package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String answer,question,option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Magic 8 Ball Program\n::::::::::::::::::::::::::::::::::::::::::::::::::");

        System.out.println("\nPlease enter your question for a answer? Enter 'exit' to quit");
        System.out.println("You Asked: ");
        question =scan.nextLine();

    while(!question.equals("exit")){

        Random rn = new Random();
        int magicNumber = 1 + rn.nextInt(20);

            switch (magicNumber) {

                case 1:
                    answer = "It is certain";
                    break;
                case 2:
                    answer = " It is decidedly so";
                    break;
                case 3:
                    answer = "Without a doubt";
                    break;
                case 4:
                    answer = "Yes definitely";
                    break;
                case 5:
                    answer = " You may rely on it";
                    break;
                case 6:
                    answer = " As I see it, yes";
                    break;
                case 7:
                    answer = " Most likely";
                    break;
                case 8:
                    answer = " Outlook good";
                    break;
                case 9:
                    answer = " Yes";
                    break;
                case 10:
                    answer = "Signs point to yes";
                    break;
                case 11:
                    answer = "Reply hazy try again";
                    break;
                case 12:
                    answer = " Ask again later";
                    break;
                case 13:
                    answer = " Better not tell you now";
                    break;
                case 14:
                    answer = " Cannot predict now";
                    break;
                case 15:
                    answer = " Concentrate and ask again";
                    break;
                case 16:
                    answer = " Don't count on it";
                    break;
                case 17:
                    answer = " My reply is no";
                    break;
                case 18:
                    answer = " My sources say no";
                    break;
                case 19:
                    answer = " Outlook not so good";
                    break;
                case 20:
                    answer = " Very doubtful";
                    break;
                default:
                    answer="Hi";
                    break;
            }
            System.out.println("\nMagic 8-Ball Says :"+ answer);
            System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("Do you Have another question for magic ball? (y/n)");
            option = scan.next();
            if(option.equals("y"))
            {
            System.out.println("\nPlease enter a Question for a answer? Enter 'exit' to quit");

            System.out.println("You Asked: ");
            question =scan.nextLine();
        }
        else{
            question="exit";
            }
    }
        System.out.println("Thank You for using the application! Good Bye!!");
    }
}

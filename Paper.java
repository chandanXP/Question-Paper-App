package QuestionPaperApp;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Paper {
    private String StudentName;
    private String StudentId;
    private int ObtainedMarks;
    private int ObtainedMarks1;
    private int ObtainedMarks2;
    private int ObtainedMarks3;
    private int ObtainedMarks4;
    private int TotalMarks = 20;
    private int correctAns = 4;
    private int incorrectAns = -1;
    private String Paperres1;
    private int Yourmarks;

    //create a Constructor which Log in into the Paper
    Paper(String StudentName, String StudentId) {
        this.StudentName = StudentName;
        this.StudentId = StudentId;
        System.out.println("You Are Logged in Successfully!! " + StudentName + " " + StudentId);
        System.out.println("\nRead the instructions carefully\n");
        System.out.println("_______________________________________________________________");
        System.out.println("1. There are Total five questions and each Question is compulsory\n2. You will get 4 marks for each correct Answer\n3. 1 mark will be deducted if answer is wrong");
        //create  a method which start the exam and call it here
        this.Paperres1 = ResponsePaper();
    }


    public String ResponsePaper() {
        System.out.println("\n\n\n");
        System.out.println("Press 1 to Start your Paper\nPress 2 for exit from the paper\nPress 0 for Submit Paper");
        Scanner input = new Scanner(System.in);
        int Press = input.nextInt();
        if (Press == 1) {
            Questions();
        } else if (Press == 0) {
            System.out.println("Your Paper is submitted successfully");
        } else {
            System.out.println("You Are Signed out!!");
        }
        return "Next\n";

    }

    public void Questions() {
        int option = '\0';
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Press 1 to begin your exam!!\n");
            System.out.println("(Press 0 to Submit your Paper without any response)");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("(Q1) Which of the following is not used for the loop Statement.");
                    System.out.println("1. for  2. Switch   3. While    4. Do while");
                    System.out.println("(0 for submit paper)");
                    Scanner resp = new Scanner(System.in);
                    int Response = resp.nextInt();
                    if (Response == 2) {
                        ObtainedMarks = correctAns;
                    } else {
                        ObtainedMarks = incorrectAns;
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("(Q2) Which type of symbol we use for single line comment.");
                    System.out.println("1. break    2.&&    3.//    4.None of the above");
                    System.out.println("(0 for submit paper)");
                    Scanner resp1 = new Scanner(System.in);
                    int Response1 = resp1.nextInt();
                    if (Response1 == 3) {
                        ObtainedMarks1 = correctAns;
                    } else {
                        ObtainedMarks1 = incorrectAns;
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("(Q3) Which of the following method is used  generate a thread in multithreading process.");
                    System.out.println("1. run()     2.sleep()     3.run() and start()     4.start() Only");
                    System.out.println("(0 for submit paper)");
                    Scanner resp2 = new Scanner(System.in);
                    int Response2 = resp2.nextInt();
                    if (Response2 == 4) {
                        ObtainedMarks2 = correctAns;
                    } else {
                        ObtainedMarks2 = incorrectAns;
                    }
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("(Q4) Which of the following is not a access modifier.");
                    System.out.println("1.personal      2.protected     3.default      4.public");
                    System.out.println("(0 for submit paper)");
                    Scanner resp3 = new Scanner(System.in);
                    int Response3 = resp3.nextInt();
                    if (Response3 == 1) {
                        ObtainedMarks3 = correctAns;
                    } else {
                        ObtainedMarks3 = incorrectAns;
                    }
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("(Q5) Which is syntactically incorrect.");
                    System.out.println("1.Scanner   2.Nextint    3.nexInt    4.private");
                    System.out.println("(0 for submit paper)");
                    Scanner resp4 = new Scanner(System.in);
                    int Response4 = resp4.nextInt();
                    if (Response4 == 2) {
                        ObtainedMarks4 = correctAns;
                    } else {
                        ObtainedMarks4 = incorrectAns;
                    }
                    System.out.println("\n");
                    break;
            }
        }
            while (option == 0) ;
                System.out.println("You have submitted your paper without any response");
                System.out.println("Press 'F' to check your result");
                Scanner f=new Scanner(System.in);
                char result=f.next().charAt(0);
                System.out.println("Your Score is: \n");
                System.out.println(ObtainedMarks+ObtainedMarks1+ObtainedMarks2+ObtainedMarks3+ObtainedMarks4);
                System.out.println("Out of "+TotalMarks);

                }
        }







import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trey-
 */
public class Lab2 {
    

public static void main(String[] args)
{
System.out.print("Please Enter 3 test scores  "
);



double test1, test2, test3, averageScore;
char letterGrade = 0;

Scanner sc = new Scanner(System.in);

test1 = sc.nextDouble();
test2 = sc.nextDouble();
test3 = sc.nextDouble();
averageScore = (test1 + test2 + test3)/3;



if (averageScore >= 90 && averageScore <= 100)
{
letterGrade = 'A';
}
else if (averageScore >= 80 && averageScore <= 89)
{
letterGrade = 'B';
}
else if (averageScore >= 70 && averageScore <= 79)
{
letterGrade = 'C';
}
else if (averageScore >= 60 && averageScore <= 69)
{
letterGrade = 'D';
}
else if (averageScore < 60)
{
letterGrade = 'F';
}

System.out.println("Average score: " + averageScore);
System.out.println("Letter grade: " + letterGrade);

sc.close();
}
}
    
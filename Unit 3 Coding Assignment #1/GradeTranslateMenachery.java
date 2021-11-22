/*
Sangeeth Menachery
Exercise 3.4
Grade to gpa converter
*/

import java.util.Scanner;

public class GradeTranslateMenachery

{

private String grade;

private double gpa;

public static void main(String[] args) 
{ 
    
Scanner usergrade = new Scanner(System.in);
System.out.println("Enter a letter grade:");
String grade = usergrade.nextLine();


GradeTranslateMenachery usersgrade = new GradeTranslateMenachery(grade); 

System.out.println(usersgrade.getGrade());
}
public GradeTranslateMenachery(String grade)
{
if(grade.equals("A+"))

{ 
    gpa = 4.0;
}

else if(grade.equals("A"))
{
gpa = 4.0;

}

else if(grade.equals("A-"))

{

gpa = 3.7;
}
else if(grade.equals("B+"))

{ 
    gpa = 3.3;
}

else if(grade.equals("B"))
{
gpa = 3.0;
}
else if(grade.equals("B-"))
{ 
    gpa = 2.7;
}

else if(grade.equals("C+"))
{
gpa = 2.3;
}
else if(grade.equals("C"))
{ 
    gpa = 2.0;
} 
else if(grade.equals("D+"))
{
gpa = 1.3;
}
else if(grade.equals("D"))
{
gpa = 1.0;
}
else if(grade.equals("D-")){
gpa = 0.7;
}
else if(grade.equals("F"))
{
gpa = 0.0;
}
else
{
gpa = -1;
 
}

    
    }
// Method that translates grade. public double getGrade()
public double getGrade()
{
return gpa;
    
    }
    
    }

/*
Sangeeth Menachery
Exercise 3.6
Rock, Paper, Scissors use Math.random
*/

import java.util.Scanner;

class RPSGameMenachery

{ 
public static void main(String[] args) {

String cpuRPS; 
String uRPS = "t";

Scanner RPS = new Scanner(System.in); 
System.out.println("Enter Rock, Paper, Sissor, Spock, or Lizard:"); 
String userRPS = RPS.nextLine();

if(userRPS.equals("Rock")|| userRPS.equals("ROCK")||userRPS.equals("rock"))

{ 
    uRPS = "R";
}

else if(userRPS.equals("Paper")||userRPS.equals("PAPER")||userRPS.equals("paper"))

{ 
    uRPS = "P";
}

else if(userRPS.equals("Scissor")||userRPS.equals("SCISSOR")||userRPS.equals("scissor"))
{
uRPS = "Sc";

}

else if(userRPS.equals("Lizard") || userRPS.equals("LIZARD")||userRPS.equals("lizard"))
{
uRPS = "L";

}

else if(userRPS.equals("Spock")||userRPS.equals("SPOCK") || userRPS.equals("spock"))

{

uRPS = "Sp";
}
else

{ 
    System.out.println("wrong input");
}

int cpu  = (int)(Math.random()*5+1);

if(cpu == 1) 
{
    cpuRPS = "Spock";
}
else if(cpu == 2)

cpuRPS = "Lizards";

else if(cpu == 3)

cpuRPS = "Scissors";

else if (cpu == 4) {
    cpuRPS = "Paper";
}
    
    else  {
        cpuRPS = "Rock";
    }


System.out.println("You picked: "+ userRPS); 

System.out.println("The computer picked: "+ cpuRPS);

if((cpuRPS == "Scissors" && uRPS == "P") 
||(cpuRPS == "Paper" && uRPS == "R")
||(cpuRPS == "Lizards" && uRPS == "Sp") 
||(cpuRPS == "Spock" && uRPS == "Sc")
||(cpuRPS =="Scissors" && uRPS == "L")
||(cpuRPS == "Lizards" && uRPS == "P")
||(cpuRPS == "Paper" && uRPS == "Spock") 
||(cpuRPS == "Spock" && uRPS == "Rock" )
||(cpuRPS == "Rock" && uRPS == "Sc"))
{
System.out.println("You Lost :(");
}
else if(uRPS == "t")

System.out.print("");

else if((cpuRPS == "Scissors" && uRPS == "Sc") ||(cpuRPS == "Paper" && uRPS == "p")

||(cpuRPS == "Spock" && uRPS == "Sp")

||(cpuRPS =="Lizards" && uRPS == "L") || (cpuRPS == "Rock" && uRPS == "R"))

System.out.println("Tiel");

else

System.out.println("You Won :)");

}
}

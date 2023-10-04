 import java.util.Scanner;
 import java.util.Random;
 public class guesinggame{
    public static void main(String[] args) {
        int Number=(int)(Math.random()*100);
        Scanner sc =new Scanner(System.in);
        System.out.println("$$.. WELCOME TO NUMBER GUESSING GAME% ...$$ ");
        System.out.println("guess the the number between 1-100 "); 
        System.out.println("YOU HAVE ONLY 7 CHANCE");
        System.out.println("quit the game using 0 and negative number ");
        int score=0,i,ch=7;
        
        for( i=1;i<=7;i++){
            System.out.println("..guess the number....:");
           int numguess=sc.nextInt();
           if(numguess<0){
            System.out.println("... invalid number ..Retry:..");

           }
        else if (numguess>Number){
            System.out.println("..large number.. Retry:");

        }
        else if (numguess<Number){
            System.out.println("..Small number...Retry");

        }
        else{
            System.out.println("... congratulation! ...your number is Right");
           break;

        }
        --ch;
        System.out.println("you have left chance ="+ch);
 
      
    }
     score=500*(ch);
     
        System.out.println("your score is = " +score);
   
     
        

      
         
    
    
       
}

 }
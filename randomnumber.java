import java.util.Scanner;
import java.util.Random;
public class randomnumber{
  public static void main(String[] args) {
      int i,count;
     Scanner scan = new Scanner(System.in);
     Random random = new Random();     
     final int MAX =100;     
     System.out.println("Think number between 1 to 100");     
     int num = random.nextInt(MAX)+1;   
     System.out.println("choose between (1-5)");
     int attempts = scan.nextInt();
    for(i=1;i<=attempts;i++){
      System.out.println("Attempt" + i );
      System.out.println("Make a choice:\n1.Multiple Attempts\n2.Limited Attempts");
      int choice = scan.nextInt();   
    switch(choice){
      case 1:{   
        count = 0;       
          while(true){               
              System.out.println("Enter your guess");
              int guess = scan.nextInt();
            if(guess<1 || guess>100){
              System.out.println("Invalid input");
            }
            else if(guess > num){
              System.out.println("Too High");
            }  
            else if (guess < num){
              System.out.println("Too Low");
            }
            else{
              System.out.println("Your Guess is Correct");
              break;
            }            
            count++;
            System.out.println("your count is"  +  count);
          }        
        break;  
        }    
      case 2:  {    
        count = 0; 
          while(count<5){               
              System.out.println("Enter your guess");
              int guess = scan.nextInt();
            if(guess<1 || guess>100){
              System.out.println("Invalid input");
            }
            else if(guess > num){
              System.out.println("Too High");
            }  
            else if (guess < num){
              System.out.println("Too Low");
            }
            else{
              System.out.println("Your Guess is Correct");
              break;          
            }           
            count++;
            System.out.println("your count is" + count);             
          }    
        System.out.println("you are out of attempts");   
        scan.close();   
      break;                          
      } 
      default:
        System.out.println("Wrong Input");
        break;
      }
    }
    
  }   
  
}


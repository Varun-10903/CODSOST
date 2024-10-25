package otercodes;
import java.util.*;
public class numbergame {
    public static void main(String[] args) {
        Random ra=new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int h=0;
            int u=1;
            int o=5;
            int score=0;
            int at=0;
            int total=0;
            int c=0;
            int v=0;
            System.out.println("guess the no. between 1 to 100 and contestant will get only 5 chance to figure out the no.");
            System.out.println("player has only 3 rounds to score");
            while(u!=4){ 
            int g=ra.nextInt(100)+1;
            System.out.println("round no."+u);
            System.out.println("enter your guessing no.");
            while(o!=0){
            h=sc.nextInt();
            if(h>100 || h<0){System.out.println("out of bound no. try between 1 to 100 and ");}
            if(g<h){System.out.println("your no. is too high from generated no. \ntry again");at++;}
            if(g>h){System.out.println("your no. is too low from generated no. \ntry again");at++;}
            if(g==h){System.out.println("congratulation you got correct no. "+ g);at++;
            System.out.println(" and you won this round");score+=6;
            break;}
            o--;
            }if(o==0 || g!=h)System.out.println("sorry you lost this round");
            if(score==0){v=score;
                System.out.println(u+" round's score = " +(v));
                System.out.println(u+" round's attempts = " +at);}
                else{v=(score-at);
                System.out.println(u+" round's score = "+(v));
                System.out.println(u+" round's attempts = " +at);}
            System.out.println();
            o=5;
            c+=at;
            total+=v;
            score=0;
            at=0;
            u++;
   } System.out.println(" total score out of 18 = "+total);
    System.out.println("total no. of attempts = "+c);
        }
}
    
}

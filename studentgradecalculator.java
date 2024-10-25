package otercodes;
import java.util.*;
public class studentgradecalculator {
    public static void grade(double a){
        if(a>40.00 && a<=49.99 ){
            System.out.println("your grade is C \nyour percents are"+a);
        } if(a>50.00 && a<=59.99 ){
            System.out.println("your grade is C+ \nyour percents are "+a+"%");
        } if(a>60.00 && a<=69.99 ){
            System.out.println("your grade is B \nyour percents are "+a+"%");
        } if(a>70.00 && a<=79.99 ){
            System.out.println("your grade is B+ \nyour percents are "+a+"%");
        } if(a>80.00 && a<=89.99 ){
            System.out.println("your grade is A \nyour percents are "+a+"%");
        } if(a>90.00 && a<=100.00){
            System.out.println("your grade is A+ \nyour percents are "+a+"%");
        }if(a>33.00 && a<=39.99){
            System.out.println("you grade is D and your percents are "+a+"%" );
        }
    }
    public static double avarage(int t){
        double y=t;
        int s=5;
        double avg=(y/s);
        return avg;
    }
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int t = 0;
        System.out.println("write your the all subjects marks out of 100");
        System.out.println("enter marks obtain in maths");
        int m=sc.nextInt();
        System.out.println("enter marks obtain in physics");
        int p=sc.nextInt();
        System.out.println("enter marks obtain in chemistry");
        int ch=sc.nextInt();
        System.out.println("enter marks obtain in english");
        int eng=sc.nextInt();
        System.out.println("enter marks obtain in hindi");
        int h=sc.nextInt();
        t=m+p+ch+eng+h;
        if((p>100 || p<0)||(m>100 || m<0)||(ch>100 || ch<0)||(eng>100 || eng<0)||(h>100 || h<0)){
            System.out.println("the entered values are not correct please run your code again and re-enter the marks ");}
        else{
            if(m<33 ||p<33||ch<33||eng<33||h<33){
                System.out.println("you are fail because your subject's marks is less then 33 ");
                System.out.println("your fail percent is "+avarage(t)+"%");
            }
   else{
        System.out.println("your total obtained marks are "+ t);
        double ans=avarage(t);
        grade(ans);
   }
}
    } 
}
}

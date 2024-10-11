import java.util.*;
class Clock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if(x*y > 12)
        {
            int d = x*y -12;
           
            if(d>24)
            System.out.println("-1");
            else  System.out.println(d);
        }
        else{
            System.out.println(x*y);
        }

    }
}

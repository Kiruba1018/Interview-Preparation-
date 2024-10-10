import java.util.*;
class trail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f = 1;
        int c = 0;
        for(int i=n;i>=1;i--){
            f = f*i;                                      //concept:
                                                            // n = 100
                                                           // n/5 = ans1
                                                           // n/25 = ans2
                                                           // n/125 = ans3(until condition fails)
                                                           // resutl = ans1 + ans2 + ans3(We get the trailing zero's)
        }
        System.out.println(f);
        while(f%10==0){
            c++;
            f/=10;
        }
        System.out.println(c);
    }
}

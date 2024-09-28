import java.util.*;
class one
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        while(a<=n){
        
            a = a*2;
        }
        a = a/2;
        int r = (n-a)*2+1;
        System.out.println(r);
        s.close();

    }
}
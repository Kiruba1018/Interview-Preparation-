import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        for(int i=l;i<=u;i++)
        {
            int s = i;
            int rev = 0;
            while(s!=0){
                int rem = s%10;
                rev = rev * 10 + rem;
                s = s/10;
            }
            if(rev == i){
                System.out.println(i);
            }
        }
    }
}

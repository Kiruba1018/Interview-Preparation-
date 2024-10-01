import java.util.*;
class six{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int count = 0;
        for(int i=m;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                count += i;
            }
        }
        System.out.println(count);
    }
}`
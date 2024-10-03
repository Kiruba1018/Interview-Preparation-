import java.util.*;
class ten {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
         sum = a[n-3] + a[n-4];
         System.out.println(sum);

        

        }
    }


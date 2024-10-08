
import java.util.*;
class ndlargest {
    public static void secla(int a[],int n)
    {
      System.out.print(Array.sort(a));
      int sum = a[n-3] + a[n-2];
      System.out.print(sum);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
          a[i] = s.nextInt();
        }
        secla(a,n);
        
    }
}

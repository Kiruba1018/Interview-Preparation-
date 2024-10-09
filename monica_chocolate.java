import java.util.*;
class monica_chocolate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int count = 0;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        if(c>n)
        {
            System.out.println("-1");
        }
        for(int i=0;i<c;i++)
        {
            count += a[i];
        }
        System.out.println(count);
    }
}

 import java.util.*;
 class friendliness {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int count = 0,i;
    int a[] = new int[n];
    for(i=0;i<n;i++){
        a[i] = s.nextInt();
    }
    for(i=1;i<n;i++){
        count += Math.abs(a[i]-a[i-1]);
    
    }
    count += Math.abs(a[0]-a[i-1]);
    System.out.println(count);
   } 
}

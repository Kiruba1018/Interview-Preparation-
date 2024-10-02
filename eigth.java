import java.util.*;
class eigth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int j = 6;
        
        for(int i=6;i>=1;i--)
        {
            if(i+j == n)
            {
                System.out.printf("%d %d\n",i,j);
                j--;
            }
        }
        
    }
}

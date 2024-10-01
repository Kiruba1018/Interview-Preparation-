import java.util.*;
class seven{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6;j++)
            {
                if(i+j == n)
                {
                    System.out.printf("(%d %d)\n",i,j);
                    count ++;
                    
                }
            }    
        }
    

        System.out.println(count);
    }
} 


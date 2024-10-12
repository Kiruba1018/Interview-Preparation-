import java.util.*;
class productmatrix {
    public static void productmatrix(int a[],int n)
    {
     
     int b[] = new int[n];
     for(int i=0;i<n;i++)
     {
        int sum = 1;
        for(int j=0;j<n;j++)
        {
            if(i!=j)
            {
                sum =sum * a[j];
                b[i] = sum;
              
            }
           
        }
        
     }
     for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
     
     
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
    productmatrix(a,n);
    }
}

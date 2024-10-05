
import java.util.*;
class friend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i==0){
              count += Math.abs(a[i]-a[i+1]);
            }
            else if(i==n-1){
                count += Math.abs(a[n-1]-a[n-2]);
                    }
            else{
                if(Math.abs(a[i]-a[i-1])<(Math.abs(a[i]-a[i+1]))){
                    count+=Math.abs(a[i]-a[i-1]);
                }
                else{
                    count+=Math.abs(a[i]-a[i+1]);
                }
            }        
            }
            System.out.println(count);
        }
    }


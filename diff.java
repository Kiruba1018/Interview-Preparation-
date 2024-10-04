import java.util.*;
class diff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        System.out.println(Def(n,m));
        
    }
    public static int Def(int n,int m){
        int sum = 0;
        for(int i=1;i<=m;i++){
            if(i%n != 0){
                sum += i;
            }
            else{
                sum -= i;
            }
        }
        return sum;
    }
}

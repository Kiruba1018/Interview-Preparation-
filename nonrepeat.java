import java.util.*;
class nonrepeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        for(int i=n1;i<=n2;i++){
            if(i/10 == i%10){
                count = 0;
            }
            else{
                count ++;
            }
        }
        System.out.println(count);
    }
}

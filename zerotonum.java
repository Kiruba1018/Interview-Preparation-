import java.util.*;
class zerotonum {
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        String str = ds.nextLine();
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '0'){
                ch[i] += 5;
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(""+ch[i]);
        }
        

        
    }
}

import java.util.*;
class one
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch[] = str.toCharArray();
        int n = ch.length;
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(i==0 && ch[i]=='u')
            {
                a++;
            }
            else if(i==0 && ch[i]=='d')
            {
                a--;
            }
            else if(ch[i]!=ch[i-1] && ch[i]=='u')
            {
                a++;
            }
             else if(ch[i]!=ch[i-1] && ch[i]=='d')
            {
                a--;
            }
        }
        System.out.print(a);
    }
}
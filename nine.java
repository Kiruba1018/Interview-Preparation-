import java.util.*;
class nine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean result = rs(str);
        System.out.println(result);
    }
    public static boolean rs(String str)
    {
        ArrayList <Character> obj = new ArrayList<>();
        for (char ch:str.toCharArray())
        {
            if(obj.contains(ch))
                return false;

            obj.add(ch);
                
        }
        return true;
    }
}

import java.util.*;
class anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length!=ch2.length) System.out.println("Try to give the same length");
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not a Anagram");
        }
    }
}

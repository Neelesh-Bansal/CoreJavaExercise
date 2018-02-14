import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter the character for finding its occurences: ");
        String occur = sc.nextLine();
        int len1=str.length();
        String ans = str.replaceAll(occur,"");
        int len2=ans.length();
        int occurences=len1-len2;
        System.out.println("No. of occurences= "+occurences);
    }
}

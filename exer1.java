import java.util.Scanner;

public class exer1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();

        System.out.println("Enter String to replace: ");
        String repto=sc.nextLine();
        System.out.println("Enter String to replace with: ");
        String repwith=sc.nextLine();
        System.out.println("1-replace first \n2-replace all: ");
        int a=sc.nextInt();
        if(a==1)
        {
            String ans=str.replaceFirst(repto,repwith);
            System.out.println("\n"+ ans);
        }
        else  if(a==2)
        {
            String ans=str.replaceAll(repto,repwith);
            System.out.println("\n"+ ans);
        }
        else{
            System.out.println("\n Not a valid input");
        }
    }
}
import java.util.Scanner;

public class exer4 {
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        int totalChars = str.length();

        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < totalChars; i++)
        {
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch))
            {
                upperCaseLetters++;
            }

            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetters++;
            }

            else if (Character.isDigit(ch))
            {
                digits++;
            }

            else
            {
                others++;
            }
        }

        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars ;

        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;

        double digitsPercentage = (digits * 100.0) / totalChars;

        double otherCharPercentage = (others * 100.0) / totalChars;

        System.out.println("Uppercase letters are "+upperCaseLetterPercentage+"% ");

        System.out.println("Lowercase letters are "+lowerCaseLetterPercentage+"%");

        System.out.println("Digits Are "+digitsPercentage+"%");

        System.out.println("Other Characters Are "+otherCharPercentage+"%");
    }
}

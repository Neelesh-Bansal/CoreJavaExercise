import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();		//Input String
        String[] words=str.split(" ");
        int wrc=1;							//Variable for getting Repeated word count

        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {

                if(words[i].equals(words[j]))	//Checking for both strings are equal
                {
                    wrc=wrc+1;				//if equal increment the count
                    words[j]="0";			//Replace repeated words by zero
                }
            }
            if(words[i]!="0")
                System.out.println(words[i]+"--"+wrc);
            wrc=1;

        }

    }

}

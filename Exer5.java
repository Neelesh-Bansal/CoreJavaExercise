public class Exer5 {
    public static void main(String args[]) {
    String[] array1={"hello","world","new","memories"};
    String[] array2={"welcome","to","new","TTN","world"};
    for(int i=0;i<array1.length;i++)
     {
        for(int j=0;j<array2.length;j++)
        {
            if(array1[i].equals(array2[j]))
            {
                System.out.println(array1[i]+"\n");
                break;
            }
        }
     }
    }
}
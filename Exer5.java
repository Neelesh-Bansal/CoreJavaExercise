public class Exer5 {
    public static void main(String args[]) {
    String[] array1={"hello","world","world","new","memories"};
    String[] array2={"welcome","to","new","TTN","world","world"};
    for(int i=0;i<array1.length-1;i++){
        for(int j=i+1;j<array1.length;j++){
            if( (array1[i].equals(array1[j])) && (i != j) )
            {
                array1[i]="null";
                break;
            }
        }
    }
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
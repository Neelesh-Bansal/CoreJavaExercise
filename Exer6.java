public class Exer6 {
    public static void main(String args[]){
        int[] a={2,3,4,3,2,4,22};
        int ans=a[0];
        for(int i=1;i<a.length;i++)
        {
            ans=ans ^ a[i];
            //System.out.println(ans+"\n");
        }
        System.out.println(ans);
    }
}

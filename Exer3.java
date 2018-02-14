public class Exer3 {

    public static void main(String args[])
    {

        char[] str={'h','e','l','l','o'};
        char c='l';
        int len=5;
        int ans=0;
        int a=find(c,str,0,len,ans);
        System.out.println(a);
    }
     static int find(char c, char[] str, int pos, int len, int ans){
        if(pos<=len) {
            if (str[pos] == c) {
                return (1 + find(c, str, pos++, len, ans));
                //System.out.println("find\n");
            } else {
                return (0 + find(c, str, pos++, len, ans));
            }
        }
        return 0;
    }
}

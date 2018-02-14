public class Exer11 {
    static int adding(int a, int b){
    return a+b;
    }
    static double adding(double a, double b){
    return a+b;
    }
    static float multiply(float a, float b){
        return a*b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static String concatenate(String a, String b){
        return a+b;
    }
    static String concatenate(String a, String b, String c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("Adding two integer 5+10="+Exer11.adding(5,10));
        System.out.println("Adding two double 5.001+10.101="+Exer11.adding(5.001,10.101));
        System.out.println("Multiplying two float 5.01*10.01="+Exer11.multiply(5.01f,10.01f));
        System.out.println("Multiplying two integer 5*10="+Exer11.multiply(5,10));
        System.out.println("Concatenating two String="+Exer11.concatenate("Neelesh","Bansal"));
        System.out.println("Concatenating three String="+Exer11.concatenate("hello","every","one"));
    }
}

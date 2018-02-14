class Bank{
    float rate_of_interest;
    void getDetails(){
        rate_of_interest=12;
    }
    void showDetails(){
        System.out.println("Rate of Interest of Parent Bank="+rate_of_interest);

    }
}
class SBI extends Bank{
    void getDetails(){
        rate_of_interest=8;
    }
    void showDetails(){
        System.out.println("Rate of Interest of SBI Bank="+rate_of_interest);

    }
}
class BOI extends Bank{
    void getDetails(){
        rate_of_interest=7.5f;
    }
    void showDetails(){
        System.out.println("Rate of Interest of BOI Bank="+rate_of_interest);

    }
}
class ICICI extends Bank{
    void getDetails(){
        rate_of_interest=9;
    }
    void showDetails(){
        System.out.println("Rate of Interest of ICICI Bank="+rate_of_interest);

    }
}
public class Exer12 {
    public static void main(String[] args) {
        Bank obj= new Bank();
        obj.getDetails();
        obj.showDetails();
        obj= new SBI();
        obj.getDetails();
        obj.showDetails();
        obj=new BOI();
        obj.getDetails();
        obj.showDetails();
        obj=new ICICI();
        obj.getDetails();
        obj.showDetails();
    }
}

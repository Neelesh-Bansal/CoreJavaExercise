enum house{
        Holl(8131),Oak(8032),Willow(7913),School_House(4323),The_Willow(4107),Sunnysid(3982),Highfield(3873);
        private int price;
        house(int p){
                price = p;
             }
    int getPrice() {
        return price;
    }
}



public class Exer10 {
    public static void main(String[] args) {
        System.out.println("All House Prices:");
        for (house h : house.values()) System.out.println(h + " costs " + h.getPrice() + " thousand dollars.");
    }
}

package text.section_06;

public class TypeConv_4 {
    public static void main(String[] args) {
         int price = 298;
         double tax1 = 1.1;
         double tax2 = 0.1;
         int charge1 = (int)(price*tax1);
         int charge2 = (int)(price+(price*tax2));
         System.out.println("料金："+charge1+"円");
         System.out.println("料金："+charge2+"円");
    }
}

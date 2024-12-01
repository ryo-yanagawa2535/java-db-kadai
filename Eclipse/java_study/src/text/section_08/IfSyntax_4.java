package text.section_08;

public class IfSyntax_4 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 5);
        System.out.println(randNum);
        
        if((1<randNum)&&(randNum<3)){
        	System.out.println("randNumは1より大きいかつ3より小さいです");
        }else {
        	System.out.println("条件が成り立たないです");
        }
        
        if((randNum==1)||(randNum==3)) {
        	System.out.println("randNumは1.もしくは3です");
        }else {
        	System.out.println("or条件が成り立たないです");
        }
    }
}

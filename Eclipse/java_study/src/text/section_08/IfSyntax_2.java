package text.section_08;

public class IfSyntax_2 {
    public static void main(String[] args) {
       int randNum = (int)(Math.random()*10);
       System.out.println(randNum);
       if(randNum==9) {
    	   System.out.println("大当たりです");
       }else {
    	   System.out.println("はずれです");
       }
    }
}

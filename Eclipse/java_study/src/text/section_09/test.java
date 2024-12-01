package text.section_09;

public class test {
	public static void main(String[] args) {
        int age = 30;
        String fee;
        
        fee = switch(age) {
        case 10 -> "10代の料金は1000円です";
        case 20 -> "20代の料金は2000円です";
        case 30 -> "30代の料金は3000円です";
        case 40 -> "40代の料金は3000円です";
        case 50 -> "50代の料金は4000円です";
        default -> "それ以外は500円です";
        };
        
        System.out.println(fee);
    }
}

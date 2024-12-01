package text.section_11;

public class WhileSyntax_2 {
    public static void main(String[] args) {

        int dice = 1; // サイコロの目
        int  cnt = 0; // 繰り返し回数
        
        while( dice != 6) {
        	
        dice = (int)( Math.ceil( Math.random() * 6 ) );
        System.out.println("サイコロの目は" + dice);        
            
        cnt++;
        	
        if( 5 <= cnt ) {
        System.out.println("5回に達したため強制終了します");
        break;
        }
        
        }
    }
}

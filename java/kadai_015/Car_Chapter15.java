package kadai_015;

public class Car_Chapter15 {

        private int gear = 1; //1速から5速のギアを表す
        private int speed = 10; //ギアチェンジ後の速度を表す
        private int previousGear; // 以前のギア設定
     
     public Car_Chapter15(int gear, int speed ) {
        this.gear = gear;
        this.speed = speed;
     }
        
     public void gearChange(int afterGear) {
    	 this.previousGear = this.gear; // 現在のギアを previousGear に保存
    	 this.gear = afterGear;
         switch(this.gear) {
         case 1 -> this.speed = 10;
         case 2 -> this.speed = 20;
         case 3 -> this.speed = 30;
         case 4 -> this.speed = 40;
         case 5 -> this.speed = 50;
         default -> this.speed = 10;
         }
     }
     
     public void run() {
    	 System.out.println("ギア" + this.previousGear + "から" + this.gear + "に切り替えました");
    	 System.out.println	("速度は時速" + this.speed + "kmです");
     }

}

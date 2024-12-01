package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	public void setGivenName() {
		this.givenName = "花子";
	}

    @Override
    //抽象メソッドに具体的な処理を記述	する
    void eachIntroduce() {
        System.out.println("私は設計が得意です");
    }
    
}

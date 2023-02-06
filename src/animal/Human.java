package animal;

//基準①:Animalクラスを継承し、Thinkableインターフェースを実装
public class Human extends Animal implements Thinkable{

    //基準②:趣味の情報を保管するフィールド
    private String hobby;

    //基準③:コンストラクタ
    public Human() {
    }

    public Human(String hobby) {
        this.hobby = hobby;
    }

    //thinkメソッドを実装
    @Override
    public void think(){
        System.out.println( "私は" + hobby + "について考えています。");
    }
}

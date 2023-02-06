package animal;

public class Animal {

    //基準①:フィールド
    private String name;
    private int age;



    //基準②:コンストラクタ
    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //基準③:sayメソッド
    public void say(){
    System.out.println( name + "です。" + age + "歳です。");
}
}

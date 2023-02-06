package animal;

public class Review04 {

    public static void main(String[] args) {
        Animal animal00 = new Animal("田中　太郎", 25);
        Human animal01 = new Human("電車");
        animal00.say();
        animal01.think();

        Animal animal02 = new Animal("鈴木　次郎", 30);
        Human animal03 = new Human("野球");
        animal02.say();
        animal03.think();

        Animal animal04 = new Animal("佐藤　花子", 20);
        Human animal05 = new Human("映画");
        animal04.say();
        animal05.think();

    }

}

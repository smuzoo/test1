class Cat{

    public String name;
    public String color;
    public static boolean age;

    protected Cat(String name, String color){
        this.color = color;
        this.name = name;

    }


    public void displayName() {
        System.out.println(name);
    }
    public void displayColor(){
        System.out.println(color);

    }
}
class British extends Cat{
    public String sex;

    protected British(String name, String color, String sex) {
        super(name, color);
        this.sex = sex;
        System.out.println("get me food.");
    }

    @Override
    public void displayName(){
        System.out.println("I'm British");
    }

    @Override
    public void displayColor(){
        System.out.println("My gorgeous color is");
    }

}
class Finx extends Cat{

    protected Finx(String name, String color) {
        super(name, color);
    }
    @Override
    public void displayName(){
        System.out.println("I'm Finx");
    }

}
public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Midnight", "grey");
        cat1.displayName();
        Cat cat2 = new British("Benedict", "white", "male");
        cat2.displayName();
        System.out.println(Cat.age);
        cat2.displayColor();
        System.out.print(cat1.color);
        System.out.print("And my color is " + cat2.color);
    }
}

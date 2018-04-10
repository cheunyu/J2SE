package generic.example;

public class Demo {

    public static void main(String[] args) {
        Zoo<? extends Cat> zoo = new Zoo<EnglandCat>(new EnglandCat());
        zoo.setItem(new EnglandCat());
    }
}

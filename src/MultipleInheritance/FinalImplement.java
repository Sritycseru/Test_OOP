package MultipleInheritance;
interface Circle{
    void drawCircle();
}

interface Square{
    void drawSquare();
}

public class FinalImplement implements Circle,Square {
    @Override
    public void drawCircle() {
        System.out.println("Shangki Kaayet of Circle");
    }

    @Override
    public void drawSquare() {
        System.out.println("Shangki Kaayet of Square");

    }

    public static void main(String[] args) {
        FinalImplement f = new FinalImplement();
        f.drawCircle();
        f.drawSquare();
    }

}
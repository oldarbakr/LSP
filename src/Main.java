public class Main {

    private static Rectangle getNewRectangle(){
        return new Square();
    }

    public static void main(String[] args) {
        Rectangle rectangle = Main.getNewRectangle();
        rectangle.setWidth(5);rectangle.setHeight(10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getWidth()); //get Width
        System.out.println(rectangle.getHeight()); //get Height
    }
}




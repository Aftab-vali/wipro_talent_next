public class Assignment1 {
    class Box {
        double width, height, depth;
        Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }
        double getVolume() {
            return width * height * depth;
        }
    }
    public static void main(String[] args) {
        Assignment1 obj = new Assignment1();
        Box myBox = obj.new Box(5, 3, 2);
        double volume = myBox.getVolume();
        System.out.println("Volume of the box: " + volume);
    }
}
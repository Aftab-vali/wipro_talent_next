package BOX_Dimensions_and_Calculator_project;

class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized Constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double volume() {
        return width * height * depth;
    }
}

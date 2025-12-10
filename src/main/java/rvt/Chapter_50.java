package rvt;

public class Chapter_50 {
    private double width;
    private double height;
    private double length;

    public static void main(String[] args) {
        Chapter_50 box1 = new Chapter_50(2.5, 5.0, 6.0);
        Chapter_50 box2 = new Chapter_50(box1);

        System.out.println("Box1 Area: " + box1.area() + " Volume: " + box1.volume());
        System.out.println("Box2 Area: " + box2.area() + " Volume: " + box2.volume());

        Chapter_50 bigger = box1.biggerBox(box1);
        Chapter_50 smaller = box1.smallerBox(box1);

        System.out.println("Bigger Box Volume: " + bigger.volume());
        System.out.println("Smaller Box Volume: " + smaller.volume());

        Chapter_50 smallBox = new Chapter_50(2.0, 4.0, 5.0);
        System.out.println("Small box nests in box1? " + smallBox.nests(box1));
        System.out.println("Box1 nests in small box? " + box1.nests(smallBox));
    }

    public Chapter_50(double w, double h, double l) {
        width = w;
        height = h;
        length = l;
    }

    public Chapter_50(double side) {
        width = side;
        height = side;
        length = side;
    }

    public Chapter_50(Chapter_50 oldBox) {
        width = oldBox.width;
        height = oldBox.height;
        length = oldBox.length;
    }

    public double volume() {
        return width * height * length;
    }

    public double area() {
        return 2 * width * height + 2 * width * length + 2 * height * length;
    }

    public double width() { return width; }
    public double height() { return height; }
    public double length() { return length; }

    public Chapter_50 biggerBox(Chapter_50 oldBox) {
        return new Chapter_50(oldBox.width * 1.25, oldBox.height * 1.25, oldBox.length * 1.25);
    }

    public Chapter_50 smallerBox(Chapter_50 oldBox) {
        return new Chapter_50(oldBox.width * 0.75, oldBox.height * 0.75, oldBox.length * 0.75);
    }

    public boolean nests(Chapter_50 outsideBox) {
        return width <= outsideBox.width && height <= outsideBox.height && length <= outsideBox.length;
    }
}

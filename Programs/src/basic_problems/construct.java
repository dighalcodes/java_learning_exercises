package basic_problems;

class rectangle {
    private int l;
    private int b;

    public rectangle() {
        this.l = 4;
        this.b = 5;
    }

    public rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getl() {
        return l;
    }

    public int getb() {
        return b;
    }

    public int perimeter() {
        return 2 * (l + b);
    }

    public int area() {
        return l * b;
    }

}

public class construct {

    public static void main(String[] args) {

        // rectangle obj = new rectangle();
        rectangle obj = new rectangle(2, 3);
        System.out.println("area is: " + obj.area());

        System.out.println("perimeter is: " + obj.perimeter());

    }
}

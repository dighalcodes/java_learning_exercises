package small_project_based_learning;

// class payment {
//     public static final int SUCCESS = 1;
//     public static final int FAILED = 2;
//     public static final int PENDING = 3;

// }

enum direction {
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    private int degree;

    direction(int degree) {
        this.degree = degree;
    }

    public int getDegree(){
        return degree;
    }

}

public class demo {
    public static void main(String[] args) {
        direction d = direction.SOUTH;
        System.out.println(d.getDegree());

    }
}

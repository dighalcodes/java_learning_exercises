package small_project_based_learning;

// class parent {

//     public String vote(int x) {
//         if (x >= 18) {
//             return "you can vote";
//         } else {
//             return "you cannot";
//         }
//     }
// }

import java.util.ArrayList;
import java.util.List;

// class child extends parent {
//     public String license(int x) {
//         if (x >= 18) {
//             return "you can vote";
//         } else {
//             return "you cannot";
//         }
//     }
// }

interface engine {
    public void StartEngine();

    public void StopEngine();
}

interface car {
    public void drive();
}

class thar implements engine, car {
    @Override
    public void StartEngine() {
        System.out.println("engine turning on...");
        System.out.println("engine started...");
    }

    
    @Override
    public void drive() {
        System.out.println("car is driving...");
    }

    @Override
    public void StopEngine() {
        System.out.println("engine Stopped...");
    }
}

public class demo2 {
    public static void main(String[] args) {

        // parent o1 = new child();
        // System.out.println(o1.vote(5));

        // child o2 = new child();
        // System.out.println(o2.license(78));

        // thar o1 = new thar();
        // o1.StartEngine();
        // o1.drive();
        // o1.StopEngine();

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        // nums.remove(1);
        // Did you mean: remove the element at INDEX 1 (which is value 2)?
        // OR remove the VALUE 1 from the list?
        // Answer: Java chose INDEX. List is now [1, 3].

        // To remove by VALUE, you must cast:
        nums.remove(Integer.valueOf(1));
        System.out.println(nums);

    }

}

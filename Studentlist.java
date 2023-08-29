import java.util.ArrayList;
import java.util.List;

class Studentarray {
    String Student_name;
    int Student_age;
    int Student_roll_no;

    Studentarray(String name, int age, int roll_no) {
        this.Student_name = name;
        this.Student_age = age;
        this.Student_roll_no = roll_no;
    }

    public void display() {
        System.out.println("Student_rollno:" + this.Student_roll_no);
        System.out.println("student_name:" + this.Student_name);
        System.out.println("student_age:" + this.Student_age);
    }
}

class Studentlist{
    public static void main(String[] args) {
        //creating list:
        List<Studentarray> lists = new ArrayList<>();
        //creating Array:
        String name[] = {"thansh", "Lindesh", "Shambu", "Prithik", "kumar", "Superstar", "vel", "Dhanavel", "Sangeetha", "welcome"};
        int age[] = {20, 21, 22, 45, 67, 34, 57, 78, 32, 56};
        int roll_no[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //looping to pass array value to constructor
        for (int i = 0; i < 10; i++) {
            Studentarray sh = new Studentarray(name[i], age[i], roll_no[i]);
            lists.add(sh);
        }
        //Print arraylist values:
        for (int i = 0; i < 10; i++) {
            lists.get(i).display();
        }
    }
}

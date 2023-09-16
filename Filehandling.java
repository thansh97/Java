import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Filehandling {
    public static void main(String[] args) {
        Filehandling filehandling = new Filehandling();
        filehandling.start();
    }
        ArrayList<Employee> lists = new ArrayList<>();
        void start(){

            while (true) {
                System.out.println("Enter the selection");
                Scanner sc = new Scanner(System.in);
                String selection = sc.nextLine();
                if (selection.equals("1")) {
                    System.out.println("Enter name");
                    String name = sc.nextLine();

                    System.out.println("Enter Designation");
                    String designation = sc.nextLine();

                    System.out.println("Enter id");
                    int id = sc.nextInt();

                    this.lists.add(new Employee(id,name,designation));
                    System.out.println("successfully added");

                    try {

                        FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        objectOutputStream.writeObject(this.lists.add(new Employee(id,name,designation)));
                        System.out.println("values added");
//                        objectOutputStream.flush();
                        objectOutputStream.close();
                        fileOutputStream.close();
                        System.out.println("completed");

                    }
                    catch (Exception e){
                        System.out.println("error");
                    }

                } else if (selection.equals("2")) {
                    System.out.println("Enter selection");
                    for (int i = 0; i < lists.size(); i++) {
                        System.out.println(lists.get(i));
                        }
                }  else {
                    System.out.println("Enter correct selection");
                }
            }
        }

}


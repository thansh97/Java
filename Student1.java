import java.util.*;
class Studentdetails1 {
        public  void details(){
        String name[]=new String[10];
        int roll_no[] =new int[10];
        Scanner sc = new Scanner(System.in);
        //Student Name:
        for(int i=0;i<name.length;i++){
            System.out.println("Enter student Name:\t");
            name[i]=sc.next();
        }
        // Student roll no:
        for(int i=0;i<roll_no.length;i++){
            System.out.println("Enter student roll_no:\t");
            roll_no[i]=sc.nextInt();
        }

        for(int i=0;i<10;i++){
            System.out.println("Student's Name:\t"+name[i]);
            System.out.println("Student's Name:\t"+roll_no[i]);

        }

    }
    }

class Student1{
    public static void main(String[] args){
        Studentdetails1 st =new Studentdetails1();
        st.details();
        }
    }


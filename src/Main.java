import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        try{ Student student1 = new Student("Red",18);
    Student student2 = new Student("Orange", 18);
    Student student3 = new Student("Yellow",17);
    Student student4 = new Student("Green",16);
    Student student5 = new Student("Light-Blue",15);
    Student student6 = new Student("Blue",16);
    Student student7 = new Student("Purple",14);
    Student student8 = new Student("Black",-10);
        students.add(student1);
        students.add(student2);
        students.add(student3);students.add(null);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        }catch (RuntimeException e){
            throw new RuntimeException();
        }
        for (Student student : students) {
            try{
            System.out.println(student);}catch (RuntimeException e){
                throw new RuntimeException(student.getStudent()+" имеет отрицательный возраст ("+student.getAge()+")");
            }
        }
    }
}
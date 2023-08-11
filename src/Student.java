public class Student{
    private String Student;
    private int age;


    @Override
    public String toString() {
        if(age<0){
            throw new RuntimeException(this.Student+" имеет отрицательный возраст ("+this.age+")");
        }else {
        return "Student{" +
                "Student='" + Student + '\'' +
                ", age=" + age +
                '}';}
    }

    public Student(String message, String student, int age) {
        Student = student;
        this.age = age;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    public int getAge() {
        if(age<0){
            throw new RuntimeException(this.Student+" имеет отрицательный возраст ("+this.age+")");
        }else {
            return age;
        }
    }

    public void setAge(int age) {
        if(age<0){
            throw new RuntimeException(this.Student+" имеет отрицательный возраст ("+this.age+")");
        }else{
            this.age = age;
        }
    }

    public Student(String student, int age) {
        Student = student;
        this.age = age;
    }
}

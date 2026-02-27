class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        s1.display();
    }
}
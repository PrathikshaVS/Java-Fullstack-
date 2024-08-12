class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class CreateObject {
    public static void main(String[] args) {
        Student obj = new Student("Alice", 30);
        obj.display();
    }
}
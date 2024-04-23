class PersonC {
    private String name;
    private int age;

    public PersonC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends PersonC {
    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", ID: " + id);
    }
}

class Teacher extends PersonC {
    private float salary;

    public Teacher(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Get user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();

        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();

        System.out.print("Enter teacher name: ");
        scanner.nextLine(); // Consume newline character from previous input
        String teacherName = scanner.nextLine();

        System.out.print("Enter teacher age: ");
        int teacherAge = scanner.nextInt();

        System.out.print("Enter teacher salary: ");
        float teacherSalary = scanner.nextFloat();

        // Create student and teacher objects
        Student student = new Student(studentName, studentAge, studentId);
        Teacher teacher = new Teacher(teacherName, teacherAge, teacherSalary);

        // Print student and teacher information
        student.print();
        teacher.print();

        scanner.close();
    }
}
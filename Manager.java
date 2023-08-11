public class Manager {
    // data types for teacher
    private String name;
    private int age;
    private String subject;
    private String department;
    private boolean isTenured;

    // static object count
    private static int objectCount = 0;

    // constructor chaining
    public Manager(String name, int age, String subject, String department, boolean isTenured) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.department = department;
        this.isTenured = isTenured;
        objectCount++;
    }

    public Manager(String name, int age, String subject, String department) {
        this(name, age, subject, department, false);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isTenured() {
        return isTenured;
    }

    // method overloading for comparison with object attribute value
    public boolean isSameDepartment(Manager other) {
        return this.department.equals(other.getDepartment());
    }

    public boolean isSameSubject(Manager other) {
        return this.subject.equals(other.getSubject());
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Subject: " + subject +
            ", Department: " + department + ", Tenured: " + isTenured;
    }

    // equality check with object as parameter
    public boolean equals(Object other) {
        if (other instanceof Manager) {
            Manager otherTeacher = (Manager) other;
            return this.name.equals(otherTeacher.getName()) &&
                this.age == otherTeacher.getAge() &&
                this.subject.equals(otherTeacher.getSubject()) &&
                this.department.equals(otherTeacher.getDepartment()) &&
                this.isTenured == otherTeacher.isTenured();
        }
        return false;
    }

    // public static method to get object count
    public static int getObjectCount() {
        return objectCount;
    }

    public static void main(String[] args) {
        // example usage
        Manager[] teachers = new Manager[3];
        teachers[0] = new Manager("Alice", 35, "Math", "Science", true);
        teachers[1] = new Manager("Bob", 40, "English", "Humanities");
        teachers[2] = new Manager("Charlie", 30, "Physics", "Science", true);

        // compare teachers
        if (teachers[0].isSameDepartment(teachers[2])) {
            System.out.println("Alice and Charlie are in the same department");
        } else {
            System.out.println("Alice and Charlie are not in the same department");
        }

        // print teachers using toString
        for (Manager teacher : teachers) {
            System.out.println(teacher);
        }

        // check object count
        System.out.println("Number of teachers created: " + Manager.getObjectCount());
    }
}

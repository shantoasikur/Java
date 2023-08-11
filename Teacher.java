public class Teacher {
    // Data types
    private String name;
    private int age;
    private String subject;
    private String qualification;
    private double salary;
    
    // Static object count
    private static int count;
    
    // Constructor chaining
    public Teacher() {
        
    }
    
    public Teacher(String name) {
        this(name, 0, "", "", 0.0);
    }
    
    public Teacher(String name, int age) {
        this(name, age, "", "", 0.0);
    }
    
    public Teacher(String name, int age, String subject) {
        this(name, age, subject, "", 0.0);
    }
    
    public Teacher(String name, int age, String subject, String qualification) {
        this(name, age, subject, qualification, 0.0);
    }
    
    public Teacher(String name, int age, String subject, String qualification, double salary) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.qualification = qualification;
        this.salary = salary;
        count++;
    }
    
    // Accessors
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public String getQualification() {
        return qualification;
    }
    
    public double getSalary() {
        return salary;
    }
    
    // Method overloading
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void setSalary(int salary) {
        this.salary = (double) salary;
    }
    
    // ToString method
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSubject: " + subject + "\nQualification: " + qualification + "\nSalary: " + salary;
    }
    
    // Equality check with object as parameter
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Teacher)) {
            return false;
        }
        
        Teacher otherTeacher = (Teacher) obj;
        return this.name.equals(otherTeacher.getName()) && this.age == otherTeacher.getAge();
    }
    
    // Comparison with object attribute value
    public boolean hasHigherSalary(Teacher otherTeacher) {
        return this.salary > otherTeacher.getSalary();
    }
    
    // Object type array
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("John", 35, "Maths", "PhD", 60000);
        teachers[1] = new Teacher("Mary", 40, "English", "M.A.", 55000);
        teachers[2] = new Teacher("David", 30, "Science", "B.Sc.", 50000);
        
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
        
        System.out.println("Total number of teachers: " + Teacher.count);
    }
}
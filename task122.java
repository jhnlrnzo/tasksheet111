class Student{
    private String fName;
    private String lName;
    public Student(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }
    void printFullName(String fullName){
        System.out.println(fullName = fName + " " + lName);
    }
}


public class task122 {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName(null);
        }
    }
}

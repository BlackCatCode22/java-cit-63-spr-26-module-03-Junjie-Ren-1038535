package mystudent;

public class App {
    public static void main(String[] args){
        Student myStudent = new Student();
        myStudent.firstname = "Jim";
        myStudent.lastname = "Halpert";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;

        System.out.println(myStudent.gpa);

        Student myStudent2 = new Student();
        myStudent2.firstname = "Pam";
        myStudent2.lastname = "Beasley";
        myStudent2.major = "Art";
        myStudent2.gpa = 2.5;
        myStudent2.age = 23;
        myStudent2.onProbation = true;

        System.out.println(myStudent2.firstname);
    }
}
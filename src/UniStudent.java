public class UniStudent extends Person{
    double gpa;

    UniStudent(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(this.first + "'s gpa is " + this.gpa);
    }
}

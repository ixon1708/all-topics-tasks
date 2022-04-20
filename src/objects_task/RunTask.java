package objects_task;

public class RunTask {

    public static void main(String[] args) {
        Student harry = new Student(10, 6, 5, 9);
        Student hermione = new Student(9, 10, 9, 8);
        Student ron = new Student(7, 5, 5, 7);
        System.out.println("Harry: " + harry.examScore());
        System.out.println("Hermione: " + hermione.examScore());
        System.out.println("Ron: " + ron.examScore());
    }

}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("Danylo",2);
        Student student2 = new Student("Petro",1);
        Student student3 = new Student("Dmytro",3);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println("" +
                "");

        //student.betterStudent(student1.getRating(), student2.getRating());
        student1.setRating(student.changeRating(student1.getRating()));

        System.out.println("The average rating of all students: " + (
                student1.getRating()+student2.getRating()+student3.getRating())/3.0);

        System.out.println("" +
                "");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println("The new average rating of all students: " + (
                student1.getRating()+student2.getRating()+student3.getRating())/3.0);
    }
}

public class Student {
    private String name;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Student() {
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean betterStudent(int ratingFirst, int ratingSecond) {

        if (ratingFirst < ratingSecond) {
            System.out.println("Rating first student is less than second student" + "\t" + true);

        } else {
            System.out.println("Rating first student is more than second student" + "\t" + false);
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public int changeRating(int toChange) {
        int number = (int) (Math.random() * 11);
        return number;
    }
}
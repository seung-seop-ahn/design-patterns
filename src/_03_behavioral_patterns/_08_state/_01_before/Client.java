package _03_behavioral_patterns._08_state._01_before;

public class Client {

    public static void main(String[] args) {
        Student student1 = new Student("student1");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student student2 = new Student("student2");
        student2.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student1);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(student2);

        onlineCourse.addReview("hello", student1);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}

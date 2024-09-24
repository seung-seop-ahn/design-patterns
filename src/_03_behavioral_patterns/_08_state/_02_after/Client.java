package _03_behavioral_patterns._08_state._02_after;

public class Client {

    public static void main(String[] args) {
//        OnlineCourse onlineCourse = new OnlineCourse();
//        Student student1 = new Student("student1");
//
//        onlineCourse.addStudent(student1);
//        onlineCourse.changeState(new Private(onlineCourse));
//        onlineCourse.addReview("hello", student1);
//
//        System.out.println(onlineCourse.getState());
//        System.out.println(onlineCourse.getStudents());
//        System.out.println(onlineCourse.getReviews());

        OnlineCourse onlineCourse = new OnlineCourse();
        Student student1 = new Student("student1");
        Student student2 = new Student("student2");

        onlineCourse.addStudent(student1);
        onlineCourse.addStudent(student2);

        onlineCourse.addReview("hello", student1);
        onlineCourse.addReview("world", student2);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}

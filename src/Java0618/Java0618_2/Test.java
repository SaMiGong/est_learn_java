package Java0618.Java0618_2;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    Course<Person> personCourse = new Course<>("일반인", 5);
    personCourse.add(new Person("일반인"));
    personCourse.add(new Worker("직장인"));
    personCourse.add(new Student("학생"));
    personCourse.add(new HighStudent("고등학생"));

    Course<Worker> workerCourse = new Course<>("직장인과정", 5);
    //    workerCourse.add(new Person("일반인")); // 워커로 한정해서 안됨
    workerCourse.add(new Worker("직장인"));

    Course<Student> studentCourse = new Course<>("학생과정", 5);
    studentCourse.add(new Student("학생"));
    studentCourse.add(new HighStudent("고등학생"));

    Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
    highStudentCourse.add(new HighStudent("고등학생"));

    registerCourse(personCourse);
    registerCourse(workerCourse);
    registerCourse(studentCourse);
    registerCourse(highStudentCourse);

    System.out.println("=============");
    System.out.println("=============");
    System.out.println("=============");

    registerCourseStudent(studentCourse);
    registerCourseStudent(highStudentCourse);
    //    registerCourseStudent(workerCourse); // 상속 범주를 벗어나서 안됨

    System.out.println("=============");
    System.out.println("=============");
    System.out.println("=============");

    registerCourseWorker(personCourse);
    registerCourseWorker(workerCourse);
  }

  public static void registerCourse(Course<?> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseStudent(Course<? extends Student> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseWorker(Course<? super Worker> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }
}

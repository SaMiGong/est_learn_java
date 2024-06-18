package Java0618.Java0618_2;

public class Course<T> {
  private String name;
  private T[] students;

  public Course(String name, int capacity) {
    this.name = name;
    students = (T[]) (new Object[capacity]); // capacity만큼의 오브젝트가 만들어짐
    // 타입 파라미터로 배열을 생성하려면 (T[]) (new Object[n])으로 생성해야한다.
  }

  public String getName() {
    return this.name;
  }

  public T[] getStudents() {
    return this.students;
  }

  public void add(T t) {
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        students[i] = t;
        break;
      }
    }
  }
}

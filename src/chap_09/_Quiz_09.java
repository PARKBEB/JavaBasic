package chap_09;

import java.util.ArrayList;

public class _Quiz_09 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("팬텀은쨩", "파이썬"));
        students.add(new Student("아델은쨩", "자바"));
        students.add(new Student("텐텐은쨩", "자바"));
        students.add(new Student("엔젤릭은쨩", "C"));
        students.add(new Student("캡틴은쨩", "파이썬"));

        System.out.println("[ 자바 자격증을 보유한 학생 ]");
        for (Student s : students) {
            if (s.certificate.equals("자바")) {
                System.out.println(s.name);
            }
        }

    }
}

class Student {
    public String name;
    public String certificate;
    public Student(String name, String certificate) {
        this.name = name;
        this.certificate = certificate;
    }
}

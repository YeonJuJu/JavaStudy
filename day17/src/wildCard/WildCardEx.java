package wildCard;

import java.util.Arrays;

public class WildCardEx {
    public static void main(String[] args){
        Course<Person> c1 = new Course<>("일반인 과정", 13);
        c1.add(new Person("일반인"));
        c1.add(new Person("직장인"));
        c1.add(new Person("학생"));

        registerCourse(c1);

        Course<Worker> c2 = new Course<>("직장인 과정", 5);
        c2.add(new Worker("직장인"));
        c2.add(new Worker("회사원"));
        c2.add(new Worker("샐러리맨"));

        registerCourse(c2);

        Course<Student> c3 = new Course<>("학생 과정", 5);
        c3.add(new Student("학생"));
        c3.add(new Student("중학생"));
        c3.add(new Student("고등학생"));

        registerCourse(c3);

        Course<HighStudent> c4 = new Course<>("고등학생 과정", 5);
        c4.add(new HighStudent("고등학생1"));
        c4.add(new HighStudent("고등학생2"));

        registerCourse(c4);

        registerStudentCourse(c3);
        registerStudentCourse(c4);

        registerWorkerCourse(c2);
    }

    public static void registerCourse(Course<?> course){
       System.out.println(course.getSubject() + " 수강생 : "
               + Arrays.toString(course.getStudents()));
    }

    // Generic type 바운더리 지정
   public static void registerStudentCourse(Course<? extends Student> course){
        System.out.println(course.getSubject() + " 수강생 : "
                + Arrays.toString(course.getStudents()));
    }

    public static void registerWorkerCourse(Course<? extends Worker> course){
        System.out.println(course.getSubject() + " 수강생 : "
                + Arrays.toString(course.getStudents()));
    }
}

package wildCard;

public class Course<T> {
    //과정 이름
    private String subject;

    //한 과정 당 최대 수강 인원
    private T[] students;

    public Course(String subject, int capacity){
        this.subject = subject;
        this.students = (T[]) new Object[capacity];
    }

    public void add(T t){
        for(int i=0;i<students.length;i++){
            if(students[i] == null) {
                students[i] = (T) t;
                break;
            }
        }
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public T[] getStudents(){
        return students;
    }

    public void setStudents(T[] students){
        this.students = students;
    }
}

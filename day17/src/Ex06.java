public class Ex06 {
    public static void main(String[] args){

        // String type 의 클래스 객체 생성
        Student<String> student1 = new Student<>();
        student1.setMemberVar("이순신");
        System.out.println(student1.getMemberVar());

        String name = student1.getMemberVar();

        // Integer type 의 클래스 객체 생성
        Student<Integer> student2 = new Student<>();
        student2.setMemberVar(12);
        System.out.println(student2.getMemberVar());

        int age = student2.getMemberVar();
    }
}

// Generic 을 사용하지 않고, Object type 사용
class Student<T>{
    private T memberVar;

    public Student(){}
    public Student(T memberVar){
        this.memberVar = memberVar;
    }
    public T getMemberVar(){
        return memberVar;
    }
    public void setMemberVar(T memberVar){
        this.memberVar = memberVar;
    }
}
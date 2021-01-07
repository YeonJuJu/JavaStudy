import java.util.Scanner;

class Student2{
	private String name;
	private String[] subjects;
	private int[] scores;
	private int total;
	private float average;
	
	public Student2(String name) {
		// 생성자에서 객체가 생성될 때 실행되는 code 를 작성함
		this.name = name;
		subjects = new String[] {"국어", "영어", "수학"};
		scores = new int[subjects.length];
		total = 0;
		average = 0.0F;
		compute();
		
	}
	
	public void compute() {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%s 과목의 성적을 입력하세요 : ", subjects[i]);
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		average = (float)total / scores.length;
	}
	public void display() {
		System.out.println("===========================================");
    System.out.printf("%s 학생의 성적정보를 출력합니다%n", this.name);		
		System.out.println("===========================================");
		
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%-5s : %3d 점%n", subjects[i], scores[i]); 
		}
		System.out.println("===========================================");
    System.out.printf("총점 : %d 점, 평균 : %.2f 점%n", total, average);		
		System.out.println("===========================================");
		
	}
	
}
public class Ex10 {
  public static void main(String[] args) {
    Student2 std = new Student2("이순신");
    std.display();
  }
}

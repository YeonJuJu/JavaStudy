class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time() { }
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	// setter :  멤버변수에 값을 설정하는 메소드
	// getter :  멤버변수에 저장된 값을 읽어오는 메소드
	// naming convention : set 이나  get 뒤에 
	//                     멤버변수의 이름의 첫 글자만 대문자로 해서
	//                     연결함
	
	public int getHour(){
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || 23 < hour) {
			System.out.println("시간을 정확하게 입력해 주세요");
			return;
		}
		this.hour = hour;
	}
  public int getMinute(){
		return minute;
	}
  public void setMinute(int minute) {
  	if(minute < 0 || 59 < minute) {
  		System.out.println("시간을 정확하게 입력해 주세요");
  		return;
  	}
  	this.minute = minute;
  }
	public int getSecond(){
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || 59 < second) {
			System.out.println("시간을 정확하게 입력해 주세요");
			return;
		}
		this.second = second;
	}
	@Override
	public String toString() {
		return hour + "시 " + minute + "분 " + second + "초 ";
	}
}
public class Ex12 {
  public static void main(String[] args) {
  	Time t1 = new Time();
  	/*
  	t1.hour = 10;
  	t1.minute = 20;
  	t1.second = 40;
  	*/
  	t1.setHour(10);
  	t1.setMinute(20);
  	t1.setSecond(40);
  	System.out.println("t1 : " + t1);
  	
  	t1.setHour(11);
  	t1.setMinute(70);
  	t1.setSecond(-10);
  	System.out.println("t1 : " + t1);
  }
}







public class Ex06 {
  public static void main(String[] args) {
  	new CDPlayer();
  }
}

abstract class Player{ // new Player()  <-- (X)
	boolean pauseStatus;
	int currentPosition;
	
	public Player() {
		pauseStatus = false;
		currentPosition = 0;
	}
	
	// Player 클래스를 상속하는 자손클래스(일반클래스)에서
	// 반드시 Overriding 해야 하는 메소드들을 추상 메소드로 작성함
	// 지정한 위치(position)에서 재생을 시작함
	abstract void play(int position);
	// 재생을 즉시 멈춤
	abstract void stop();
	
	public void play() {
		// 일반 메소드에서 추상 메소드를 호출할 수 있므
		//  ㄴ 메소드 호출시에는 선언부 정보만 알고 있으면 되므로
		//  play() 메소드는 추상 메소드이므로
		//  실제로 실행될 때는 자손클래스에서 
		//  일반 메소드로 구현된(overriding된) 메소드가 실행됨
		play(currentPosition);
	}
  public void pause() {
  	if(pauseStatus) { // pause 상태가 true인 경우 : 정지상태
  		pauseStatus =  false;  // pause 상태를 false 로 하여 실행상태로 함
  		play(currentPosition);  // 현재 위치에서 재생함
  	}else { // pause 상태가  false인 경우 : 실행상태
  		pauseStatus =  true;  // pause 상태를  true 로 하여  정지상태로 함
  		stop();  // 재생을 멈춤
  	}
  }
}

class CDPlayer extends Player{
	public CDPlayer() {
		super();
	}
	// 지정한 위치(position)에서 재생을 시작함
	@Override
	void play(int position) {
		
	}
	// 재생을 즉시 멈춤
	@Override
	void stop() {
		
	}
	
	// 자손클래스에서 추가된 멤버변수
	int currentTrack;
	
	public void nextTrack() {
		currentTrack++;
	}
	public void preTrack() {
		currentTrack--;
	}
}

class BlurayPlayer extends Player{

	@Override
	void play(int position) {
		
	}

	@Override
	void stop() {
		
	}
	
}







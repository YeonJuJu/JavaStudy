abstract class MouseEvents{
	public abstract void LButtonClick();
	public abstract void RButtonClick();
	public abstract void CButtonClick();
	public abstract void buttonClick();
}
class MouseEventsAdapter extends MouseEvents{
	public void LButtonClick() { };
	public void RButtonClick() { };
	public void CButtonClick() { };
	public void buttonClick() { };
}
class MyAppLButton extends MouseEventsAdapter{
	public void LButtonClick() {
		System.out.println("left Button Clicked !!!");
	};
	public void buttonClick() {
		System.out.println("left Button Clicked !!!");
	};
}
class MyAppRButton extends MouseEventsAdapter{
	public void RButtonClick() {
		System.out.println("right Button Clicked !!!");
	};
	public void buttonClick() {
		System.out.println("right Button Clicked !!!");
	};	
}
class MyAppCButton extends MouseEventsAdapter{
	public void CButtonClick() {
		System.out.println("center Button Clicked !!!");
	};
	public void buttonClick() {
		System.out.println("center Button Clicked !!!");
	};	
}
public class Ex05 {
  public static void main(String[] args) {
  	MouseEvents[] me = new MouseEvents[5];
  	
  	me[0] = new MyAppLButton();
  	me[1] = new MyAppCButton();
  	me[2] = new MyAppCButton();
  	me[3] = new MyAppRButton();
  	me[4] = new MyAppLButton();
  	
  	for(int i = 0; i < me.length; i++) {
  		me[i].buttonClick();
  	}
  	System.out.println("-----------------------------");
  	
  	MouseEvents left = new MyAppLButton();
  	MouseEvents right = new MyAppRButton();
  	MouseEvents center = new MyAppCButton();
  	
  	left.LButtonClick();
  	right.RButtonClick();
  	center.CButtonClick();
  	
  }
  
}






class Tv{
	boolean power;
	int channel;
	public void power() { power = !power; }
	public void channelUp() { channel++; }
	public void channelDown() { channel--; }
}
class CaptionTv extends Tv{
	String text;
	public void cpation() { System.out.println(text + " - 출력"); }
}
public class Ex15 {
  public static void main(String[ ]args) {
  	Tv        t = new Tv();
  	CaptionTv c = new CaptionTv();
  	c.power();
  	c.channelUp();
  	c.channelUp();
  	c.text = "안녕하세요";
  	c.cpation();
  	
  	t = c;
  	t.power();
  	t.channelUp();
  	t.channelUp();
  	// t.text = "안녕하세요";
  	// t.cpation();
  	
  	
  }
}

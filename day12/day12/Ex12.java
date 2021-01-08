import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex12 {
  public static void main(String[] args) {
  	Button btn = new Button("시작");
  	btn.addActionListener(new ActionListener() {
  		@Override
  		public void actionPerformed(ActionEvent e) {
  			System.out.println("ActionEvent 발생 !!!");
  		}
  	});
  	
  }
}







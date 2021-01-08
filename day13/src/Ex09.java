import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex09 {
  public static void main(String[] args) {
  	try(FileInputStream fis = new FileInputStream("java.txt");
  			BufferedInputStream bis = new BufferedInputStream(fis))
			{
  		  int data = -1;
			  while((data = bis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
  	
  }
}

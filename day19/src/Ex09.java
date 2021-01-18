import java.io.IOException;

/*
    Enter <= \r\n
             CR
 */

public class Ex09 {
    public static void main(String[] args){
        System.out.println("Program Start");

        try{
            int num = 0;
            System.out.print("Enter a Character : ");
            num = System.in.read();
            System.out.println("Read value (int) : " + num);
            System.out.println("Read value (char) : " + (char)num);

            //여기서 엔터까지 인식됨
            num = System.in.read();
            System.out.println("Read value (int) : " + num);
            System.out.println("Read value (char) : " + (char)num);

            num = System.in.read();
            System.out.println("Read value (int) : " + num);
            System.out.println("Read value (char) : " + (char)num);

        }catch (IOException e){

        }



        System.out.println("Program Finish");
    }
}

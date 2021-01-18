/*
    stream(스트림) : data 가 지나다니는 통로

    System.out.println()    : System.out => 표준  출력스트림
    new Scanner (System.in)    : System.in  => 표준  입력 스트림


    I/O 프로그램 핵심 내용 (keyword)

    1) in - read   : 입력과 관련     => data source 에서 data 를 읽어들임

    2) out - write : 출력과 관련련   => data destination 에 data 를 씀

    < I/O Program Process >

    1) data read
        1. data 를 정함 : Data Source
        2. data 에 적절한 InputStream 을 연결함
        3. data 에서 Java Application 으로 읽어들이는 작업을 함
            <-- in.read()
        4. data 를 다 읽은 후에는 반드시 Stream 을 닫아줌
            ㄴ> in.read() 가 -1 을 return

           read() : 1byte 씩 전송
           read(byte[]) : byte 배열의 크기 만큼 전송

    2) data write
        1. data 를 쓸 대상을 정함 (Data Destination)
        2. 대상에 적절한 output Stream 을 연결
        3. 대상에 data 를 써서 내보내는 작업을 함
            <-- out.write()
        4. data 를 다 쓴 이후에는 반드시 Stream 을 닫아줌
            ㄴ> close() 호출

            write() : 1 byte 의 data 를 전송
            write(byte[], start, length) : byte 배열에 들어있는 data 를
                                           시작 위치부터 길이까지 계산하여 전송

 */

import java.io.*;

public class Ex02 {
    public static void main(String[] args){
        InputStream in = null;

        try {
            in = new FileInputStream("C:\\EclipseIo\\Test.java");

            while(true){
                int data = in.read();
                System.out.print(data);
                if(data == -1){
                    break;
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}

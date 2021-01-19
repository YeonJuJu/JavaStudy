import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex13 {
    public static void main(String[] args){
        // file 을 랜덤하게 읽고 쓸 수 있는 클래스
        RandomAccessFile raf = null;

        // 한 번에 읽어들일 크기 설정
        int seekSize = 5;

        try {
            // a ~ z 까지 저장되어있음
            raf = new RandomAccessFile("c:\\EclipseIo\\RAF.dat", "r");

            /*
                == Options ==

                r   read
                rw  read & write
                rws read & write & save
                rwd read & write & save : 기본 저장 장치에 동기식으로 작성

             */

            String line = "";

            while((line = raf.readLine()) != null){
                // 전체 문자열 출력
                System.out.println(line);
            }

            // 문자열 길이
            long totalSize = raf.length();
            System.out.println("total length : " + totalSize);

            byte[] data = null;

            long onLineSize = totalSize / seekSize;

            long size = onLineSize + (totalSize % seekSize == 0 ? 0 : 1);

            for(int i=0;i<size;i++){
                data = new byte[seekSize];

                // seekSize 만큼 건너뛰며 access
                raf.seek(i * seekSize);

                // .readFully(data) => 배열에 data 가 다 들어있어야 읽음
                // z는 읽지 않음 (1개 밖에 없으니까~~)
                raf.readFully(data);

                System.out.println("pointer 위치 : " + raf.getFilePointer()
                        + ", 문자열(한 줄) : " + new String(data).trim());
            }

            raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e){
            // 파일의 끝에서 더 이상 읽을 데이터가 없는 경우 발생
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

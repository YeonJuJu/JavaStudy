//equals는 기본적으로..

import java.io.FileInputStream;

class Figure extends Object{
    public int number;

    //객체의 종류를 비교하기 위해서는 해당 함수를 다음과 같이 오버라이딩해주어야 함
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Figure){
            Figure f = (Figure) obj;
            boolean flag = (this.number == f.number);
            return flag;
        }
        return false;
    }
}

public class Ex11 {
    public static void main(String[] args){
        Figure f1 = new Figure();
        Figure f2 = new Figure();

        f1.number = 111;
        f2.number = 111;

        //equals 메소드를 오버라이딩 하지 않으면 다음 문장은 false
        //(기본적으로는 객체의 주소값을 비교하기 때문)
        System.out.println("f1.number == f2.number : " + f1.equals(f2));

        //각각의 클래스 비교
        System.out.println("f1 class == f2 class : " + (f1.getClass() == f2.getClass()));
    }
}

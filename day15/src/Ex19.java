import java.util.HashMap;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){
        HashMap map = new HashMap();

        //map 에서는 key 가 중복이 허용되지 않기 때문에
        //중복 입력이 발생하면 기존의 데이터가 삭제되고 새로운 데이터가 저장된다.
        map.put("myId", "1234");
        map.put("school", "1111");
        map.put("school", "5678");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("아이디와 비밀번호를 입력하세요.");
            System.out.print("아이디 : ");
            String id = scanner.next().trim();
            System.out.print("비밀번호 : ");
            String password = scanner.next().trim();

            System.out.println("==============================");

            if(!map.containsKey(id)){
                System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요");
                continue;
            }
            else{
                if(!(map.get(id)).equals(password)) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
                }
                else{
                    System.out.println("아이디와 패스워드가 일치합니다.");
                    break;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}

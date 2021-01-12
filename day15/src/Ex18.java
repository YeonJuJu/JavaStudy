import java.util.HashMap;

//일반적인 클래스를 비교할 때에는 equals와 hashCode 메소드를 오버라이딩 하여 처리함
public class Ex18 {
    public static void main(String[] args){
        HashMap<Name, Integer> map = new HashMap<>();

        map.put(new Name("해리", "포터"), new Integer(95));
        map.put(new Name("헤르미온느", "그레인저"), 100);
        map.put(new Name("론", "위즐리"), 85);
        map.put(new Name("드레이코", "말포이"), 92);
        map.put(new Name("네빌", "롱바텀"), 70);

        int score = map.get(new Name("해리", "포터"));
        System.out.println("해리 포터의 점수는 " + score + "점 입니다.");
    }
}
class Name{
    String firstName;
    String lastName;

    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Name){
            Name name = (Name) obj;
            if(name.firstName == this.firstName && name.lastName == this.lastName)
                return true;
            else
                return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return (firstName + lastName).hashCode();
    }
}

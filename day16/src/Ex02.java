import java.util.*;

public class Ex02 {
    static Scanner scanner = new Scanner(System.in);

    static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();

    public static void addGroup(String groupName){
        if(!phoneBook.containsKey(groupName)){
            phoneBook.put(groupName, new HashMap<>());
            return;
        }
        else{
            System.out.println("이미 존재하는 그룹 이름입니다.");
            return;
        }
    }

    public static void addPhoneNo(String groupName, String name, String phoneNum){
        if(!phoneBook.containsKey(groupName)){
            System.out.println("존재하지 않는 그룹입니다.");
            return;
        }

        HashMap group = phoneBook.get(groupName);
        if(group.containsKey(name)){
            System.out.print("이미 존재하는 이름입니다. 변경하시겠습니까? (y/n) : ");
            if(scanner.next().equals("y")){
                group.put(name, phoneNum);
            }
            return;
        }
        else{
            group.put(name, phoneNum);
        }
    }

    public static void addPhoneNo(String name, String phoneNum){
        addPhoneNo("default", name, phoneNum);
    }

    public static void phoneList(){
        Set set = phoneBook.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            //me : key=group name, value=hash map
            Set set2 = ((HashMap) me.getValue()).entrySet();
            Iterator iterator2 = set2.iterator();
            System.out.println("===============" + me.getKey() + "=============");
            while(iterator2.hasNext()){
                Map.Entry meme = (Map.Entry) iterator2.next();
                System.out.println(meme.getKey() + "    " + meme.getValue());
            }
            System.out.println("=>" + set2.size());
        }
    }

    public static void main(String[] args){
        addGroup("default");
        addGroup("friend");
        addGroup("company");
        addGroup("family");

        addPhoneNo("friend", "jungkook", "010-1234-5678");
        addPhoneNo("friend", "taehyung", "010-1234-5678");
        addPhoneNo("friend", "jimin", "010-1234-5678");

        addPhoneNo("company", "yoongi", "010-1234-5678");
        addPhoneNo("company", "namjoon", "010-1234-5678");

        addPhoneNo("family", "jin", "010-1234-5678");

        addPhoneNo( "yeonju", "010-1234-5678");

        phoneList();

        addPhoneNo("bf", "bread", "010-9876-5432");

        addPhoneNo( "yeonju", "010-0000-0000");

        phoneList();

    }
}

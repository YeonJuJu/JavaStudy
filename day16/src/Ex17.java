

// MessageFormat

import java.text.MessageFormat;

public class Ex17 {
    public static void main(String[] args){
        String tableName = "CUST_INFO";

        //Message format
        String message = "INSERT INTO " + tableName + " VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'');";

        //0부터 차례로 들어감
        Object[][] arguments = {{"이순신", "010-3535-7241", "48", "40-25"},
                                {"안중근", "010-8563-6784", "32", "10-07"}};

        for(int i=0;i<arguments.length;i++){
            String result = MessageFormat.format(message, arguments[i]);
            System.out.println(result);
        }

        System.exit(0);

    }
}

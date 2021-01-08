public class Ex19 {
    public static void main(String[] args){
        Integer i1 = new Integer(111);
        Integer i2 = new Integer(111);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        // compareTo -> 같으면 0 아니면 그 외 다른 숫자
        System.out.println(i1.compareTo(i2));
        System.out.println(i1.toString());
        System.out.println(i2);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE); //bits
        System.out.println(Integer.BYTES);//bytes
        System.out.println(Integer.TYPE);

        int i3 = new Integer("111");
        System.out.println(i3);

        i3 = new Integer("111").intValue();
        System.out.println(i3);

        int i4 = Integer.parseInt("222");    //return type : int
        int i5 = Integer.valueOf("333");        //return type : Integer

        int i6 = 10;
        Integer intg = i6; // primitive --> reference : auto boxing

        Object obj = intg;
               obj = (Object) i6; //와 같음

        Long lng = 100L;
             lng = new Long(100); //와 같음

        int result = intg + i6;
        System.out.println(result);
    }
}

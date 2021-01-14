// enum Size2 { SMALL, MEDIUM, LARGE }

// enum method
// name(), ordinal(), values(), valuesOf(String name)

public class Ex12 {
    public static void main(String[] args){
        Size2 size = Size2.MEDIUM;  // => new Size2("MEDIUM")
        System.out.println("size.name() : " + size.name());
        System.out.println("size.ordinal() : " + size.ordinal());   // => index num

        System.out.println("===============================");

        size = size.valueOf("LARGE");
        System.out.println("size.name() : " + size.name());
        System.out.println("size.ordinal() : " + size.ordinal());   // => index num

        System.out.println("===============================");

        size = Size2.valueOf("SMALL");
        System.out.println("size.name() : " + size.name());
        System.out.println("size.ordinal() : " + size.ordinal());   // => index num

        System.out.println("===============================");

        Size2[] arrSize = Size2.values();
        for(Size2 s : arrSize){
            System.out.println("s.name() : " + s.name());
            System.out.println("s.ordinal() : " + s.ordinal());   // => index num

            System.out.println("===============================");
        }
    }
}

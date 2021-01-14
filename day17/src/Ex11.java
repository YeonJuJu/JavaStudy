

public class Ex11 {
    enum Colors {RED, GREEN, BLUE}

    String str;
    int number;

    public static void main(String[] args){
        System.out.println("Colors.RED : " + Colors.RED);
        System.out.println("Colors.GREEN : " + Colors.GREEN);
        System.out.println("Colors.BLUE : " + Colors.BLUE);

        Size2 size = Size2.SMALL; //  => new Size2("SMALL")
        //System.out.println("Size2 size : " + size);

        if(size == Size2.SMALL){
            System.out.println("small");
        }
        else if(size == Size2.MEDIUM){
            System.out.println("medium");
        }
        else if(size == Size2.LARGE){
            System.out.println("large");
        }

        Colors color = Colors.GREEN;
        switch (color){
            case RED:
                System.out.println("red");
                break;
            case GREEN:
                System.out.println("green");
                break;
            case BLUE:
                System.out.println("blue");
                break;
        }
    }
}

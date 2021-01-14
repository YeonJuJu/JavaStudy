package inheritance;

public class Tv {
    private String name;

    public Tv(){
        this("우리집 TV");
    }
    public Tv(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

}

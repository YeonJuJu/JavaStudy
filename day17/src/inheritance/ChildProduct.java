package inheritance;

// 부모와 자식의 이니셜은 달라도 되지만
// 상속하는 줄에서는 맞춰줘야한다.
public class ChildProduct<K, M, C> extends Product<K, M> {
    private C company;

    public void setCompany(C company){
        this.company = company;
    }

    public C getCompany(){
        return company;
    }
}

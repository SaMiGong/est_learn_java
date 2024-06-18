package Java0618.Java0618_3;

public class ChildProduct<T,M,C> extends Product<T,M> {
    private C company;

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}

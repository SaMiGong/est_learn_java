package Java0613.Java1613_5;

public abstract class Phone {
    private String owner;

    public Phone(String owner){
        String owner1 = this.owner;
    }
    public void trunOn(){
        System.out.println("폰 전원을 킵니다.");
    }
    public void trunOff(){
        System.out.println("폰 전원을 끕니다.");
    }
}

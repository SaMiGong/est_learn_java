package Java0617.Java0617_Ex.Java0617_1;

public class Test {
    public static void main(String[] args){
    Car kiaCar = new KiaCar();

    Engine engine = kiaCar;
    engine.showEngine();

    Navi navi = kiaCar;
    navi.amountNavi();

    Tier tier = kiaCar;
    tier.getTier();

    kiaCar.showEngine();
    kiaCar.amountNavi();
    kiaCar.getTier();
    }
}

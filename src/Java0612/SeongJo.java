package Java0612;

public class SeongJo {

    int weight;
    int money;
    boolean fat;

    public SeongJo(int weight, int money) {
        this.weight = weight;
        this.money = money;
        this.fat = false;
    }

    public void buyFood(Food food){ // Food 라는 추상적 객체가 필요
        this.money -= food.cost; // 음식을 사니까 내 지갑에서 돈을 빼라
    }

    public void eatFood(Food food){
        this.weight += food.weight;
        if(this.weight >= 150){
            this.fat = true;
        }
    }
}

package Java0617.Java0617_4;

public class ProfileDBRepository implements ProfileRepository {
    @Override
    public void save() {
    System.out.println("DB에 프로필 저장");
    }
}

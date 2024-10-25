package animal;

public class Human extends Animal implements Thinkable {
  private String hobby;

  Human() {}

  Human(String name, int age, String hobby) {
    super(name, age);
    this.hobby = hobby;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  @Override
  public void think() {
    System.out.println(String.format("私は%sについて考えています。", hobby));
  }
}

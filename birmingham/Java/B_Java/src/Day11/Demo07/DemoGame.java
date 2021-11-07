package Day11.Demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("pia~pia~");
            }
        };
        hero.setSkill(skill);
    }
}

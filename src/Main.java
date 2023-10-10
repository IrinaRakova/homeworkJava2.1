public class Main {
    public static void main(String[] args) {
        int ticket = 9999; //стоимость билета
        int oneMileBonus = 20; //стоимость одной бонусной мили

        int bonus = ticket / oneMileBonus;
        System.out.println("Количество начисленных миль: " + (bonus));
    }
}
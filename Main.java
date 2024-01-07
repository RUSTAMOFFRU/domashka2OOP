public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Рустам");
        Human human2 = new Human("Эльдар");
        Human human3 = new Human("Марианна");
        Market market = new Market();
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
        market.acceptToMarket(human3);
        market.update();
    }
}
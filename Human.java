public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {

        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean make) {
        isMakeOrder = make;
    }

    @Override
    public void setTakeOrder(boolean take) {
        isTakeOrder = take;
    }

}

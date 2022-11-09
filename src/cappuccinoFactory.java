class cappuccinoFactory extends coffeeFactory {

    @Override
    public Coffee makeCoffee(String typeOfCoffee, int sugarSpoons) {
        return new Cappuccino(sugarSpoons, typeOfCoffee);
    }
}

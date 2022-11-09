class rafFactory extends coffeeFactory {

    @Override
    public Coffee makeCoffee(String typeOfCoffee, int sugarSpoons) {
        return new Raf(sugarSpoons, typeOfCoffee);
    }
}

class mochaFactory extends coffeeFactory {

    @Override
    public Coffee makeCoffee(String typeOfCoffee, int sugarSpoons) {
        return new Mocha(sugarSpoons, typeOfCoffee);
    }
}

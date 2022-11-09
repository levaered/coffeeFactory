class latteFactory extends coffeeFactory {

    @Override
    public Coffee makeCoffee(String typeOfCoffee, int sugarSpoons) {
        return new Latte(sugarSpoons, typeOfCoffee);
    }

}

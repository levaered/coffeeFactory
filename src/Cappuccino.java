class Cappuccino extends Coffee {
    public Cappuccino(int sugarSpoons, String coffeType) {
        countOfSugar = sugarSpoons;
        typeOfCoffe = coffeType;
        name = "Cappuccino";
        ingredients.add("30% - milk");
        ingredients.add("70% - coffee");
    }
}

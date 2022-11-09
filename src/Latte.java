class Latte extends Coffee {
    public Latte(int sugarSpoons, String coffeType) {
        countOfSugar = sugarSpoons;
        typeOfCoffe = coffeType;
        name = "Latte";
        ingredients.add("70% - milk");
        ingredients.add("30% - coffee");
    }
}

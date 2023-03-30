public enum Drink {
    OLD_FASHIONED("Old Fashioned"),
    NEGRONI("Negroni"),
    DAIQUIRI("Daiquiri"),
    DRY_MARTINI("Dry Martini"),
    MARGARITA("Margarita"),
    ESPRESSO_MARTINI("Espresso Martini"),
    WHISKEY_SOUR("Whiskey Sour"),
    MANHATTAN("Manhattan"),
    APEROL_SPRITZ("Aperol Spritz"),
    MOJITO("Mojito");

    private String drinkString;

    Drink(String drinkString){
        this.drinkString = drinkString;
    }

    public String getDrinkString(){
        return this.drinkString;
    }

}

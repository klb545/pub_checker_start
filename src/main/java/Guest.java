public class Guest {

    private String name;
    private int age;
    private double wallet;
    private SobrietyLevel sobrietyLevel;
    private BannedStatus bannedStatus;
    private char currency;
    private Drink favouriteDrink;


    public Guest(String name, int age, double wallet, SobrietyLevel sobrietyLevel, BannedStatus bannedStatus, char currency, Drink favouriteDrink){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobrietyLevel = sobrietyLevel;
        this.bannedStatus = bannedStatus;
        this.currency = currency;
        this.favouriteDrink = favouriteDrink;
    }

//    getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getWallet(){
        return this.wallet;
    }
    public SobrietyLevel getSobrietyLevel(){
        return this.sobrietyLevel;
    }
    public BannedStatus getBannedStatus(){
        return this.bannedStatus;
    }
    public char getCurrency(){
        return this.currency;
    }
    public Drink getFavouriteDrink(){
        return this.favouriteDrink;
    }

//    setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setWallet(double newWallet){
        this.wallet = newWallet;
    }
    public void setSobrietyLevel(SobrietyLevel newSobrietyLevel){
        this.sobrietyLevel = newSobrietyLevel;
    }
    public void setBannedStatus(BannedStatus newBannedStatus){
        this.bannedStatus = newBannedStatus;
    }
    public void setCurrency(char newCurrency){
        this.currency = newCurrency;
    }
    public void setFavouriteDrink(Drink newFavouriteDrink){
        this.favouriteDrink = newFavouriteDrink;
    }



    public boolean isGuestOver18() {
        if(this.age >= 18){
            return true;
        } else {
            return false;
        }
    }
}

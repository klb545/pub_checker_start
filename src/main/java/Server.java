import java.util.ArrayList;

public class Server {

    private String name;
    private ArrayList<Drink> drinksRepertoire;

    public Server(String name){
        this.name = name;
        this.drinksRepertoire = new ArrayList<>(); // start with empty ArrayList
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Drink> getDrinksRepertoire() {
        return drinksRepertoire;
    }

    public void addDrinkToDrinksRepertoire(Drink drink) {
        this.drinksRepertoire.add(drink);
    }

    public boolean canServeGuest(Guest guest){
        if(guest.getAge() >= 18 && guest.getWallet() >= 5 && guest.getSobrietyLevel().getLevelNumber() < 4 && guest.getBannedStatus() == BannedStatus.PERMITTED && guest.getCurrency() == '£' && this.drinksRepertoire.contains(guest.getFavouriteDrink())){
            return true;
        } else {
            return false;
        }
    }
}

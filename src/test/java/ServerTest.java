import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Currency;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    Server server;
    Guest guest;
    SobrietyLevel sobrietyLevel;

    @BeforeEach
    public void setUp(){
        server = new Server("Katie");
        server.addDrinkToDrinksRepertoire(Drink.ESPRESSO_MARTINI);
        guest = new Guest("Leo", 25, 10, SobrietyLevel.SOBER, BannedStatus.PERMITTED, '£', Drink.ESPRESSO_MARTINI);
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void canOnlyBeServedOver18_testForTrue(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }
    @Test
    public void canOnlyBeServedOver18_testForFalse() {
        guest.setAge(17);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
//    Guest class needs a wallet attribute + getter + setter
    @Test
    public void canOnlyBeServedIfEnoughMoney_testForTrue(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }
    @Test
    public void canOnlyBeServedIfEnoughMoney_testForFalse(){
        guest.setWallet(4);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }
//    Create a Drink class with name and price attributes + set price to £5 and create getters and setters


    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canOnlyBeServedIfSober_testForTrue(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }
    @Test
    public void canOnlyBeServedIfSober_testForFalse(){
        guest.setSobrietyLevel(SobrietyLevel.STUPOR);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void canOnlyBeServedIfNotBannedFromPub_testForPermitted(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }
    @Test
    public void canOnlyBeServedIfNotBannedFromPub_testForBanned(){
        guest.setBannedStatus(BannedStatus.BANNED);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }
    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void canOnlyBeServedIfPayingInLocalCurrency_testFor£(){
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }
    @Test
    public void canOnlyBeServedIfPayingInLocalCurrency_testForNot£(){
        guest.setCurrency('$');
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }
    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)
    @Test
    public void canOnlyBeServedIfServerCanMakeFavouriteDrink_TestForTrue(){
        server.addDrinkToDrinksRepertoire(Drink.ESPRESSO_MARTINI);
        assertThat(server.canServeGuest(guest)).isEqualTo(true);
    }
    @Test
    public void canOnlyBeServedIfServerCanMakeFavouriteDrink_TestForFalse(){
        guest.setFavouriteDrink(Drink.DAIQUIRI);
        assertThat(server.canServeGuest(guest)).isEqualTo(false);
    }
}

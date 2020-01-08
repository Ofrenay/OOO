package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private CD cd;
    private Game game;
    private Movie movie;
    private Game g;

    @Before
    public void setUp(){
        shop = new Shop();
        cd = new CD("saturation III", "1","bien ding");
        game = new Game("wow classic","2","nerd");
        movie = new Movie("toy story 4","3","idk ik heb die nog ni gezien");
        g = new Game("test","4","yee");
        shop.addProduct(movie);
        shop.addProduct(game);
        shop.addProduct(cd);
        shop.addProduct(g);
    }
    //test
    //mss nog werk aan ni zeker hoe het huren werkt in dit programma
    @Test
    public void mogelijk_cd_huren(){
        assertEquals(shop.getProduct("1"),cd);
    }


    @Test
    public void volgorde_producten_juist(){
        List<String> products = new ArrayList<>();

        products.add(movie.getCategorie() +" " + movie.getId() + " " + movie.getBeschrijving());
        products.add(game.getCategorie() +" " + game.getId() + " " + game.getBeschrijving());
        products.add(g.getCategorie() +" " + g.getId() + " " + g.getBeschrijving());
        products.add(cd.getCategorie() + " " + cd.getId() + " " + cd.getBeschrijving());
        assertEquals(products,shop.getProducts());
    }

    //methode voor automatische nieuwe ID nog toevoegen xp
    @Test
    public void nieuwe_id_1_hoger(){
        Movie xd = new Movie("jhsdjfsd","jksdhfjsdf","df");
        assertEquals(xd.getId(),"5");
    }

    @Test
    public void tonen_dat_product_wordt_uitgeleend(){
        //methode van huren
          assertEquals("verhuurd",shop.getProduct(movie.getId()));
    }


}

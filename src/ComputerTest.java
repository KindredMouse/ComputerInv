import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    @Test
    public void testRestockIncreasesStock() {
    Computer comp = new Computer ("HP",800.00,9);
    comp.restock(6);
    assertTrue(comp.getStock() == 15);
    }

    @Test
    public void testSellReducesStock() {
    Computer comp = new Computer ("Mac",1000,10);
    comp.sell(4);
    assertTrue(comp.getStock()==6);
    }

    @Test
    public void testSellFailsOnInsufficientStock(){
    Computer comp = new Computer ("Mac",1000,5);
    comp.sell(6);
    assertFalse(comp.getStock()<0);
    };

    @Test
    public void testSellFailsOnNegativeQuantity() {
    Computer comp = new Computer ("Mac",1000,3);
    comp.sell(-1);
    assertFalse(comp.getStock()>3);
    }

    @Test
    public void testRestockIgnoresNegativeValues() {
    Computer comp = new Computer ("Mac",1000,1);
    comp.restock(-1);
    assertTrue(comp.getStock()==1);
    }

    @Test
    public void testGetSummaryReturnsCorrectFormat() {
    Computer comp = new Computer ("Mac",460,8);
    System.out.println(comp.getSummary());
    assertTrue(comp.getSummary().equals("Brand: Mac\n" +
                                        "Price: $460.0\n" +
                                        "In Stock: 8"));
    }
}
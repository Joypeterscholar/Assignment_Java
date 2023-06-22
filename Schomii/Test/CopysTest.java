import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class CopysTest {
    int book = 0;
    @Test
    public void testThatCopysExist(){
   Copys book = new Copys();
   book.noOfCopys(0);
   assertEquals(0, book.noOfCopys(0));
    }

    @Test
    public void testForOneToFourCopys(){
        Copys book = new Copys();
        book.noOfCopys(4);
        assertEquals(2_000, book.noOfCopys(4));
    }

    @Test
    public void testForFiftyToNinetyNineCopys(){
        Copys book = new Copys();
        book.noOfCopys(66);
        assertEquals(1300, book.noOfCopys(66));
    }

}

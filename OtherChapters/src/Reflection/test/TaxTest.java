//package Reflection.test;
//
//import org.junit.jupiter.api.Assertions;
//
//import static org.junit.Assert.assertEquals;
//public class TaxTest {
//    Tax tax = new Tax();
//
//    @Test
//    public void testFor30000AndBelow() {
//        tax.setEarning(30000);
//        double taxCalculated = tax.calculateTax(tax.getEarning());
//        Assertions.assertEquals(4500.0, taxCalculated);
//    }
//
//    @Test
//    public void testFor20000AndBelow() {
//        tax.setEarning(20000);
//        double taxCalculated = tax.calculateTax(tax.getEarning());
//        Assertions.assertEquals(4000.0, taxCalculated);
//    }
//
//    @Test
//    public void testFor50000AndBelow() {
//        tax.setEarning(50000);
//        double taxCalculated = tax.calculateTax(tax.getEarning());
//        Assertions.assertEquals(7500.0, taxCalculated);
//    }
//}
//

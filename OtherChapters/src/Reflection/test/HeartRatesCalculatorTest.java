//package Reflection.test;
//
//import org.junit.jupiter.api.BeforeEach;
//
//import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class HeartRatesCalculatorTest {
//    private HeartRates heartRates;
//@BeforeEach
//private void setUp(){
//    heartRates = new HeartRates("James", "Bond", "12-April-2023");
//    }
//    @Test
//    public void testThatAllArgsConstructorExistInHeartRates(){
//    heartRates = new HeartRates("James", "Bond", "12-April-2023");
//    assertNotNull(heartRates);
//    }
//    @Test
//    public void testGetFirstName() {
//        String firstName = heartRates.getFirstName();
//            assertEquals("James", firstName);
//        }
//        @Test
//        public void testGetLastName(){
//            String lastName = heartRates.getLastName();
//                assertEquals("Bond", lastName);
//            }
//            @Test
//            public void testGetDateOfBirth () {
//                String dateOfBirth = heartRates.getDateOfBirth();
//                    assertEquals("12-April-2023", dateOfBirth);
//                }
//
// @Test
//   public void testSetFirstName() {
//        heartRates.setFirstName("peter");
//assertEquals("peter", heartRates.getFirstName());
//    }
//    @Test
//    public void testSetLastName(){
//        heartRates.setLastName("joy");
//        assertEquals("joy", heartRates.getLastName());
//    }
//    @Test
//    public void testSetDateOfBirth () {
//        heartRates.setDateOfBirth("01-May-2022");
//        assertEquals("01-May-2022", heartRates.getDateOfBirth());
//    }
//    @Test
//    public void getAgeTest(){
//    heartRates.setDateOfBirth("03-apr-2021");
//    assertEquals(2, heartRates.getAge());
//    }
//    @Test
//    public void getAgeTest2(){
//        heartRates.setDateOfBirth("03-jun-2000");
//        assertEquals(23, heartRates.getAge());
//    }
//    @Test
//    public void getMaximumHeartRate(){
//    heartRates.setDateOfBirth("03-jun-2000");
//    assertEquals(197, heartRates.getMaximumHeartRate());
//    }
//    @Test
//    public void getTargetHeartRate(){
//    heartRates.setDateOfBirth("03-jun-2000");
//   assertEquals("98.5-167.45", heartRates.getTargetHeartRate());
//}
//}
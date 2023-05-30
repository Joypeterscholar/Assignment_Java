package Reflection.test;

import Reflection.Mammal;

public class LivingThingsTest {
    @Test
    public void test(){
        Object age = 23;
        age = "Ade";
        age = new LivingThingsTest();
        age = new Mammal();
        age = 'c';
        age = true;
        age = 2.34;
    }
    }

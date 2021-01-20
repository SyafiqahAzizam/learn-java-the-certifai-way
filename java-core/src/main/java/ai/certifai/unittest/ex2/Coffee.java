package ai.certifai.unittest.ex2;

/**
 * Demo of Unit Test (Class)
 * Solution : At Bottom of this file
 * Test Naming Method : MethodName_ExpectedBehavior_StateUnderTest
 * @author Boon Khai Yeoh
 */

/**
 * Task 1 : Create a test program file
 *
 *
 * Task 2 : Create a simple test use assertEquals to evaluate the type of coffee
 * by set the value Example : Coffee coffee = new Coffee("Espresso",9);
 * and using getCoffeeType() to get the coffee type
 *
 *
 * Task 3 : Create a simple test use assertEquals to evaluate the price of coffee
 * by set the value Example : Coffee coffee = new Coffee("Latte",11);
 * and using getPrice() to get the coffee price
 *
 *
 * Task 4 : Create a simple test use assertAll to evaluate the types of coffee
 * Your type of coffee should be include : Espresso, Latte ,Mocha
 * and using allCoffeeType() to get the type of coffee
 *
 *
 * Task 5 : Create a exception test to evaluate negative price value
 * Type of Exception :  ExceptionIllegalArgumentException
 *
 */

public class Coffee {

    private String coffeeType;
    private double price;



    public Coffee(String coffeeType, double price){
        this.coffeeType = coffeeType;
        this.price=price;

    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= -1 ){
            throw new IllegalArgumentException("Price must be >=0");
        }
        this.price = price;
    }

}

/** ============================================
 *            Solution for test file
 *  ============================================
 * Task 1 : Create a test program file
 * Put the cursor to the class name "Coffee"
 * Right click -> Generate -> test
 *
 *
 * Task 2 : Create a simple test use assertEquals to evaluate the type of coffee
 *    @Test
 *    @DisplayName("getCoffeeType_True_IFCoffeeTypeSameWithUserDefine")
 *     void getCoffeeType() {
 *         Coffee coffee = new Coffee("Espresso",9);
 *         assertEquals("Espresso",coffee.getCoffeeType());
 *     }
 *
 *
 * Task 3 : Create a simple test use assertEquals to evaluate the price of coffee
 *     @Test
 *     @DisplayName("getPrice_True_IFCoffeePriceSameWithUserDefine")
 *     void getPrice() {
 *         Coffee coffee = new Coffee("Latte",11);
 *         assertEquals(11,coffee.getPrice());
 *     }
 *
 *
 * Task 4 : Create a simple test use assertAll to evaluate the types of coffee
 *     @Test
 *     @DisplayName("allCoffeeType_True_IFAllCoffeeTypeSameWithUserDefine")
 *     void allCoffeeType() {
 *         Coffee espresso = new Coffee("Espresso",9);
 *         Coffee latte = new Coffee("Latte",11);
 *         Coffee mocha = new Coffee("Mocha",12);
 *
 *         assertAll(
 *                 ()->assertEquals("Espresso",espresso.getCoffeeType()),
 *                 ()->assertEquals("Latte",latte.getCoffeeType()),
 *                 ()->assertEquals("Mocha",mocha.getCoffeeType())
 *         );
 *     }
 *
 *
 * Task 5 : Create a exception test to evaluate negative price value
 *     @Test
 *     @DisplayName("exceptionTest_ExceptionThrown_IFCoffeePriceNegative")
 *     void exceptionTest() {
 *         Coffee coffee = new Coffee("Latte",11);
 *         assertThrows(IllegalArgumentException.class,
 *                 ()->coffee.setPrice(-1));
 *     }
 */
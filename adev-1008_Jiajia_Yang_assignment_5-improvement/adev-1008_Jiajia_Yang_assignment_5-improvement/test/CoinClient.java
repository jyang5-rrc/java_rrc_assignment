/**
 * Name:Jiajia Yang
 * Program:Business Information Technology
 * Course:ADEV-1008 Programming 1
 * Created:2022-11-04
 * Updated:2022-11-06
 */

/**
 * Moudule5 a class encapsulating the concept of Coins.
 * 
 * @author Jiajia Yang
 * @version 1.0
 * 
 */

public class CoinClient 
{
    public static void main(String[] args)
    {
        System.out.println("Coins(int, int, int)");
        System.out.println("Test #1 - Iniialize the number of quarters.");
        constructor1_quarters_initialize();

        System.out.println("Test #2 - Iniialize the number of dimes.");
        constructor1_dimes_initialize();

        System.out.println("Test #3 - Iniialize the number of nickels.");
        constructor1_nickels_initialize();

        System.out.println("Coins()");
        System.out.println("Test #1 - Iniialize the number of quarters.");
        constructor2_quarters_initialize();

        System.out.println("Test #2 - Iniialize the number of dimes.");
        constructor2_dimes_initialize();

        System.out.println("Test #3 - Iniialize the number of nickles.");
        constructor2_nickels_initialize();

        System.out.println("setQuarters(int): void");
        System.out.println("Test #1 - Update state of quarters.");
        setQuarters_quarters_updateState();

        System.out.println("setDimes(int): void");
        System.out.println("Test #1 - Update state of dimes.");
        setDimes_dimes_updateState();

        System.out.println("setNickels(int): void");
        System.out.println("Test #1 - Update state of nickels.");
        setNickels_nickels_updateState();

        System.out.println("getDollarAmount(): double");
        System.out.println("Test #1 - Returns the correct dollar amount.");
        getDollarAmount1_dollarAmount_correct();

        System.out.println("getDollarAmount(CoinType): double");
        System.out.println("Test #1 - Returns the correct dollar amount for the quarter CoinType.");
        getDollarAmount2_quarterCoinType_correct();

        System.out.println("Test #2 - Returns the correct dollar amount for the dimes CoinType.");
        getDollarAmount2_dimeCoinType_correct();

        System.out.println("Test #3 - Returns the correct dollar amount for the nickels CoinType.");
        getDollarAmount2_nickelCoinType_correct();

        System.out.println("(static)getDollarAmount(int, int, int): double");
        System.out.println("Test #1 - Returns the correct dollar amount.");
        getDollarAmount3_dollarAmount_correct();

        System.out.println("toString(): String");
        System.out.println("Test #1 - Returns the correct String representation.");
        toString_stringRepresentation_correct();

    }
    
    /**
     * constructor1 - Coins(int, int, int)
     * Test #1 : Iniialize the number of quarters.
     */
    public static void constructor1_quarters_initialize()
    {
        // Setup test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;

        // Act
        Coins target = new Coins(quarters, dimes, nickels);

        // Confirm
        int expected = 5;
        int actual = target.getQuarters();

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);

    }
    
    /**
     * constructor1 - Coins(int, int, int)
     * Test #2 : Iniialize the number of dimes.
     */
    public static void constructor1_dimes_initialize() 
    {
        // Setup test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;

        // Act
        Coins target = new Coins(quarters, dimes, nickels);

        // Confirm
        int expected = 10;
        int actual = target.getDimes();

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);

    }

    /**
     * constructor1-Coins(int, int, int)
     * Test #3 : Iniialize the number of nickels.
     */
    public static void constructor1_nickels_initialize() 
    {
        // Setup test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;

        // Act
        Coins target = new Coins(quarters, dimes, nickels);

        // Confirm
        int expected = 15;
        int actual = target.getNickels();

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);

    }

    /**
     * constructor2-Coins()
     * Test #1 : Iniialize the number of quarters.
     */
    public static void constructor2_quarters_initialize() 
    {

        // Act
        Coins target = new Coins();

        // Confirm
        int expected = 0;
        int actual = target.getQuarters();

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);

    }
    
    /**
     * constructor2-Coins()
     * Test #2 : Iniialize the number of dimes.
     */
    public static void constructor2_dimes_initialize() 
    {

        // Act
        Coins target = new Coins();

        // Confirm
        int expected = 0;
        int actual = target.getDimes();

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);

    }

    /**
     * constructor2-Coins()
     * Test #3 : Iniialize the number of nickels.
     */
    public static void constructor2_nickels_initialize() {

        // Act
        Coins target = new Coins();

        // Confirm
        int expected = 0;
        int actual = target.getNickels();

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);

    }

    /**
     * setQuarters(int): void
     * Test #1 : Update state of quarters.
     */
    public static void setQuarters_quarters_updateState()
    {
        // Setup test data
        int quarters = 2;

        // Act
        Coins target = new Coins();
        target.setQuarters(quarters);

        // Confirm
        int expected = 2;
        int actual = target.getQuarters();

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);

    }
    
    /**
     * setDimes(int): void
     * Test #1 : Update state of dimes.
     */
    public static void setDimes_dimes_updateState()
    {
        // Setup test data
        int dimes = 4;

        // Act
        Coins target = new Coins();
        target.setDimes(dimes);

        // Confirm
        int expected = 4;
        int actual = target.getDimes();

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);
    }

    /**
     * setNickels(int): void
     * Test #1 : Update state of nickels.
     */
    public static void setNickels_nickels_updateState()
    {
        // Setup test data
        int nickels = 6;

        // Act 
        Coins target = new Coins();
        target.setNickels(nickels);

        // Confirm
        int expected = 6;
        int actual = 6;

        System.out.printf("Expected: %d%nActual: %d%n%n", expected, actual);

    }

    /**
     * getDollarAmount(): double
     * Test #1 : Returns the correct dollar amount.
     */
    public static void getDollarAmount1_dollarAmount_correct() 
    {
        // Set up test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;

        // Act 
        Coins target = new Coins(quarters, dimes, nickels);

        // Confirm
        double expected = 3;
        double actual = target.getDollarAmount();

        System.out.printf("Expected: %f%nActual: %f%n%n", expected, actual);
    }

    /**
     * getDollarAmount(CoinType): double
     * Test #1 : Returns the correct dollar amount for the quarter CoinType.
     */
    public static void getDollarAmount2_quarterCoinType_correct()
    {
        // Set up test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;
        CoinType type = CoinType.QUARTER;

        // Act
        Coins target = new Coins(quarters, dimes, nickels);

        // Confirm
        double expected = 1.25;
        double actual = target.getDollarAmount(type);

        System.out.printf("Expected: %f%nActual: %f%n%n", expected, actual);
    }

    /**
     * getDollarAmount(CoinType): double
     * Test #2 : Returns the correct dollar amount for the dime CoinType.
     */
    public static void getDollarAmount2_dimeCoinType_correct()
    {
        // Set up test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;
        CoinType type = CoinType.DIME;

        // Act
        Coins target = new Coins(quarters, dimes, nickels);
        
        // Confirm
        double expected = 1.00;
        double actual = target.getDollarAmount(type);

        System.out.printf("Expected: %f%nActual: %f%n%n", expected, actual);

    }

    /**
     * getDollarAmount(CoinType): double
     * Test #3 : Returns the correct dollar amount for the nickel CoinType.
     */
    public static void getDollarAmount2_nickelCoinType_correct() {
        // Set up test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;
        CoinType type = CoinType.NICKEL;

        // Act
        Coins target = new Coins(quarters, dimes, nickels);

        // Confirm
        double expected = 0.75;
        double actual = target.getDollarAmount(type);

        System.out.printf("Expected: %f%nActual: %f%n%n", expected, actual);

    }

    /**
     * (static)getDollarAmount(int, int, int): double
     * Test #1 : Returns the correct dollar amount.
     */
    public static void getDollarAmount3_dollarAmount_correct()
    {
        //Set up test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;

        // Confirm
        double expected = 3;
        double actual = Coins.getDollarAmount(quarters, dimes, nickels);

        System.out.printf("Expected: %f%nActual: %f%n%n", expected, actual);

    }

    /**
     * toString(): String
     * Test #1 : Returns the correct String representation.
     */
    public static void toString_stringRepresentation_correct()
    {
        // Set up test data
        int quarters = 5;
        int dimes = 10;
        int nickels = 15;
        
        // Act
        Coins target = new Coins(quarters, dimes, nickels);

        //Confirm
        String expected = "Quarters: 5\nDimes: 10\nNickels: 15\nTotal Value: $3.00\n";
        String actual = target.toString();

        System.out.printf("Expected:%n%s%nActual:%n%s%n%n", expected, actual);
    }
}
package calculator;

public class TestingMain {
    public static void main(String[] args) {
           testAdd();

           testSubtract();
    }

    private static void testAdd() {
        Calculator calculator = new Calculator();


        int result1 = calculator.add(5, 3);
        if (result1==8){
            System.out.println("Test add passed.");
        }else{
            System.out.println("Test add failed.");
        }




    }

    private static void testSubtract() {
        Calculator calculator = new Calculator();


        int result1 = calculator.subtract(10, 3);
        if (result1==7){
            System.out.println("Test subtract passed");
        }else{
            System.out.println("Test subtract failed");
        }


    }
}

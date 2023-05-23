public class Main {
    public static void main(String[] args) {
        //(Line 4) a null pointer exception can occur here when you don’t initialize the instance variables, the default will be null
        int [] numbers = new int [] {1,2,3,4,5};
        int sum = 0;
        try
        {
        for (int i = 0; i < numbers.length; i ++)
            // (Line 11) a null pointer exception can occur here when you don’t initialize the instance variables, the default will be null
            // (Line 11) ArrayIndexOutOfBoundsException can occur here when accessing elements that fall outside this range
            // (Line 11) Debugging Break points - Variable inspection to review the values
            sum = sum + numbers [i];
            //(Line 14) Debugging Breakpoints - Variable inspection to review the values
        double average = sum / numbers.length; // a logical error can occur here, for example instead of the / a % was in place.
            //The program will still run however the output would be incorrect.
            //To fix this error placing a System.out.println() after the sum to check the values and after the average
        System.out.println("Array average value is: " + average);
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print("array index out of bounds exception caught");
        }
        }//I can also review the stack trace as well if an error occurs. The stack trace can help pinpoint the cause of the issue and identify specific methods of where the bug may be hiding
        }


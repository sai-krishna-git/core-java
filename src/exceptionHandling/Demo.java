package exceptionHandling;

public class Demo
{
    public static void main(String[] args) {
        int a = 5;
        int b = 0;


        try {
            divide(a,b);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("This will be executed always");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0)
            throw new ArithmeticException("please don't divide by zero");
        return a/b;
    }
}

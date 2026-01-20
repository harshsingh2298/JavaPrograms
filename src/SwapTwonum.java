public class SwapTwonum {
    public static void main(String[] args) {
        int a = 6, b=7;

        System.out.println("before swap a= "+a+" b= "+b);

        a= a+b;
        b= a-b;
        a=a-b;

        System.out.println("after swap a= "+a+" b= "+b);

    }
}

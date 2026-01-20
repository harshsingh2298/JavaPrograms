public class Array2 {
    public static void main(String[] args) {

        int [] myVariable = new int [10];
        try {
            myVariable[11] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        }

finally {
            for (int i=1;i<myVariable.length-1 ; i++){
                System.out.print("***");
            }
            for (int x: myVariable
            ) {
                System.out.println(x);
            }
        }



    }
}

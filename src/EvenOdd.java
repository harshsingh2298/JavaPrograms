public class EvenOdd {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        for (int i= 0;i<arr.length;i++){
            if (i%2==0){
                System.out.println("number is even "+i);
            }else
                System.out.println("number is odd "+i);
        }
    }
}

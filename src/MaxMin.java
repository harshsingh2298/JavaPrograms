public class MaxMin {
    public static void main(String[] args) {
        int [] arr = new int[]{12,32,43,54,14,1,6,7,8,9};
        int max = arr[0];
        int min = arr[0];

        for (int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Mini number => "+min+"Max number => "+max);
    }
}

public class PrintFrequency {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,2,2,3,4,4,5,5,6};

        //Print the frequency of the array
        int count = 1;

        for (int i=0;i<arr.length-1;i++){

            if (arr[i]==arr[i+1]){
                count++;

            }
            if (arr[i] != arr[i + 1]){
                System.out.println(arr[i]+"Frequency is "+count);
                count = 1;
            }


        }
        System.out.println(arr[arr.length-1]+"Frequency is "+count);
    }
}

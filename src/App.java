package org.example;

/**
 * Hello world!
 *
 */
public class App {

    public void addArray(int arr[]) {
        int result[] = new int[6];
        int newarr[] = new int[6];
        App app = new App();
        newarr[0] = 33;
        newarr[1] = 3;
        newarr[2] = 63;
        newarr[3] = 4;
        newarr[4] = 43;
        newarr[5] = 23;
        for (int i = 0; i <= newarr.length - 1; i++) {
            result[i] = newarr[i] + arr[i];
        }
        for (int i = 0; i <= result.length - 1; i++) {
            System.out.println("New Added Arr " + result[i]);
        }
        app.sortArray(result);
    }

    public void printArray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Old Value" + arr[i]);
        }

    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.squarePattern();
        int arr[] = new int[6];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 22;
        arr[4] = 77;
        arr[5] = 99;

        App app = new App();
        app.printArray(arr);
        app.addArray(arr);

    }

    // Create a method which can sort the array and give me the value
    // create a method of sorting the array
    // also declare one array as sorted array
    // declare a flag which is initialy false
    // declare a temp obj of int
    // write a for loop of condition flag
    // in the if block write logic of compairing current and next index and iterate it with if block
    // then through for loop and if condition check store it in the temp variable and return


    public void sortArray(int arr[]) {
        int sortedArray[] = new int[arr.length];
    for (int i =0;i<arr.length;i++){
        sortedArray[i] = arr[i];
    }
        boolean flag = true;
        int temp = 0;
        while (flag) {

            flag = false ;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;
                }
            }

        }
        for (int x:sortedArray
             ) {
            System.out.println("Sorted Array  "+x);
        }

    }


}

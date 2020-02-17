public class TimeSelectionSort {
    public static void main(String[] args) {

        StopWatch initTime = new StopWatch();
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100000);
        };
        initTime.endTime();
        System.out.println(initTime.getElapsedTime());



        StopWatch selectionSortTime = new StopWatch();
        selectionSort(arr);
        selectionSortTime.endTime();

        System.out.println(selectionSortTime.getElapsedTime());

    }

    public static void selectionSort(int[] arr){
        int i = 0 , j = 0 ;

        while(i < arr.length){
            j = i;
            int min = arr[i];
            int indexPointed = i;
            //Find min ele and its index
            while(j < arr.length){
                if(arr[j] < min){
                    min = arr[j];
                    indexPointed = j;
                }
                j++;
            }
            //Swap
            int tmp = arr[i];
            arr[i] = min;
            arr[indexPointed] = tmp;

            i++;
        }
    }
}

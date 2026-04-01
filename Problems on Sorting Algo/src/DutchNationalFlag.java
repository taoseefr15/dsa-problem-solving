


public class DutchNationalFlag {
    static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sort(int[] arr){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        while(l < h){
            while(arr[l] == 0){
                l++;
            }
            while(arr[h] == 2){
                h--;
            }
            if(l < h){
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
            }
        }
    }

    static void count012(int[] arr){
        int n = arr.length;
        int count0 = 0, count1 = 0, count2 = 0;
        for(int j : arr){
            if(j == 0){
                count0++;
            }else if(j == 1){
                count1++;
            }else{
                count2++;
            }
        }
        int k = 0;
        while(count0 > 0){
            arr[k++] = 0;
            count0--;
        }
        while(count1 > 0){
            arr[k++] = 1;
            count1--;
        }
        while(count2 > 0){
            arr[k++] = 2;
            count2--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,0,1,2,1,0,1,0,2,0,1,2,0,2,1,0,1,0,2,1};
        //sort(arr);
        count012(arr);
        printArr(arr);

    }
}

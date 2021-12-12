import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayInts = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrayInts));
        for(int i = 0;i<arrayInts.length;i++){
            if(arrayInts[i]==0){
                arrayInts[i]=1;
            }
            else if(arrayInts[i]==1){
                arrayInts[i]=0;
            }
        }
        System.out.println(Arrays.toString(arrayInts));
        System.out.println("====================");
        System.out.println(Arrays.toString(getArray100()));
        System.out.println("====================");
        System.out.println(Arrays.toString(getArray3()));
        System.out.println("====================");
        getArray4(20);
    }


    public static int[] getArray100(){
        int[] arrayInts = new int[100];
        for(int i = 0;i<arrayInts.length;i++){
            arrayInts[i]=i+1;
        }
        return arrayInts;
    }

    public static int[] getArray3(){
        int[] arrayInts = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrayInts));
        for(int i = 0;i<arrayInts.length;i++){
            if(arrayInts[i]<6){
                arrayInts[i]=arrayInts[i]*2;
            }
        }
        return arrayInts;
    }


    public static void getArray4(int size){
        int[][] arrayInts = new int[size][size];
        for(int i = 0;i<size;i++) {
            for(int k = 0; k<size;k++){
                arrayInts[i][k] = 0;
            }
        }
        for(int i = 0;i<size;i++){
            arrayInts[i][i]=1;
        }
        for(int i = 0;i<size;i++) {
            for(int k = 0; k<size;k++){
                System.out.print(arrayInts[i][k]+" ");
            }
            System.out.println();
        }
    }

}

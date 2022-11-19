package Java_basics.String;

public class StrSortBrute {
    public static void main(String[] args) {
        String name = "Suresh";

        sortStr(name);
    }

    public static void swap(char [] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortStr(String str){

        char [] res = str.toCharArray();

        for (int i=0; i<res.length-1; i++){
            for (int j=0; j<res.length-i-1; j++){
                if (res[j] > res[j+1]){
                    swap(res, j, j+1);
                }
            }
        }
        System.out.println(res); 
    }
}

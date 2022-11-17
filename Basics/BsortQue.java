import java.util.Arrays;

public class BsortQue {             // LEETCODE ---> SORT THE PEOPLE 
    
    public static void main(String[] args) {
        int [] heights = {180,120,160};
        String [] names = {"Harish","Elizabeth","Sherlock"};

        String [] res = swapBasedOnHeights(heights, names);
        System.out.println(Arrays.toString(names));
    }

    public static void swap(int [] heights, String [] names, int i, int j){
        
        int temp = heights[i];
        heights[i] = heights[j];
        heights[j] = temp;

        String temp1 = names[i];
        names[i] = names[j];
        names[j] = temp1;
    }

    public static String [] swapBasedOnHeights(int [] heights, String [] names){
        for(int i=0; i<heights.length-1; i++){
            for (int j=0; j<names.length-i-1; j++){
                if (heights[j] < heights[j+1]){
                    swap(heights, names, j, j+1);
                }
            }
        }
        return names;
    }

}

package five_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//删除被覆盖区间
public class demo986 {
    public static void main(String[] args) {
        int[][] a = {{0,2},{5,10},{13,23},{24,25}};
        int[][] b = {{1,5},{8,12},{15,24},{25,26}};
        int[][] ints = intervalIntersection(a, b);
    }
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i =0;
        int j =0;
        List<int[]> list = new ArrayList<>();
        while (i<firstList.length&&j<secondList.length){
            int a1 = firstList[i][0];
            int a2 = firstList[i][1];
            int b1 = secondList[j][0];
            int b2 = secondList[j][1];
            if(a2>=b1&&b2>=a1){
                list.add(new int[]{
                    Math.max(a1,b1),Math.min(a2,b2)});
            }
            if(b2<a2){
                j++;
            }else {
                i++;
            }

        }
        //Arraylist 对象转换为数组。
        return list.toArray(new int[0][0]);
    }
}

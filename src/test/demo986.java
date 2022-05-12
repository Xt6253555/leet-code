package test;

import java.util.ArrayList;

public class demo986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> list = new ArrayList<>();
        int i=0;
        int j=0;
        while (i< firstList.length&&j<secondList.length){
            int a1 = firstList[i][0];
            int a2 = firstList[i][1];
            int b1 = firstList[j][0];
            int b2 = firstList[j][1];
            if(a2>=b1&&a1<=b2){
                list.add(new int[]{Math.max(a1,a2),Math.min(b1,b2)});
            }
            if(b1>a2){
                i++;
            }else {
                j++;
            }
        }
        return list.toArray(new int[0][0]);
    }
}

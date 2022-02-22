package code;

import java.util.Arrays;

public class HotelMinPriceProxy {
    public static final double DOUBLE_THRESHOLD = 0.0001d;
    public static final String MY_APPID = "100016946";

    /**
     * 国内
     */
    public static final Integer FOREGIN_FLAG_INLAND = 1;
    /**
     * 国外
     */
    public static final Integer FOREGIN_FLAG_OVERSEA = 0;

    public static final Integer PLOTTYPE_GAODE = 1;

    public static final Integer PLOTTYPE_GOOGLE = 2;

    public static final int FILTER_ITEM_RELAX_SIZE = 3;

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr,5));
    }
    //输入：weights = [1,2,3,4,5,6,7,8,9,10], days = 5
    //输出：15
    //第 1 天：1, 2, 3, 4, 5
    //第 2 天：6, 7
    //第 3 天：8
    //第 4 天：9
    //第 5 天：10
    public static int shipWithinDays(int[] weights, int days){
        int left = 0;
        int right = 0;
        for (int i = 0; i < weights.length; i++) {
            if(left<weights[i]){
                left = weights[i];
            }
            right+=weights[i];
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (f(weights, mid) == days) {
                right = mid - 1;
            } else if (f(weights, mid) > days) {
                left = mid + 1;
            } else if (f(weights, mid) < days) {
                right = mid - 1;
            }
        }
        return left;
    }
    public static int f(int[] weight,int x){
        int day = 0;
        int sum = 0;
        for (int i = 0; i < weight.length; i++) {
            sum+=weight[i];
            if(sum>x){
                day++;
                sum = 0;
                i = i-1;
            }
            if(i==weight.length-1){
                day++;
            }
        }
        return day;
    }
    public static final int CROSS_CITY_FLAG = 1;
    public static final int NON_CROSS_CITY_FLAG = 0;
    public static final int ADD_BED_FLAG = 1;
    public static final int NON_ADD_BED_FLAG = 0;


    public static final String BRAND_ALL_HIGHEND_HOTEL_FLAG = "2";
    public static final String BRAND_ALL_MIDRANGE_HOTEL_FLAG = "4";

    public static final Integer DEL_FLAG = 1;
    public static final Integer UPDATE_FLAG = 1;

    public static final String SEPERATOR = "\\|";
    public static final String ENCLOSEDCHAR = "|";

    public static final char QUESTIONMARKCHAR = '?';
    public static final String QUESTIONMARK = "\\?";


    /**
     * 逗号
     */
    public static final String COMMA = ",";
    /**
     * 下划线
     */
    public static final String UNDERLINE = "_";
    /**
     * 冒号
     */
    public static final String COLON = ":";

    public static final String MODEL_PREFIX = "model_";

    public static final String EVENT_NAME = "BloomFilterManager-Monitor";
}

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

    }
    // 输入: piles = [3,6,7,11], H = 8
    //输出: 4(1223)
    // 输入: piles = [4,11,20,23,30], H = 5
    //输出: 30(1,1,1,1,1)
    // 输入: piles = [4,11,20,23,30], H = 6
    //输出: 23(11112)
    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 0;
        int right = piles.length-1;
        while (left<=right){

        }
        return 1;
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

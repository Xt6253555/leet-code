package code;

import one_one.ListNode;

import java.util.*;

import static one_one.ListNode.length;
import static one_one.ListNode.list;

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
        System.out.println(checkInclusion("abcdxabcde","abcdeabcdx"));
    }
    //输入：s1 = "ab" s2 = "eidboaoo"
    //输出：true
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : s1.toCharArray()) {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left = 0,right = 0;
        int size = 0;
        int end = Integer.MAX_VALUE;
        while (right<s2.length()){
            char c = s2.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(window.get(c).equals(need.get(c))){
                    size++;
                }
            }
            while (size==need.size()){
                if(right-left<end){
                    end = right-left;
                }
                char d = s2.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d)))
                        size--;
                    window.put(d,window.getOrDefault(d,0)-1);
                }
            }
        }
        return end == s1.length();
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

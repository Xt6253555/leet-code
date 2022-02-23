package code;

import one_one.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

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
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode listNode = deleteDuplicates(head);
        list(listNode);
    }
    //83
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode cur = new ListNode(0);
        cur.next = head;
        while(head.next!=null){
            if(head.val==head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return cur.next;
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

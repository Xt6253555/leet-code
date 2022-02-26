package code;

import one_one.ListNode;

import java.util.*;

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
//        ListNode node = new ListNode(1);
//        node.next= new ListNode(2);
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        node.next.next.next.next = new ListNode(5);
//        ListNode listNode = reverseBetween(node, 2, 4);
//        list(listNode);
//        list(node);
    }
    //输入：head = [1,2,3,4,5], left = 2, right = 4
    //输出：[1,4,3,2,5]
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        Queue<ListNode> slow = new LinkedList<>();
        Queue<ListNode> fast = new LinkedList<>();
        Stack<ListNode> stack = new Stack<>();
        for (int i = 0; i < left-1; i++) {
            slow.add(head);
            head = head.next;
        }
        for (int i = 0; i <= right - left; i++) {
            stack.push(head);
            head = head.next;
        }
        while (head!=null){
            fast.add(head);
            head = head.next;
        }
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (!slow.isEmpty()){
            cur.next = new ListNode(slow.poll().val);
            cur = cur.next;
        }
        while (!stack.isEmpty()){
            cur.next = new ListNode(stack.pop().val);
            cur = cur.next;
        }
        while (!fast.isEmpty()){
            cur.next = new ListNode(fast.poll().val);
            cur = cur.next;
        }
        return pre.next;
    }
    public static ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        while (head!=null){
            stack.push(head);
            head = head.next;
        }
        while (!stack.isEmpty()){
            pre.next = new ListNode(stack.pop().val);
            pre = pre.next;
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

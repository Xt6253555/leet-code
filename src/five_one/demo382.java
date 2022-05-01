package five_one;

import two_one.TreeNode;

import java.util.Random;
//链表随机节点
public class demo382 {
    public TreeNode head;

    public demo382(TreeNode head) {
        this.head = head;
    }

    public int getRandom() {
        Random random = new Random();
        int res =0;
        int i =0;
        TreeNode p = head;
        while (p!=null){
            i++;
            // ⽣成⼀个 [0, i) 之间的整数
            // 这个整数等于 0 的概率就是 1/i
            //不断扩大，达到平均
            if(0==random.nextInt(i)){
                res = p.val;
            }
            p = p.next;
        }
        return res;
    }
}

package two_one;
//不同的二叉搜索树
public class demo96 {
    public int numTrees(int n) {
        if (n == 0 || n == 1) return 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            //当用i这个节点当做根节点时
            //左边有多少种子树
            int leftNum = numTrees(i-1);
            //右边有多少种子树
            int rightNum = numTrees(n-i);
            //乘起来就是当前节点的子树个数
            count+=leftNum*rightNum;
        }
        return count;
    }
}

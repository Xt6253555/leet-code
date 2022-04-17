package two_one;
import java.util.ArrayList;
import java.util.List;

//不同的二叉搜索树 II
public class demo95 {
    public List<TreeNode> generateTrees(int n) {
        return numTrees(1,n);
    }
    public List<TreeNode> numTrees(int l,int r) {
        List<TreeNode> list = new ArrayList<>();
        if(l>r){
            list.add(null);
            return list;
        }
        for (int i = l; i <= r; i++) {
            List<TreeNode> left = numTrees(l, i - 1);
            List<TreeNode> right = numTrees(i+1, r);
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode node = new TreeNode(i);
                    node.left = leftNode;
                    node.right = rightNode;
                    list.add(node);
                }
            }
        }
        return list;
    }
}

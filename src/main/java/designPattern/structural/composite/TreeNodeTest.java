package designPattern.structural.composite;

import org.junit.Test;

public class TreeNodeTest{

    @Test
    public void test(){
        TreeNode tree = new TreeNode("level_0");
        TreeNode node1 = new TreeNode("level_1");
        TreeNode node2 = new TreeNode("level_2");
        tree.add(node1);
        node1.add(node2);
        
        System.out.println("一级叶子节点："+tree.getChildren().get(0).getName());
        System.out.println("二级叶子节点："+tree.getChildren().get(0).getChildren().get(0).getName());
    }
}

package designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode{

    private String name;
    private TreeNode parent;
    private List<TreeNode> children = new ArrayList<TreeNode>();
    
    public TreeNode(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public TreeNode getParent(){
        return parent;
    }

    public void setParent(TreeNode parent){
        this.parent = parent;
    }
    
    //添加子节点
    public void add(TreeNode node){
        this.children.add(node);
    }
    
    //删除子节点
    public void remove(TreeNode node){
        this.children.remove(node);
    }
    
    public List<TreeNode> getChildren(){
        return this.children;
    }
}

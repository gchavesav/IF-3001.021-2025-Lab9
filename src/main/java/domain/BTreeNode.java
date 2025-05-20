package domain;

public class BTreeNode {
    public Object data;
    public BTreeNode left, right;
    public String path;

    public BTreeNode(Object data) {
        this.data = data;
        this.left = this.right = null;
    }

    public BTreeNode(Object data, String path) {
        this.data = data;
        this.left = this.right = null;
        this.path= path;
    }

}

public class RedBlackTree<T extends Comparable<T>> {
    public static final boolean RED = true;
    public static final boolean BLACK = false;

    T key;              
    boolean color;      
    RedBlackTree<T> left;      
    RedBlackTree<T> right;      
    RedBlackTree<T> parent;     

    public RedBlackTree(T key, boolean color, RedBlackTree<T> parent) {
        this.key = key;
        this.color = color;
        this.parent = parent;
        this.left = null;
        this.right = null;
    }

    public boolean isRed() {
        return this.color == RED;
    }

    public boolean isBlack() {
        return this.color == BLACK;
    }

    public void setRed() {
        this.color = RED;
    }

    public void setBlack() {
        this.color = BLACK;
    }

    @Override
    public String toString() {
        return (color == RED ? "R" : "B") + "(" + key + ")";
    }
}

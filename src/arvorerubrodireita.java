private void leftRotate(Node x) {
    Node y = x.left;
    x.right = y.right;
    if (y.right != NIL) y.right.parent = x;

    y.parent = x.parent;

    if (x.parent == null) root = y;
    else if (x == x.parent.right) x.parent.right = y;
    else x.parent.left = y;

    y.parent = x;
    x.right = y;
}

public void insert(int key) {
    Node node = new Node(key);
    node.left = node.right = node.parent = NIL;

    Node y = null;
    Node x = root;

    while (x != NIL) {
        y = x;
        if (node.key < x.key) x = x.left;
        else x = x.right;
    }

    node.parent = y;
    if (y == null) root = node;
    else if (node.key < y.key) y.left = node;
    else y.right = node;

    node.left = NIL;
    node.right = NIL;
    node.color = Color.RED;

    insertFix(node);
}

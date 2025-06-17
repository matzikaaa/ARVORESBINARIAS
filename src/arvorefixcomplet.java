private void insertFix(Node k) {
    while (k.parent != null && k.parent.color == Color.RED) {
        if (k.parent == k.parent.parent.left) {
            Node u = k.parent.parent.right;
            if (u.color == Color.RED) {
                k.parent.color = Color.BLACK;
                u.color = Color.BLACK;
                k.parent.parent.color = Color.RED;
                k = k.parent.parent;
            } else {
                if (k == k.parent.right) {
                    k = k.parent;
                    leftRotate(k);
                }
                k.parent.color = Color.BLACK;
                k.parent.parent.color = Color.RED;
                rightRotate(k.parent.parent);
            }
        }

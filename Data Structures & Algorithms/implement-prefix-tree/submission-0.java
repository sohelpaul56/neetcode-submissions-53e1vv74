class TreeNode {
    TreeNode[] children;
    boolean endsWord;

    public TreeNode() {
        children = new TreeNode[26];
        endsWord = false;
    }

    boolean containsChar(char ch) {
        return children[ch - 'a'] != null;
    }

    void add(char ch) {
        children[ch - 'a'] = new TreeNode();
    }

    TreeNode getChar(char ch) {
        return children[ch - 'a'];
    }

    void markWordEnd() {
        endsWord = true;
    }

    boolean isWord() {
        return endsWord;
    }
}

class PrefixTree {

    TreeNode root;

    public PrefixTree() {
        root = new TreeNode();
    }

    public void insert(String word) {
        TreeNode temp = root;

        for (char c : word.toCharArray()) {
            if (!temp.containsChar(c)) {
                temp.add(c);
            }
            temp = temp.getChar(c);
        }

        temp.markWordEnd();
    }

    public boolean search(String word) {
        TreeNode temp = root;

        for (char c : word.toCharArray()) {
            if (!temp.containsChar(c)) {
                return false;
            }
            temp = temp.getChar(c);
        }

        return temp.isWord();
    }

    public boolean startsWith(String prefix) {
        TreeNode temp = root;

        for (char c : prefix.toCharArray()) {
            if (!temp.containsChar(c)) {
                return false;
            }
            temp = temp.getChar(c);
        }

        return true;
    }
}
public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    private class TrieNode {
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode() {
            this.children = new TrieNode[26];
            this.isWord = false;
        }
    }

    public void insert(String word) {
        if(word == null || word.isEmpty()) {
            throw new  IllegalArgumentException("invalid input");
        }
        word = word.toLowerCase();

        TrieNode current = root;
        for(int i=0;i<word.length();i++) {
            char c= word.charAt(i);
            int index = c - 'a';
            if(current.children[index] == null) {
                TrieNode node = new TrieNode();
                current.children[index] = node;
                current = node;
            }
            else {
                current = current.children[index];
            }
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        return false;
    }


    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("cat");
        t.insert("cab");
        t.insert("son");
        t.insert("so");
        System.out.println("values inserted successfully !!!");
    }
}
package Week_4.Day_5;


// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
// Rename class to "Solution" before submitting to LeetCode


public class SerializeAndDeserializeBinaryTree_0297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeDFS(root, sb);
        return sb.toString();
    }

    private void serializeDFS(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("N,");
            return;
        }

        sb.append(node.val).append(",");
        serializeDFS(node.left, sb);
        serializeDFS(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));

        return deserializeDFS(queue);
    }

    private TreeNode deserializeDFS(Queue<String> queue) {
        String s = queue.poll();

        if (s.equals("N")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(s));
        node.left = deserializeDFS(queue);
        node.right = deserializeDFS(queue);

        return node;
    }
}
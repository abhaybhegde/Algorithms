package graphs;
public class Test{
    public static void main(String[] args) {
        String[] s = new String[]{"a","h","boy","haha"};
        String[][] e = new String[2][2];
        e[0][0] = "a";
        e[0][1] = "h";
        e[1][0] = "h";
        e[1][1] = "haha";
        Graph g = new Graph(s,e);
        BreadthFirstTraversal bfs = new BreadthFirstTraversal(g);
        System.out.println(bfs.isReachable(g, 1, 0));
    }
}
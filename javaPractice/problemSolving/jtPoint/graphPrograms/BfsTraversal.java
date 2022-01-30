import java.util.LinkedList;
import java.util.Queue;

public class BfsTraversal{
	private int node; 
	private LinkedList<Integer> adj[];
	private Queue<Integer> que;

	BfsTraversal(int v){
		node = v;
		adj = new LinkedList[node];
		for(int i = 0; i < v; i++)
			adj[i] = new LinkedList<Integer>();
		que = new LinkedList<Integer>();
	}

	// adding edge to the adjacency list(edges are bidirectional)
	void insertEdge(int v, int w){
		adj[v].add(w);
	}

	void BFS(int n){
		boolean nodes[] = new boolean[node];
		int a = 0;
		nodes[n] = true;
		que.add(n);

		while(que.size() != 0){
			n = que.poll();
			System.out.print(n + " ");
			for(int i = 0; i < adj[n].size(); i++){
				a = adj[n].get(i);
				// only insert unexplored nodes in queue
			       if(!nodes[a]){
			       		nodes[a] = true;
					que.add(a);
			       }	       
			}
		}
		
	}
	public static void main(String args[]){
		BfsTraversal graph = new BfsTraversal(6);
		graph.insertEdge(0, 1);
		graph.insertEdge(0, 3);
		graph.insertEdge(0, 4);
		graph.insertEdge(4, 5);
		graph.insertEdge(3, 5);
		graph.insertEdge(1, 2);
		graph.insertEdge(1, 0);
		graph.insertEdge(2, 1);
		graph.insertEdge(4, 1);
		graph.insertEdge(3, 1);
		graph.insertEdge(5, 4);
		graph.insertEdge(5, 3);
		System.out.println("BFS of the graph: ");
		graph.BFS(0);
	}
}

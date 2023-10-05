/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakgraph2;

/**
 *
 * @author Kyrin
 */
public class Dunia3_PrakGraph2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
        Edge[] edges = {
            new Edge(0, 1, 2), new Edge(0, 5, 3), new Edge(4, 2, 0),	
            new Edge(1, 0, 3), new Edge(2, 1, 3), new Edge(3, 1, 4),
            
	};

	Graph graf = new Graph(edges);
	graf.calculateShortestDistances();
	graf.display();
    }
}

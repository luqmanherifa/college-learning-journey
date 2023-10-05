/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakgraph2;

import java.util.ArrayList;

/**
 *
 * @author Kyrin
 */
public class Node {

        int distanceFromSource = Integer.MAX_VALUE;
	boolean visited;

	ArrayList<Edge> edges = new ArrayList<Edge>();

	public int getDistanceFromSource() {
            return distanceFromSource;
	}

	public void setDistanceFromSource(int distanceFromSource) {
            this.distanceFromSource = distanceFromSource;
	}
 
	public boolean isVisited() {
            return visited;
	}
		
	public void setVisited(boolean visited) {
            this.visited = visited;
	}
		
	public ArrayList<Edge> getEdges() {
            return edges;
	}
		
	public void setEdges(ArrayList<Edge> edges) {
            this.edges = edges;
	}
}
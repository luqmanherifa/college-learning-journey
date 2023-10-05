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
public class Edge{
    
        int fromNodeIndex;
	int toNodeIndex;
	int length;
	
	public Edge(int fromNodeIndex, int toNodeIndex, int length) {
            this.fromNodeIndex = fromNodeIndex;
            this.toNodeIndex = toNodeIndex;
            this.length = length;
	}
	
	public int getFromNodeIndex() {
            return fromNodeIndex;
	}
	
	public int getToNodeIndex() {
            return toNodeIndex;
	}
	
	public int getLength() {
            return length;
	}
	
	public int getNeighbourIndex(int nodeIndex) {
            if (this.fromNodeIndex == nodeIndex) {
            return this.toNodeIndex;
            } else {
            return this.fromNodeIndex;
            }
        }
}
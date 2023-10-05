/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_prakgraph;

/**
 *
 * @author Kyrin
 */
public class GraphEdge {

    GraphNode src;
    GraphNode dst;
    double distance;

    /* set this.src into new_src
    * set this.dst into new_dst
    * set this.distance into new_distance
     */
    public GraphEdge(GraphNode new_src, GraphNode new_dst, double new_distance) {
      this.src = new_src ;
      this.dst = new_dst ;
       this.distance = new_distance;
    }
}

package com.clrs.graphHelper;

import java.util.PriorityQueue;


public class GraphTester {
    public static void main(String[] args) {
        Graph g = new Graph();
        Vertex A =g.add_Vertex("A");
        Vertex B =g.add_Vertex("B");
        Vertex C =g.add_Vertex("C");
        Vertex D =g.add_Vertex("D");
        Vertex E =g.add_Vertex("E");
        Vertex F =g.add_Vertex("F");
        Vertex G =g.add_Vertex("G");

        g.add_Edge(A,B);
        g.add_Edge(A,C);
        g.add_Edge(A,D);
        g.add_Edge(A,E);
        g.add_Edge(A,C);
        g.add_Edge(C,F);
        g.add_Edge(C,G);
        g.add_Edge(C,E);
        g.add_Edge(C,D);

        g.setVertices();
        PriorityQueue<Vertex> vertices = g.getVertices();

        while(!(vertices.isEmpty())){
            Vertex v = vertices.poll();
            System.out.println(v+" "+v.getDegree());
        }

    }

}

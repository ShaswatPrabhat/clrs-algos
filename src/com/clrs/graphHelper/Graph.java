package com.clrs.graphHelper;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {
    private boolean isDirected;
    private VertexComparator vertexComparator  = new VertexComparator();

    PriorityQueue<Vertex> vertices = new PriorityQueue<>(10,vertexComparator);
    LinkedList<Vertex> verticesList = new LinkedList<>();
    LinkedList<Edge> edges = new LinkedList<>();

    public Vertex add_Vertex(String label){
        Vertex v = new Vertex();
        v.setLabel(label);
        verticesList.add(v);
        return v;
    }

     public void setVertices(){
        for(Vertex vertex:verticesList)
            vertices.offer(vertex);
        verticesList = null;
    }

     public void add_Edge(Vertex v1, Vertex v2){
       this.isDirected = false;
       v1.setNeighbour(v2);v2.setNeighbour(v1);
       v1.setDegree(v1.getDegree()+1);v2.setDegree(v2.getDegree()+1);
       Edge e = new Edge(v1, v2);
       v1.setEdge(e);
       v2.setEdge(e);
       edges.add(e);
       //return e;
    }

     public PriorityQueue<Vertex> getVertices() {

        return vertices;
    }
}

package com.clrs.graphHelper;

public class Edge {
    private Vertex source;
    private Vertex destination;

    private int weight;

    Edge(Vertex source, Vertex destination){
        this.source = source;
        this.destination = destination;
        weight = 1;

    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

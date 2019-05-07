package com.clrs.graphHelper;


import java.util.ArrayList;
import java.util.LinkedList;

public class Vertex {
    private String label;
    private int degree;
    private Vertex parent_tree;
    private ArrayList<Vertex> neighbours;
    private LinkedList<Edge> edges;

    public Vertex() {
        neighbours = new ArrayList<>();
        degree = 0;
        parent_tree = null;
        edges = new LinkedList<>();
    }

    public LinkedList<Edge> getEdges() {
        return edges;
    }

    public void setEdge(Edge edge) {
        this.edges.add(edge);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public Vertex getParent_tree() {
        return parent_tree;
    }

    public void setParent_tree(Vertex parent_tree) {
        this.parent_tree = parent_tree;
    }

    public ArrayList<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbour(Vertex neighbour) {
        this.neighbours.add(neighbour);
    }

    public String valueOf() {
        return (this.getLabel());
    }

    @Override
    public String toString() {
        return (this.getLabel());
    }

    public int compareTo(Vertex o1, Vertex o2) {
        return o1.degree - o2.degree;
    }
}

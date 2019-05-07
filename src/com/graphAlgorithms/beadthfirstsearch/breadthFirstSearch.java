package com.graphAlgorithms.beadthfirstsearch;

import com.clrs.graphHelper.Graph;
import com.clrs.graphHelper.Vertex;
import com.clrs.graphHelper.VertexComparator;

import java.util.HashMap;
import java.util.PriorityQueue;

public class breadthFirstSearch {
    Graph graph;
    Vertex source;

    public breadthFirstSearch(Graph graph, Vertex source) {
        this.graph = graph;
        this.source = source;
    }

    void breadthFirstSearch() {

        HashMap<String, Boolean> isVisited = new HashMap<>();
        for (Vertex vertex : graph.getVertices())
            isVisited.put(vertex.getLabel(), false);

        PriorityQueue<Vertex> localQueue = new PriorityQueue<>(10,new VertexComparator());
        for (Vertex vertex : source.getNeighbours())
            localQueue.offer(vertex);
        isVisited.replace(source.getLabel(), true);
        System.out.println(source);
        while (!localQueue.isEmpty()) {
            Vertex u = localQueue.poll();
            for (Vertex v : u.getNeighbours()) {

                if (!isVisited.containsKey(v.getLabel()) || !isVisited.get(v.getLabel())) {

                    for (Vertex k : v.getNeighbours())

                        localQueue.offer(k);

                    v.setParent_tree(u);
                }

                isVisited.replace(v.getLabel(), true);
                System.out.println(v);
            }

        }
    }
}

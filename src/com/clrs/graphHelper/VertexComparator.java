package com.clrs.graphHelper;

import java.util.Comparator;

public class VertexComparator implements Comparator<Vertex> {

    @Override
    public int compare(Vertex o1, Vertex o2) {
        return( o2.getDegree()-o1.getDegree());
    }
}

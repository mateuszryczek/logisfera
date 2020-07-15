package com.mime.logisfera;

import org.junit.Assert;
import org.junit.Test;

public class ThirdTaskTest {

    @Test
    public void getConnectedComponentsCount_givenCase_twoComponentsFound() {
        ThirdTask.Graph graph = new ThirdTask.Graph();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(5, 6);
        Assert.assertEquals(2, graph.getConnectedComponentsCount());
    }

    @Test
    public void getConnectedComponentsCount_emptyGraph_noComponentsFound() {
        ThirdTask.Graph graph = new ThirdTask.Graph();
        Assert.assertEquals(0, graph.getConnectedComponentsCount());
    }

    @Test
    public void getConnectedComponentsCount_largeGraph_noErrorAndComponentsFound() {
        ThirdTask.Graph graph = new ThirdTask.Graph();
        for (int i = 0; i < 33333; i++) {
            graph.addEdge(i % 333, (i % 333) * 3);
        }
        Assert.assertTrue(graph.getConnectedComponentsCount() > 0);
    }

}
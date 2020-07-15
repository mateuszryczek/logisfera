package com.mime.logisfera;

import java.util.*;

public class ThirdTask {

    public static void main(String[] args) {
        int numberOfEdges = FastReader.nextInt();
        Graph graph = new Graph();
        for (int edge = 1; edge <= numberOfEdges; edge++) {
            graph.addEdge(FastReader.nextInt(), FastReader.nextInt());
        }
        System.out.println(graph.getConnectedComponentsCount());
    }

    static class Graph {

        private Map<Integer, Set<Integer>> edges = new HashMap<>();

        void addEdge(int source, int destination) {
            if (!edges.containsKey(source)) {
                edges.put(source, new HashSet<>());
            }
            edges.get(source).add(destination);
            if (!edges.containsKey(destination)) {
                edges.put(destination, new HashSet<>());
            }
            edges.get(destination).add(source);
        }

        private void dfs(int vertex, Set<Integer> visited) {
            Deque<Integer> dfsStack = new ArrayDeque<>();
            dfsStack.push(vertex);
            while (!dfsStack.isEmpty()) {
                vertex = dfsStack.peek();
                dfsStack.pop();
                visited.add(vertex);
                for (Integer destination : edges.get(vertex)) {
                    if (!visited.contains(destination)) {
                        dfsStack.push(destination);
                    }
                }
            }
        }

        int getConnectedComponentsCount() {
            int count = 0;
            Set<Integer> visited = new HashSet<>();
            for (Integer vertex : edges.keySet()) {
                if (!visited.contains(vertex)) {
                    dfs(vertex, visited);
                    count += 1;
                }
            }
            return count;
        }
    }

}

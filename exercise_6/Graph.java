package data;

public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 13;
        int noEdges = 13;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Chi";
        myGraph.edge[0].dest = "Jobert";
        
        // Edge 2
        myGraph.edge[1].src = "Chi";
        myGraph.edge[1].dest = "Jarvis";

        // Edge 3
        myGraph.edge[2].src = "Chi";
        myGraph.edge[2].dest = "Japapi";
        
        // Edge 4
        myGraph.edge[3].src = "Chi";
        myGraph.edge[3].dest = "Gigatan";

        // Edge 5
        myGraph.edge[4].src = "Chi";
        myGraph.edge[4].dest = "Jaime";

        // Edge 6
        myGraph.edge[5].src = "Chi";
        myGraph.edge[5].dest = "Miguel";

        // Edge 7
        myGraph.edge[6].src = "Chi";
        myGraph.edge[6].dest = "Rich";

        // Edge 8 
        myGraph.edge[7].src = "Chi";
        myGraph.edge[7].dest = "Neal";

        // Edge 9
        myGraph.edge[8].src = "Chi";
        myGraph.edge[8].dest = "Andrei";

        // Edge 10
        myGraph.edge[9].src = "Chi";
        myGraph.edge[9].dest = "Flor";
        
       // Edge 11
        myGraph.edge[7].src = "Chi";
        myGraph.edge[7].dest = "Neal";

        // Edge 9
        myGraph.edge[8].src = "Chi";
        myGraph.edge[8].dest = "Andrei";

        // Edge 10
        myGraph.edge[9].src = "Chi";
        myGraph.edge[9].dest = "Flor";

        

       

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
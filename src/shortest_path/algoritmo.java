/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortest_path;

import java.util.ArrayList;

/**
 *
 * @author biosh
 */
public class algoritmo 
{


// A Java program for Dijkstra's single source shortest path algorithm. 
// The program is for adjacency matrix representation of the graph 


       private ArrayList<Integer> salones_recibe_instruccion= new ArrayList<>();
      

   	// A utility function to find the vertex with minimum distance value, 
	// from the set of vertices not yet included in shortest path tree 
	//static final int V = 9; 
	int minDistance(int dist[], Boolean sptSet[],int tamanio_array) 
	{ 
		// Initialize min value 
		int min = Integer.MAX_VALUE, min_index = -1; 

		for (int v = 0; v < tamanio_array; v++) 
			if (sptSet[v] == false && dist[v] <= min) { 
				min = dist[v]; 
				min_index = v; 
			} 

		return min_index; 
	} 

	// A utility function to print the constructed distance array 
	void printSolution(int dist[], int n,int tamanio_array) 
	{ 
		System.out.println("Vertex Distance from Source"); 
		for (int i = 0; i < tamanio_array; i++) 
	          // / if (true)
                  //  {
                    System.out.println(i + " tt " + dist[i]); 
                        
                    //}
	           
        } 

	// Function that implements Dijkstra's single source shortest path 
	// algorithm for a graph represented using adjacency matrix 
	// representation 
	void dijkstra(int graph[][], int source,int target) 
	{ 
                int array_length=graph.length;
		int dist[] = new int[array_length]; 
                // The output array. dist[i] will hold 
		// the shortest distance from src to i 

		// sptSet[i] will true if vertex i is included in shortest 
		// path tree or shortest distance from src to i is finalized 
		Boolean sptSet[] = new Boolean[array_length]; 

		// Initialize all distances as INFINITE and stpSet[] as false 
		for (int i = 0; i < array_length; i++) 
                { 
			dist[i] = Integer.MAX_VALUE; 
			sptSet[i] = false; 
		} 

		// Distance of source vertex from itself is always 0 
		dist[source] = 0; 

		// Find shortest path for all vertices 
		for (int count = 0; count < array_length - 1; count++)
                { 
			// Pick the minimum distance vertex from the set of vertices 
			// not yet processed. u is always equal to src in first 
			// iteration. 
			int u = minDistance(dist, sptSet,array_length); 

			// Mark the picked vertex as processed 
			sptSet[u] = true; 

			// Update dist value of the adjacent vertices of the 
			// picked vertex. 
			for (int v = 0; v < array_length; v++) 

				// Update dist[v] only if is not in sptSet, there is an 
				// edge from u to v, and total weight of path from src to 
				// v through u is smaller than current value of dist[v] 
				if (!sptSet[v] && graph[u][v] != 0 && 
				dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
			        dist[v] = dist[u] + graph[u][v]; 
		} 

		// print the constructed distance array 
		printSolution(dist, array_length,array_length); 
	} 

	// Driver method 
	public static void main(String[] args) 
	{      
                int salones_nums[]=new int[]{100,101,102,103,104,105,106,110,111,112,113,114,115,116,120,121,122,123,124,125,126,911,921,931,81,82,200,201,202,203,204,205,206,210,211,212,213,214,215,216,220,221,222,223,224,225,226,912,922,932,300,303,304,305,306,310,311,312,313,314,315,316,320,321,322,323,324,325,326,913,923,933,400,401,402,403,404,405,406,410,411,412,413,414,415,416,420,421,422,423,424,425,426,914,924,934,500,501,502,503,504,505,506,507,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,915,925,935,70,60,65,91,92};                 
                
                
		/* Let us create the example graph discussed above */
		int graph[][] = new int[][] {
                    { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
		    { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
		    { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
		    { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
		    { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
	            { 0, 0, 4, 14, 10, 0, 2, 0, 0}, 
		    { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
		    { 8, 11, 0, 0, 0, 0, 1, 0, 7}, 
		    { 0, 0, 2, 0, 0, 0, 6, 7, 0 }};
                int graph_2[][] = new int[][] {
                    { 0, 3, 4, 0, 8, 0 }, 
		    { 0, 0, 0, 0, 5, 0 }, 
		    { 0, 0, 0, 0, 3, 0 }, 
		    { 0, 0, 0, 0, 0, 0}, 
		    { 0, 0, 0, 7, 0, 3}, 
	            { 0, 0, 4, 14, 10,0}};
              // Shortest_path_algorithm prueba = new Shortest_path_algorithm(); 
                int source=1,target=6;
                for (int i = 0; i < salones_nums.length; i++) 
                { 
                  /*      prueba.getSalones_recibe_instruccion().add(i, salones_nums[i]);
                        System.out.println(prueba.getSalones_recibe_instruccion().get(i));
                    */     
                }
                
//		prueba.dijkstra(graph_2,source-1,target-1); 
	} 

   
    /**
     * @return the salones_recibe_instruccion
     */
    public ArrayList<Integer> getSalones_recibe_instruccion() {
        return salones_recibe_instruccion;
    }

    /**
     * @param salones_recibe_instruccion the salones_recibe_instruccion to set
     */
    public void setSalones_recibe_instruccion(ArrayList<Integer> salones_recibe_instruccion) {
        this.salones_recibe_instruccion = salones_recibe_instruccion;
    }

} 
// This code is contributed by Aakash Hasija 
    


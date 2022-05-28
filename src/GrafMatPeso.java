/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biosh
 */
public class GrafMatPeso 
{
  public static int INFINITO=0xFFFF;
  public int [][] matPeso ;
  private Vertice [] verts;
  private int numVerts;
  public GrafMatPeso(int mx)
  {
  matPeso =new int [mx][mx];
  verts= new Vertice [mx];
      for (int i = 0; i < mx; i++)
      
          for (int j = 0; j < mx; j++) 
          
              matPeso[i][j]=INFINITO;
      numVerts=0;    
  }
  public void nuevoVertice(int nom)
  {
      boolean esta=numVertice(nom) >= 0;
      if (!esta) 
      {
      Vertice v=new Vertice(nom);
      v.asigVert(numVerts);
      verts[numVerts++]=v;
      }
  }
  public int pesoArco(int a,int b)
  {
  int va,vb;
  va=numVertice(a);
  vb=numVertice(b);
  return matPeso[va][vb];
  }
  /*retorna el peso del vertive */
  public int numeroDeVertices()
  {
  return numVerts;    
  }
   /*retorna el array de vertices */
 public Vertice[] vertices()
 {
 return verts;    
 }
 public void nuevoArco (int a,int b ,int peso)
 {
 int va,vb;
 va=numVertice(a);
 vb=numVertice(b);
 matPeso[va][vb]=peso; 
 }
 public int numVertice(int vs)
 {
 Vertice v =new Vertice (vs);
 boolean encontrado =false;
 int i=0;
     for (;( i < numVerts)&&!encontrado;) 
     {
         encontrado = verts[i].equals(v);
         if (!encontrado)i++;
         
     }
     return (i<numVerts)?i:-1;
 }
 /*retorna la matriz de pesos*/
public int [][]getMatPeso(){
    return matPeso;
}
}

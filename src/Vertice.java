/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biosh
 */
public class Vertice
{
int nombre;
int numVertice;
public Vertice(int numero_salon)
{
nombre =numero_salon;
numVertice=-1;
}
/*retorna nombre de vertice */
public int numVertice ()
{
return nombre;

}
public  boolean equals (Vertice n)
{
return nombre==n.nombre;
    
}
public void asigVert(int n)
{
numVertice=n;    
}


}


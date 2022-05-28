
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biosh
 */

public class CaminoMinimo {
public ArrayList<Integer> Array_pintense_de_colores=new ArrayList<Integer>();

     public int salones_nums[]=new int[]{100,101,102,103,104,105,106,110,111,112,113,114,115,116,120,121,122,123,124,125,126,911,921,931,81,82,200,201,202,203,204,205,206,210,211,212,213,214,215,216,220,221,222,223,224,225,226,912,922,932,300,303,304,305,306,310,311,312,313,314,315,316,320,321,322,323,324,325,326,913,923,933,400,401,402,403,404,405,406,410,411,412,413,414,415,416,420,421,422,423,424,425,426,914,924,934,500,501,502,503,504,505,506,507,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,915,925,935,70,60,65,91,92};                 
      
    private int [][] Pesos;
private int [] ultimo;
private int [] D;
public String la_ruta=new String();      
private boolean [] F;
private int s, n;// vértice origen y número de vértices
public  CaminoMinimo(GrafMatPeso gp, int origen)
{
    n = gp.numeroDeVertices();
    s = origen;
    Pesos = gp.matPeso;
    ultimo = new int [n];
    D = new int [n];
    F = new boolean [n];
}    

public void caminoMinimos(){// valores iniciales
    for (int i = 0; i < n; i++)
    {
        F[i] = false;
        D[i] = Pesos[s][i];
        ultimo[i] = s;
    }
    F[s] = true; 
    D[s] = 0;
// Pasos para marcar los n-1 vértices

for (int i = 1; i < n; i++)
{
    int v = minimo();
    F[v] = true;
/* selecciona vértice no marcado de menor distancia */
// actualiza distancia de vértices no marcados 
for (int w = 1; w < n; w++)
    if (!F[w])
        if ((D[v] + Pesos[v][w]) < D[w])
        {
            D[w] = D[v] + Pesos[v][w];
            ultimo[w] = v;
        }
}
}
private int minimo()
{
    int mx = GrafMatPeso.INFINITO;
    int v = 1;
    for (int j = 1; j < n; j++)
        if (!F[j] && (D[j]<= mx))
        {
            mx = D[j];
            v = j;
        }
    return v;
}
public String recuperaCamino(int v){
          
      /* ///////////////////////////INICIALIZAR EL INT ARRAY LIST///////////////////////////////////////////*/ 
       
    Array_pintense_de_colores.clear();
    
    /* //////////////////////////////////////////////////////////////////////*/
  
    
    
    ArrayList<Integer> nomenclatura_especial_3= new ArrayList<>();
       
            String nomenclatura_especial_2 [][]={{"526","Laboratorio de Neumática"},{"527","Laboratorio de trabajo terminar telemática"}
                                                ,{"528","Laboratorio de biolectrónica"},{"516","Laboratorio electrónica I"},{"517","Centro de idiomas"}
                                                ,{"518","Laboratorio de sistemas digitales"},{"519","Laboratorio telecomunicaciones"},{"506","Biblioteca"}   
                                                ,{"507","Taller de máquinas y herramientas"},{"520","Sala de profesores"},{"521","Sala de profesores"}
                                                ,{"522","Laboratorio de bioingenieria"},{"523","Laboratorio de bioingeniería"},{"524","Sala profesores"}
                                                ,{"525","Sala profesores"},{"510","Laboratorio de Cómputo Móvil"},{"511","Sala de profesores telemática"} 
                                                ,{"512","Laboarotorio telemática II"},{"513","Laboratorio telemática I"},{"514","Laboratorio electrónica III"}
                                                ,{"515","Laboratorio electrónica III"},{"500","Laboratorio de química"},{"501","Laboratorio de química"}
                                                ,{"502","Laboratorio de Física"},{"503","Laboratorio de Física 2"},{"504","Biblioteca"}
                                                ,{"81","Edificio de Gobierno planta baja"},{"65","Cafeteria"},{"91","ir por patio"},{"60","Entrada"}
                                                ,{"70","Salida"},{"505","Subdirección de servicios educativos e integración social"},{"526","Laboratorio de Neumática"}
                                                ,{"528","Laboratorio de trabajo terminal telemática"},{"527","Laboratorio de bioelectrónica"},{"516","Laboratorio de electrónica I"}
                                                 /* cambios
                                                ,{"92","ir por patio"} ,{"81","Edificio de gobierno"},{"911","ir por escaleras"},{"921","ir por escaleras"},{"931","ir por escaleras"},{"912","ir por escaleras"},{"922","ir por escaleras"},{"932","ir por escaleras"}
                                                ,{"913","ir por escaleras"},{"923","ir por escaleras"},{"933","ir por escaleras"},{"914","ir por escaleras"},{"924","ir por escaleras"},{"934","ir por escaleras"} 
                                                ,{"915","ir por escaleras"},{"925","ir por escaleras"},{"935","ir por escaleras"} 
                                                
                                                 */
                                                ,{"92","ir por patio"} ,{"81","Edificio de gobierno planta baja"},{"911","ir por escaleras de edificio 1 planta baja"},{"921","ir por escaleras de edificio 1 piso 1"},{"931","ir por escaleras de edificio 1 piso 2"},{"912","ir por escaleras de edificio 2 planta baja"},{"922","ir por escaleras de edificio 2 piso 1"},{"932","ir por escaleras de edificio 2 piso 2"}
                                                ,{"913","ir por escaleras de edificio 3 planta baja"},{"923","ir por escaleras de edificio 3 piso 1"},{"933","ir por escaleras de edificio 3 piso 2"},{"914","ir por escaleras de edificio 4 planta baja"},{"924","ir por escaleras de edificio 4 piso 1"},{"934","ir por escaleras de edificio 4 piso 2"} 
                                                ,{"915","ir por escaleras de edificio central planta baja"},{"925","ir por escaleras de edificio central piso 1"},{"935","ir por escaleras de edificio central piso 2"} 
                                                ,{"82","Edificio de Gobierno planta alta"}
            };                                    
            
            /*  index | integer  | nomenclatura */
            for (int i = 0; i < nomenclatura_especial_2.length; i++) 
            {
            for (int j = 0; j < 1; j++) 
            {
               // System.out.println("mistake");
               // nomenclatura_especial[i][0]=Integer.toString(i);
                nomenclatura_especial_3.add(Integer.parseInt(nomenclatura_especial_2[i][0])); 
             //   System.out.print(nomenclatura_especial_3.get(i));
            }
               // System.out.println("");
            }
                  
        da_peso matriz_salones=new da_peso();
        ArrayList<Integer> salones= new ArrayList<>();
        int salones_nums[]=new int[]{100,101,102,103,104,105,106,110,111,112,113,114,115,116,120,121,122,123,124,125,126,911,921,931,81,82,200,201,202,203,204,205,206,210,211,212,213,214,215,216,220,221,222,223,224,225,226,912,922,932,300,303,304,305,306,310,311,312,313,314,315,316,320,321,322,323,324,325,326,913,923,933,400,401,402,403,404,405,406,410,411,412,413,414,415,416,420,421,422,423,424,425,426,914,924,934,500,501,502,503,504,505,506,507,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,915,925,935,70,60,65,91,92};                 
       
        
        for (int i = 0; i < salones_nums.length; i++)
        {
        salones.add(salones_nums[i]);
        }

        String cadena_a_retornar=new String();
       cadena_a_retornar=("");
        //salones=matriz_salones.recibimos_array_list_de_salones();
    int anterior = ultimo[v];

if (v != s)
{

  /*  if (anterior==91) 
    {
        System.out.println(" v es = "+anterior);    
    }*/
   // boolean esta=nomenclatura_especial_3.contains(anterior);
     recuperaCamino(anterior);
    /*/////////////////////////////////////////////////////////////*/


 
    Array_pintense_de_colores.add(salones.get(v));

 
 
 
    /*/////////////////////////////////////////////////////////////*/
 //////////////////////////////////////////  
 if (nomenclatura_especial_3.contains(salones.get(v))==true) 
    {
   //    System.out.println("si lo contiene 1 v");
    System.out.print(" ->  "/* + v+*/+" "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(v))][1]);
    setLa_ruta(getLa_ruta()+" ->  "/* + v+*/+" "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(v))][1]);   
        
    }
    else
    {
        
      //  System.out.println("no lo contiene 2 ,v es: "+v);
    System.out.print(" ->  salon "/* + v+*/+" "+salones.get(v));
    setLa_ruta(getLa_ruta()+" ->  salon "/* + v+*/+" "+salones.get(v));   
    }
 //////////////////////////////////////////
 // vuelve al último del último
    //System.out.print(" -> V salon "/* + v+*/+" "+salones.get(v));
   // setLa_ruta(getLa_ruta()+" -> V salon "/* + v+*/+" "+salones.get(v));   
}else
{
        /*/////////////////////////////////////////////////////////////*/


 
        Array_pintense_de_colores.add(salones.get(s));

 
 
 
       /*/////////////////////////////////////////////////////////////*/

        if (nomenclatura_especial_3.contains(salones.get(s))==true)
        {
        System.out.print(" ->  "/* + v+*/+" "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(s))][1]);
        setLa_ruta(getLa_ruta()+" ->  "/* + v+*/+" "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(s))][1]);   
        }
        else
            {
            System.out.print(" salon "/* + s+*/+" "+salones.get(s));
            setLa_ruta(getLa_ruta()+" ->  salon "/* + v+*/+" "+salones.get(s));
            }
}

return  cadena_a_retornar= getLa_ruta();
}
/*  */

public String recuperaCamino_cero(int v){
     /* ///////////////////////////INICIALIZAR EL INT ARRAY LIST///////////////////////////////////////////*/ 
       
    Array_pintense_de_colores.clear();
    
    /* //////////////////////////////////////////////////////////////////////*/
  
           ArrayList<Integer> nomenclatura_especial_3= new ArrayList<>();
       
            String nomenclatura_especial_2 [][]={{"526","Laboratorio de Neumática"},{"527","Laboratorio de trabajo terminar telemática"}
                                                ,{"528","Laboratorio de biolectrónica"},{"516","Laboratorio electrónica I"},{"517","Centro de idiomas"}
                                                ,{"518","Laboratorio de sistemas digitales"},{"519","Laboratorio telecomunicaciones"},{"506","Biblioteca"}   
                                                ,{"507","Taller de máquinas y herramientas"},{"520","Sala de profesores"},{"521","Sala de profesores"}
                                                ,{"522","Laboratorio de bioingenieria"},{"523","Laboratorio de bioingeniería"},{"524","Sala profesores"}
                                                ,{"525","Sala profesores"},{"510","Laboratorio de Cómputo Móvil"},{"511","Sala de profesores telemática"} 
                                                ,{"512","Laboratorio telemática II"},{"513","Laboratorio telemática I"},{"514","Laboratorio electrónica III"}
                                                ,{"515","Laboratorio electrónica III"},{"500","Laboratorio de química"},{"501","Laboratorio de química"}
                                                ,{"502","Laboratorio de Física"},{"503","Laboratorio de Física 2"},{"504","Biblioteca"}
                                                ,{"81","Edificio de Gobierno"},{"65","Cafeteria"},{"91","ir por patio"},{"60","Entrada"}
                                                ,{"70","Salida"},{"505","Subdirección de servicios educativos e integración social"},{"526","Laboratorio de Neumática"}
                                                ,{"528","Laboratorio de trabajo terminal telemática"},{"527","Laboratorio de bioelectrónica"},{"516","Laboratorio de electrónica I"}
                                                ,{"82","Edificio de Gobierno planta alta"}                            
                    /* cambios*/
                                                 /* cambios
                                                
                                                ,{"92","ir por patio"} ,{"81","Edificio de gobierno"},{"911","ir por escaleras"},{"921","ir por escaleras"},{"931","ir por escaleras"},{"912","ir por escaleras"},{"922","ir por escaleras"},{"932","ir por escaleras"}
                                                ,{"913","ir por escaleras"},{"923","ir por escaleras"},{"933","ir por escaleras"},{"914","ir por escaleras"},{"924","ir por escaleras"},{"934","ir por escaleras"} 
                                                ,{"915","ir por escaleras"},{"925","ir por escaleras"},{"935","ir por escaleras"}
                                                  */
                                                 ,{"92","ir por patio"} ,{"81","Edificio de gobierno planta baja"},{"911","ir por escaleras de edificio 1 planta baja"},{"921","ir por escaleras de edificio 1 piso 1"},{"931","ir por escaleras de edificio 1 piso 2"},{"912","ir por escaleras de edificio 2 planta baja"},{"922","ir por escaleras de edificio 2 piso 1"},{"932","ir por escaleras de edificio 2 piso 2"}
                                                ,{"913","ir por escaleras de edificio 3 planta baja"},{"923","ir por escaleras de edificio 3 piso 1"},{"933","ir por escaleras de edificio 3 piso 2"},{"914","ir por escaleras de edificio 4 planta baja"},{"924","ir por escaleras de edificio 4 piso 1"},{"934","ir por escaleras de edificio 4 piso 2"} 
                                                ,{"915","ir por escaleras de edificio central planta baja"},{"925","ir por escaleras de edificio central piso 1"},{"935","ir por escaleras de edificio central piso 2"} 
            };
            /*  index | integer  | nomenclatura */
            for (int i = 0; i < nomenclatura_especial_2.length; i++) 
            {
            for (int j = 0; j < 1; j++) 
            {
               // System.out.println("mistake");
               // nomenclatura_especial[i][0]=Integer.toString(i);
                nomenclatura_especial_3.add(Integer.parseInt(nomenclatura_especial_2[i][0])); 
            //    System.out.print(nomenclatura_especial_3.get(i));
            }
              //  System.out.println("");+
            }
     
        da_peso matriz_salones=new da_peso();
        ArrayList<Integer> salones= new ArrayList<>();
        int salones_nums[]=new int[]{100,101,102,103,104,105,106,110,111,112,113,114,115,116,120,121,122,123,124,125,126,911,921,931,81,82,200,201,202,203,204,205,206,210,211,212,213,214,215,216,220,221,222,223,224,225,226,912,922,932,300,303,304,305,306,310,311,312,313,314,315,316,320,321,322,323,324,325,326,913,923,933,400,401,402,403,404,405,406,410,411,412,413,414,415,416,420,421,422,423,424,425,426,914,924,934,500,501,502,503,504,505,506,507,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,915,925,935,70,60,65,91,92};                 
        for (int i = 0; i < salones_nums.length; i++)
        {
        salones.add(salones_nums[i]);
        }

        String cadena_a_retornar=new String();
       cadena_a_retornar=("");
        //salones=matriz_salones.recibimos_array_list_de_salones();
    int anterior = ultimo[v];

if (v != s)
{
 recuperaCamino(anterior);
 // vuelve al último del último
    /*      si el index es igual a un integer dentro del int array list            */
    /*/////////////////////////////////////////////////////////////*/


 
 Array_pintense_de_colores.add(salones.get(v));

 
 
 
 /*/////////////////////////////////////////////////////////////*/
 
    if (nomenclatura_especial_3.contains(v)==true) 
    {
       // System.out.println("si lo contiene 1");
    System.out.print(" ->  "/* + v+*/+" "+nomenclatura_especial_2[1][nomenclatura_especial_3.indexOf(v)]+" ->  salon  "+salones.get(0));
    setLa_ruta(getLa_ruta()+" ->  "/* + v+*/+" "+nomenclatura_especial_2[1][nomenclatura_especial_3.indexOf(v)]+" ->  salon  "+salones.get(0));   
        
    }else
    {
        
        //System.out.println("no lo contiene 2 ,v es: "+v);
    System.out.print(" -> salon "/* + v+*/+" "+salones.get(v)+" ->   salon  "+salones.get(0));
    setLa_ruta(getLa_ruta()+" ->  salon "/* + v+*/+" "+salones.get(v)+" ->  salon  "+salones.get(0));   
    }
}else
{
    /*/////////////////////////////////////////////////////////////*/


 
    Array_pintense_de_colores.add(salones.get(s));

 
 
 
    /*/////////////////////////////////////////////////////////////*/
 
    if (nomenclatura_especial_3.contains(s)==true)
    {
        
     System.out.print(" -> "/* + s+*/+" "+nomenclatura_especial_2[1][nomenclatura_especial_3.indexOf(s)]/*salones.get(s)*/+" ->  salon  "+salones.get(0));
    setLa_ruta(getLa_ruta()+" ->  "/* + v+*/+" "+nomenclatura_especial_2[1][nomenclatura_especial_3.indexOf(s)]/*salones.get(s)*/+" ->  salon  "+salones.get(0));
       
   // System.out.print("V salon "/* + s+*/+" "+salones.get(s)+" -> V salon  "+salones.get(0));
  //  setLa_ruta(getLa_ruta()+" -> V salon "/* + v+*/+" "+salones.get(s)+" -> V salon  "+salones.get(0));
    }else
    {
        
    System.out.print(" salon "/* + s+*/+" "+nomenclatura_especial_2[1][nomenclatura_especial_3.indexOf(s)]/*salones.get(s)*/+" ->  salon  "+salones.get(0));
    setLa_ruta(getLa_ruta()+" ->  salon "/* + v+*/+" "+nomenclatura_especial_2[1][nomenclatura_especial_3.indexOf(s)]/*salones.get(s)*/+" ->  salon  "+salones.get(0));
    }
}
                                                                  
return  cadena_a_retornar= getLa_ruta();
}


    public static void main(String[] args) 
    {   
        da_peso matriz_salones=new da_peso();
         ArrayList<Integer> salones= new ArrayList<>();
        salones=matriz_salones.recibimos_array_list_de_salones();
        algortimo matriz_ady =new algortimo();
        int [][] de_matriz_a_vertices=new int [131][131];
         int num_vertices=131;
         GrafMatPeso gra =new GrafMatPeso(num_vertices);
       
         /////////////////////////////////////////////////////////////////////////////////////////////////////
           ArrayList<Integer> nomenclatura_especial_3= new ArrayList<>();
       
            String nomenclatura_especial_2 [][]={{"526","Laboratorio de Neumática"},{"527","Laboratorio de trabajo terminar telemática"}
                                                ,{"528","Laboratorio de biolectrónica"},{"516","Laboratorio electrónica I"},{"517","Centro de idiomas"}
                                                ,{"518","Laboratorio de sistemas digitales"},{"519","Laboratorio telecomunicaciones"},{"506","Biblioteca"}   
                                                ,{"507","Taller de máquinas y herramientas"},{"520","Sala de profesores"},{"521","Sala de profesores"}
                                                ,{"522","Laboratorio de bioingenieria"},{"523","Laboratorio de bioingeniería"},{"524","Sala profesores"}
                                                ,{"525","Sala profesores"},{"510","Laboratorio de Cómputo Móvil"},{"511","Sala de profesores telemática"} 
                                                ,{"512","Laboratorio telemática II"},{"513","Laboratorio telemática I"},{"514","Laboratorio electrónica III"}
                                                ,{"515","Laboratorio electrónica III"},{"500","Laboratorio de química"},{"501","Laboratorio de química"}
                                                ,{"502","Laboratorio de Física"},{"503","Laboratorio de Física 2"},{"504","Biblioteca"}
                                                ,{"81","Edificio de Gobierno"},{"65","Cafeteria"},{"91","ir por patio"},{"60","Entrada"}
                                                ,{"70","Salida"},{"505","Subdirección de servicios educativos e integración social"},{"526","Laboratorio de Neumática"}
                                                ,{"528","Laboratorio de trabajo terminal telemática"},{"527","Laboratorio de bioelectrónica"},{"516","Laboratorio de electrónica I"}
                                                ,{"82","Edificio de Gobierno planta alta"}                            
                    /* cambios
                                                ,{"92","ir por patio"} ,{"81","Edificio de gobierno"},{"911","ir por escaleras"},{"921","ir por escaleras"},{"931","ir por escaleras"},{"912","ir por escaleras"},{"922","ir por escaleras"},{"932","ir por escaleras"}
                                                ,{"913","ir por escaleras"},{"923","ir por escaleras"},{"933","ir por escaleras"},{"914","ir por escaleras"},{"924","ir por escaleras"},{"934","ir por escaleras"} 
                                                ,{"915","ir por escaleras"},{"925","ir por escaleras"},{"935","ir por escaleras"} 
                    */                           ,{"92","ir por patio"} ,{"81","Edificio de gobierno planta baja"},{"911","ir por escaleras de edificio 1 planta baja"},{"921","ir por escaleras de edificio 1 piso 1"},{"931","ir por escaleras de edificio 1 piso 2"},{"912","ir por escaleras de edificio 2 planta baja"},{"922","ir por escaleras de edificio 2 piso 1"},{"932","ir por escaleras de edificio 2 piso 2"}
                                                ,{"913","ir por escaleras de edificio 3 planta baja"},{"923","ir por escaleras de edificio 3 piso 1"},{"933","ir por escaleras de edificio 3 piso 2"},{"914","ir por escaleras de edificio 4 planta baja"},{"924","ir por escaleras de edificio 4 piso 1"},{"934","ir por escaleras de edificio 4 piso 2"} 
                                                ,{"915","ir por escaleras de edificio central planta baja"},{"925","ir por escaleras de edificio central piso 1"},{"935","ir por escaleras de edificio central piso 2"} 
                                                
            };                                    
            
            /*  index | integer  | nomenclatura */
            for (int i = 0; i < nomenclatura_especial_2.length; i++) 
            {
            for (int j = 0; j < 1; j++) 
            {
               // System.out.println("mistake");
               // nomenclatura_especial[i][0]=Integer.toString(i);
                nomenclatura_especial_3.add(Integer.parseInt(nomenclatura_especial_2[i][0])); 
               // System.out.print(nomenclatura_especial_3.get(i));
            }
               // System.out.println("");
            }
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
        de_matriz_a_vertices=matriz_ady.devuelve();
            /*crear vertices*/
        for (int i = 0; i < 131; i++)
        {
        gra.nuevoVertice(salones.get(i));
        //System.out.println(gra.numVertice(i));
        }
        
        
        /*generar arcos entre ellos*/
            
           
        for (int i = 0; i < 131; i++) 
        {
            for (int j = 0; j < 131; j++)
            {
                if (de_matriz_a_vertices[i][j]!=0&&de_matriz_a_vertices[i][j]!=de_matriz_a_vertices[j][i])
                {   
                    /*creamos enlace dirigido*/
                    gra.nuevoArco(salones.get(i),salones.get(j), de_matriz_a_vertices[i][j]);
                 }else if (de_matriz_a_vertices[i][j]!=0&&de_matriz_a_vertices[i][j]==de_matriz_a_vertices[j][i]) 
                {
                    /*creamos enlace bidireccional*/
                 gra.nuevoArco(salones.get(i),salones.get(j), de_matriz_a_vertices[i][j]);
                 gra.nuevoArco(salones.get(j), salones.get(i), de_matriz_a_vertices[j][i]);
                }
            }
        }
    int origen =78;
      CaminoMinimo nuevo =new CaminoMinimo(gra,origen);
    nuevo.caminoMinimos();
    int destino=0;
        if (destino==0)
        {
            
        nuevo.recuperaCamino_cero(1);
        
        }else
        {
         nuevo.recuperaCamino(destino);
        }
    }

    /**
     * @return the la_ruta
     */
    public String getLa_ruta() {
        return la_ruta;
    }

    /**
     * @param la_ruta the la_ruta to set
     */
    public void setLa_ruta(String la_ruta) {
        this.la_ruta = la_ruta;
    }

    /**
     * @return the salones_nums
     */
    public int[] getSalones_nums() {
        return salones_nums;
    }
} 

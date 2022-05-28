
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis_Ortiz
 */
public class Pila {
 public ArrayList<Integer> array_Pintense_de_colores=new ArrayList<Integer>();
   
    
    private NodoPila cima;
    int tam;
    
    public Pila(){
        cima = null;
        tam = 0;
    }
    
    /**Método que indica si esta vacía la Pila*/
    public boolean estaVacia(){
        return cima == null;
    }
    
    /**Metodo para agregar (push) un lugar en la Pila*/
    public void agragar(int lug){
        NodoPila nuevo = new NodoPila(lug);
        nuevo.siguiente=cima;
        cima=nuevo;
        tam++;
    }
    
    /**Método para sacar (pop) el último lugar agregado a la Pila*/
    public int sacar(){
        int aux = cima.lugar;
        cima = cima.siguiente;
        tam--;
        return aux;
    }
       
    /**Metodo para conocer el último elemento ingresado en la Pila*/
    public int cima(){
        return cima.lugar;
    }
    
    /**Método para conocer cuantos lugares se han ingresado en la */
    public int numLugares(){
        return tam;
    }
    
       public String ruta =new String();
       public String peso_de_ruta =new String();
         public ArrayList<Integer> partidas_y_destinos= new ArrayList<>();
         public ArrayList<Integer> partidas= new ArrayList<>();
         public ArrayList<Integer> destinos= new ArrayList<>();
        public boolean para_no_agregar_mas=false;
    public void Imprimir() {
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
                                                 /* cambios*/
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
             //   System.out.print(nomenclatura_especial_3.get(i));
            }
               // System.out.println("");
            }       
        da_peso matriz_salones=new da_peso();
         ArrayList<Integer> salones= new ArrayList<>();
         salones=matriz_salones.recibimos_array_list_de_salones();
        algortimo matriz_ady =new algortimo();
        int [][] de_matriz_a_vertices=new int [131][131];
         int num_vertices=131;
         GrafMatPeso gra =new GrafMatPeso(num_vertices);
        
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
        
        
        
         if (tam == 0)
        {
            System.out.println("No existen elementos en la pila");
        } else 
            {
                
//             ArrayList<Integer> partidas_y_destinos= new ArrayList<>();
//              ArrayList<Integer> partidas= new ArrayList<>();
//             ArrayList<Integer> destinos= new ArrayList<>();
            
            // int i=getPartidas_y_destinos().size();
                
       
                while(!estaVacia())
            {
                
                getPartidas_y_destinos().add( cima.lugar);
                System.out.println("pila"+cima.lugar);
                cima = cima.siguiente;
                tam--;
                
            }
                  int partida=0,destino=0;
                /*mandamos a llamar al metodo para tener el peso y las rutas*/
                //obtener el index que ingreso el usuario  
                String la_ruta_del_metodo=new String();      
                System.out.println("////////////////////////////////////////////////////////");
                System.out.println("mostramos todas las partidas y destinos");
                for (int j = 0; j < getPartidas_y_destinos().size(); j++)
                {
                    System.out.println(getPartidas_y_destinos().get(j)+" con index de "+getPartidas_y_destinos().indexOf(getPartidas_y_destinos().get(j)));
                }
                 System.out.println(" el array list de partidas y destinos tiene un size de "+getPartidas_y_destinos().size());
                System.out.println("////////////////////////////////////////////////////////");
                if (getDestinos().size()>0) 
                {
                    getDestinos().clear();
                }if (getPartidas().size()>0)
                {
                    getPartidas().clear();
                }
                for (int j = 0; j < getPartidas_y_destinos().size(); j++)
            {
                if (getPartidas_y_destinos().indexOf(getPartidas_y_destinos().get(j))==0) 
                {
                  
                    getDestinos().add(getPartidas_y_destinos().get(0));
                    j=j+1;
                }
                if ((getPartidas_y_destinos().indexOf(getPartidas_y_destinos().get(j)))%2==0)
                {
                   getDestinos().add(getPartidas_y_destinos().get(j));
                }
                if((getPartidas_y_destinos().indexOf(getPartidas_y_destinos().get(j)))%2==1)
                {  
                    getPartidas().add(getPartidas_y_destinos().get(j));
                }
            }
                System.out.println("//////////////////////////////////////////////");
                System.out.println(" el size de las partidas es "+getPartidas().size());
                System.out.println(" el size de los destinos es "+getDestinos().size());
                System.out.println("//////////////////////////////////////////////");
                for (int j = 0; j < getPartidas().size(); j++) 
                {
                  int source =0,target=0;
                source=salones.indexOf(getPartidas().get(j));
                target=salones.indexOf(getDestinos().get(j));
                System.out.println(" esto es  source "+getPartidas().get(j));
                System.out.println(" esto es  target "+getDestinos().get(j));
                
                 CaminoMinimo nuevo =new CaminoMinimo(gra,source);
                
                  /*                                                                        */
                 
                 
                 
                 
                 
                 ///               transmitir la array list pintense de colores 
                    setArray_Pintense_de_colores(nuevo.Array_pintense_de_colores);
                 
                 
                 
                 
                 
                 
                 
                 /*                                                                        */
                 nuevo.caminoMinimos();
                 /*       da cadenas        */
                    if (getRuta()!=null) 
                    {
                        if (target!=0) 
                        {
                            /* saber si el source or el target es de nomenclaruta especial*/
                            if (nomenclatura_especial_3.contains(salones.get(source))==true&&nomenclatura_especial_3.contains(salones.get(target))==false) 
                            {
                             setRuta(getRuta()+"\n"+" Ruta del "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(source))][1]+" al "+salones.get(target)+" es: "+nuevo.recuperaCamino(target));    
                            }else if (nomenclatura_especial_3.contains(salones.get(source))==true&&nomenclatura_especial_3.contains(salones.get(target))==true) 
                                {
                                setRuta(getRuta()+"\n"+" Ruta del "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(source))][1]+" al "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(target))][1]+" es: "+nuevo.recuperaCamino(target));    
                                }else if (nomenclatura_especial_3.contains(/*target*/salones.get(target))==true&&nomenclatura_especial_3.contains(/*source*/salones.get(source))==false) 
                                            {
                                             setRuta(getRuta()+"\n"+" Ruta del "+salones.get(/*source*/source)+" al "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(target))][1]+" es: "+nuevo.recuperaCamino(target));    
                                            }
                                            else if (nomenclatura_especial_3.contains(/*target*/salones.get(target))==false&&nomenclatura_especial_3.contains(/*source*/salones.get(source))==false) 
                                            {
                                             setRuta(getRuta()+"\n"+" Ruta del salon "+salones.get(source)+" al salon "+salones.get(target)+" es: "+nuevo.recuperaCamino(target));
                                            }
                        }else if(target==0)
                                                       
                            if (nomenclatura_especial_3.contains(/*source*/salones.get(source))==true/*&&nomenclatura_especial_3.contains(target)==false*/) 
                            {
                             setRuta(getRuta()+"\n"+" Ruta del "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(source))][1]+" al salon"+salones.get(target)+" es: "+nuevo.recuperaCamino_cero(1));    
                            }else if (nomenclatura_especial_3.contains(/*source*/salones.get(source))==false/*&&nomenclatura_especial_3.contains(target)==true*/) 
                                {
                                setRuta(getRuta()+"\n"+" Ruta del salon "+salones.get(source)+" al salon"+salones.get(target)+" es: "+nuevo.recuperaCamino_cero(1));    
                                }
                        
                    }else
                    {
                    
                        if (target!=0) 
                        {
                           /* saber si el source or el target es de nomenclaruta especial*/
                            if (nomenclatura_especial_3.contains(/*source*/salones.get(source))==true&&nomenclatura_especial_3.contains(/*target*/salones.get(target))==false) 
                            {
                             setRuta(" Ruta del "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(source))][1]+" al "+salones.get(target)+" es: "+nuevo.recuperaCamino(target));    
                            }else if (nomenclatura_especial_3.contains(/*source*/salones.get(source))==true&&nomenclatura_especial_3.contains(/*target*/salones.get(target))==true) 
                                {
                                setRuta(" Ruta del "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(source))][1]+" al "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(target))][1]+" es: "+nuevo.recuperaCamino(target));    
                                }else if (nomenclatura_especial_3.contains(/*target*/salones.get(target))==true&&nomenclatura_especial_3.contains(/*source*/salones.get(source))==false) 
                                            {
                                             setRuta(" Ruta del "+salones.get(source)+" al "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(target))][1]+" es: "+nuevo.recuperaCamino(target));    
                                            }
                                            else if (nomenclatura_especial_3.contains(/*target*/salones.get(target))==false&&nomenclatura_especial_3.contains(/*source*/salones.get(source))==false) 
                                            {
                                             setRuta(" Ruta del salon "+salones.get(source)+" al salon "+salones.get(target)+" es: "+nuevo.recuperaCamino(target));
                                            }   
                        
                        }else if (target==0)
                        {
                            
                            if (nomenclatura_especial_3.contains(/*source*/salones.get(source))==true/*&&nomenclatura_especial_3.contains(target)==false*/) 
                            {
                             setRuta(" Ruta del "+nomenclatura_especial_2[nomenclatura_especial_3.indexOf(salones.get(source))][1]+" al salon"+salones.get(target)+" es: "+nuevo.recuperaCamino_cero(1));    
                            }else if (nomenclatura_especial_3.contains(/*source*/salones.get(source))==false/*&&nomenclatura_especial_3.contains(target)==true*/) 
                                {
                                setRuta(" Ruta del salon "+salones.get(source)+" al salon"+salones.get(target)+" es: "+nuevo.recuperaCamino_cero(1));    
                                }
                            
                        // setRuta(" Ruta del "+salones.get(source)+" al "+salones.get(target)+" es: "+nuevo.recuperaCamino_cero(1));
                        }
                    
                    }  
                    
                       
                 
                 setRuta(getRuta()+"\n"+" El destino se encuentra a: "+matriz_salones.dijkstra(matriz_ady.devuelve(), source, target)+" metros \n"+
                         " Aproximadamente: "+matriz_salones.dijkstra(matriz_ady.devuelve(), source, target)/30+" minutos");
                 /* aplicamos el de devuelve peso */
                 
                 //matriz_salones.dijkstra(matriz_ady.devuelve(), source, target);
                }
                
               
          
         }
        
    }
    public void Regresa_pesos_y_rutas() {
        ArrayList<Integer> partidas_y_destinos= new ArrayList<>();
        if (tam == 0) 
        {
            System.out.println("No existen elementos en la pila");
        } else 
        {
                int i=0;
            while(!estaVacia())
            {
                
                partidas_y_destinos.add(i, cima.lugar);
                cima = cima.siguiente;
                tam--;
                i++;
            }
            System.out.println("  arraylist");
            for (int j = 0; j < partidas_y_destinos.size(); j++)
            {
                System.out.println(partidas_y_destinos.get(j));
            }
        }
        
    }

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the peso_de_ruta
     */
    public String getPeso_de_ruta() {
        return peso_de_ruta;
    }

    /**
     * @param peso_de_ruta the peso_de_ruta to set
     */
    public void setPeso_de_ruta(String peso_de_ruta) {
        this.peso_de_ruta = peso_de_ruta;
    }

    /**
     * @return the array_Pintense_de_colores
     */
    public ArrayList<Integer> getArray_Pintense_de_colores() {
        return array_Pintense_de_colores;
    }

    /**
     * @param array_Pintense_de_colores the array_Pintense_de_colores to set
     */
    public void setArray_Pintense_de_colores(ArrayList<Integer> array_Pintense_de_colores) {
        this.array_Pintense_de_colores = array_Pintense_de_colores;
    }

    /**
     * @return the partidas_y_destinos
     */
    public ArrayList<Integer> getPartidas_y_destinos() {
        return partidas_y_destinos;
    }

    /**
     * @param partidas_y_destinos the partidas_y_destinos to set
     */
    public void setPartidas_y_destinos(ArrayList<Integer> partidas_y_destinos) {
        this.partidas_y_destinos = partidas_y_destinos;
    }

    /**
     * @return the partidas
     */
    public ArrayList<Integer> getPartidas() {
        return partidas;
    }

    /**
     * @param partidas the partidas to set
     */
    public void setPartidas(ArrayList<Integer> partidas) {
        this.partidas = partidas;
    }

    /**
     * @return the destinos
     */
    public ArrayList<Integer> getDestinos() {
        return destinos;
    }

    /**
     * @param destinos the destinos to set
     */
    public void setDestinos(ArrayList<Integer> destinos) {
        this.destinos = destinos;
    }

    /**
     * @return the para_no_agregar_mas
     */
    public boolean isPara_no_agregar_mas() {
        return para_no_agregar_mas;
    }

    /**
     * @param para_no_agregar_mas the para_no_agregar_mas to set
     */
    public void setPara_no_agregar_mas(boolean para_no_agregar_mas) {
        this.para_no_agregar_mas = para_no_agregar_mas;
    }
    
    
    
}

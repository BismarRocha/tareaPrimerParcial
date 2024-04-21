
/**
 * Write a description of class ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2
{
    public boolean puedoGenerar(String[] a, String x){
        boolean siPuedo;
        siPuedo = confirmar(a,x,0,0);
        return siPuedo;
    }
    int aux;
    boolean si = false;
    public boolean confirmar(String[] a, String x, int i, int j){       
        if(i< a.length){
            if(x.length() == 1){
                aux++;
                si = confirmar(a,x,i+1,j);
            }else{
                if(a[i].charAt(0) == x.charAt(j)){
                aux++;
                si =confirmar(a,x,i+1,j+1);
                }else{
                si =confirmar(a,x,i+1,j);
                }
            }
        }
        else if(aux <= a.length ){
            si=true;
        }
        return si;
    }
}

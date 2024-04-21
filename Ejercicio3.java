
/**
 * use como base la forma de una matriz para el posicionamiento
 *  01234
 *0
 *1  c
 *2
 *3
 *4    t 
 *5
 * n x m n=6 && m=5
 *  c[1][1]  t[4][3]
 */
import java.util.Random;
public class Ejercicio3
{
    String resul;
    public String simular(int n, int m, int cx, int cy, int tx, int ty){
        if(cx == tx && cy <= n){
            resul = "Second";
        }else{
            if(cx <= m && cy == ty){
                resul = "Second";
            }
            else{
                resul = matar(n,m,cx,cy,tx,ty,0,0,0);
            }
        }      
        return resul;
    }
    int[] aux;
    int[] aux2;
    public String matar(int n, int m, int cx, int cy, int tx, int ty,int i, int j, int k){
        if(i==tx && j==ty ){
            resul = "First";
        }
        else{
            switch(k){
                case 0:
                    i=cx-2;
                    j=cy+1;
                    resul = matar(n,m,cx,cy,tx,ty,i,j,k+1);
                    break;
                case 1:
                    i = cx-2;
                    j = cy-1;
                    resul = matar(n,m,cx,cy,tx,ty,i,j,k+1);
                    break;
                case 2:
                    i = cx-1;
                    j = cy+2;
                    resul = matar(n,m,cx,cy,tx,ty,i,j,k+1);
                    break;
                case 3:
                    i = cx+1;
                    j = cy+2;
                    resul = matar(n,m,cx,cy,tx,ty,i,j,k+1);
                    break;
                case 4:
                    i = cx+2;
                    j = cy+1;
                    resul = matar(n,m,cx,cy,tx,ty,i,j,k+1);
                    break;
                case 5:
                    i = cx+2;
                    j = cy-1;
                    resul = matar(n,m,cx,cy,tx,ty,i,j,k+1);
                    break;
                case 6:
                    i = cx-1;
                    j = cy-2;
                    resul = matar(n,m,cx,cy,tx,ty,i,j,k+1);
                    break;
                case 7:
                    i = cx+1;
                    j = cy-2;
                    resul = matar(n,m,cx,cy,tx,ty,i,j,k+1);
                    break;
                case 8:
                    i=0;
                    j=0;
                    k=0;
                    aux2 = new int[2];
                    aux2 = cambioxy(cx,cy,n,m,-1,-1,0);
                    cx = aux2[0];
                    cy = aux2[1];
                    resul = simular(n, m,cx, cy,tx,ty);
                    break;
            }
        }
        return resul;
    }
    
    public int[] cambioxy(int cx, int cy,int n,int m,int i,int j,int k){
        if(i >= 0 && i<=n && j >= 0 && j<=n){
            aux = new int[2];
            aux[0] =i;
            aux[1] =j;
        }
        else{
            switch(k){
                case 0:
                    i=cx-2;
                    j=cy+1;
                    aux = cambioxy(cx,cy,n,m,i,j,k+1);
                    break;
                case 1:
                    i = cx-2;
                    j = cy-1;
                    aux = cambioxy(cx,cy,n,m,i,j,k+1);
                    break;
                case 2:
                    i = cx-1;
                    j = cy+2;
                    aux = cambioxy(cx,cy,n,m,i,j,k+1);
                    break;
                case 3:
                    i = cx+1;
                    j = cy+2;
                    aux = cambioxy(cx,cy,n,m,i,j,k+1);
                    break;
                case 4:
                    i = cx+2;
                    j = cy+1;
                    aux = cambioxy(cx,cy,n,m,i,j,k+1);
                    break;
                case 5:
                    i = cx+2;
                    j = cy-1;
                    aux = cambioxy(cx,cy,n,m,i,j,k+1);
                    break;
                case 6:
                    i = cx-1;
                    j = cy-2;
                    aux = cambioxy(cx,cy,n,m,i,j,k+1);
                    break;
                case 7:
                    i = cx+1;
                    j = cy-2;
                    aux = cambioxy(cx,cy,n,m,i,j,k+1);
                    break;
                case 8:
                    resul = "Empate";
                    break;
            }
        }
        return aux;
    }
}

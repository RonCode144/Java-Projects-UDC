import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;

public class Dados {
    
    public int dado1, dado2;
    public int n1, n2;
    
    public Dados(int dado1, int dado2){
        
        this.dado1 = dado1;
        this.dado2 = dado2;
    }
    
    public static int TiradaDado1(){
        
        Random rd = new Random();
        
        int numero = rd.nextInt(6) +1;
        
        //Integer.toString(numero);
        //n = Integer.toString(n1);
        
        return numero;
    }
    
    public static int TiradaDado2(){
        
        Random rd = new Random();
        
        int numero = rd.nextInt(6) +1;
        
        //Integer.toString(numero);
        //m = Integer.toString(n2);
        
        return numero;
    }
    
    public void ValidarNumeros(){
        
        if (TiradaDado1() == 2 && TiradaDado2() == 4){
            
            System.out.println("Eres afortunado, estas son las cosas de la vida");
        }
        
        if (TiradaDado1() == 4 && TiradaDado2() == 2){
            
            System.out.println("Eres afortunado, estas son las cosas de la vida");
        }
    }
    
    public String Jugar(String resultado){
        
        System.out.println("Tirada Dado 1: " + TiradaDado1());
        System.out.println("Tirada Dado 2: " + TiradaDado2());
        return resultado;
    }
    
    //Método opcional para direccionar al repositorio de este código
    public void urlRepository(){
        //Direccionar a url del repositorio
        URL url = null;
            try {
                url = new URL("http://www.github.com/RonCode144/");
                try {
                     Desktop.getDesktop().browse(url.toURI());
                    } catch (IOException e){
                    e.printStackTrace();
                    } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            } catch (MalformedURLException e1) {
                    e1.printStackTrace();
                }
    }
    
    public int getDado1(){
        return dado1;
    }
    
    public void setDado1(int dado1){
        this.dado1 = dado1;
    }
    
    public int getDado2(){
        return dado2;
    }
    
    public void setDado2(int dado2){
        this.dado2 = dado2;
    }
}
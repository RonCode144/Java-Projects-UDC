//Librerías usadas en esta clase
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Calendar;
import java.util.Scanner;

//Clase Clima
public class Clima {
    
    //Instanciar clase Calendar
    Calendar c = Calendar.getInstance();
    
    //Atributos
    public String ciudad;
    public double gCentigrados;
    public double pPrecipitaciones;
    public double humedad;
    public double viento;
    
    //Constructor por defecto
    public Clima(String ciudad, double gCentigrados, double pPrecipitaciones,
            double humedad, double viento){
        
        this.ciudad = ciudad;
        this.gCentigrados = gCentigrados;
        this.pPrecipitaciones = pPrecipitaciones;
        this.humedad = humedad;
        this.viento = viento;
    }
    
    //Método para convertir grados Centígrados a Farhenheit
    public void ConversorGradosAFarenheit(){
        
        //Instanciar la clase Scanner para lectura de datos por consola
        Scanner sc = new Scanner(System.in);
        
        double centigrados;
        double fahrenheit;
        
        System.out.println("***Conversor Grados Centígrados A Farhenheit***");
        System.out.println("Ingrese Grados Centígrados");
        centigrados = sc.nextDouble();
        
        //Fórmula de conversión
        fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("Conversión: " + Math.abs(centigrados) + " ºC " + 
                "es igual a " + Math.abs(fahrenheit) +  " ºF\n" );
        System.out.println("*****************************");
    }
    
    //Método para obtener la fecha actual del sistema
    public String ObtenerFechaActual(){
        
        String dia, mes, annio;
        
        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        annio = Integer.toString(c.get(Calendar.YEAR));
        
        return "Fecha Actual: " + dia + "/0" + mes + "/" + annio;
    }
    
    //Método para mostrar datos de la clase en consola
    public void MostrarDatosDelClima(){
        
        System.out.println("*** DATOS DEL CLIMA ***\n");
        System.out.println("Ciudad: " + ciudad + "\n" + ObtenerFechaActual()
        + "\nGrados Centígrados: " + gCentigrados + "\nProbabilidades de "
               + "Precipitaciones: " + pPrecipitaciones + "%" +
               "\nHumedad: " + humedad + "%" + "\nViento: " + viento + " Km/h");
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

    //Getters and Setters
    public Calendar getC() {
        return c;
    }

    public void setC(Calendar c) {
        this.c = c;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getgCentigrados() {
        return gCentigrados;
    }

    public void setgCentigrados(double gCentigrados) {
        this.gCentigrados = Math.abs(gCentigrados);
    }

    public double getpPrecipitaciones() {
        return pPrecipitaciones;
    }

    public void setpPrecipitaciones(double pPrecipitaciones) {
        this.pPrecipitaciones = Math.abs(pPrecipitaciones);
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = Math.abs(humedad);
    }

    public double getViento() {
        return viento;
    }

    public void setViento(double viento) {
        this.viento = Math.abs(viento);
    }
}
//Librerías usadas en esta clase
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.NumberFormat;
//import java.text.DecimalFormat;
import java.util.Locale;

//Clase automovil
public class automovil
{
    //Atributos
    public String marca;
    public String clase;
    public String modelo;
    public int anio;
    public int placa;
    public int nPuertas;
    public int precio;
    public int motor;
    public int potenciaMax;

    //Constructor por defecto
    public automovil(String marca, String clase, String modelo, int anio, int placa, int nPuertas, int precio, int motor, int potenciaMax) {
        this.marca = marca;
        this.clase = clase;
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
        this.nPuertas = nPuertas;
        this.precio = precio;
        this.motor = motor;
        this.potenciaMax = potenciaMax;
    }
    //Métodos
    //Método para imprimir en consola
    @Override
    public String toString(){
        
        //Dar formato de moneda al atributo precio
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        //NumberFormat df = new DecimalFormat("##,###");
        Locale locale = new Locale("es", "COP");
        
        System.out.println("*** DATOS DEL VEHÍCULO ***");
        return "Marca: " + marca + "\nClase: " + clase 
                + "\nModelo: " + modelo + "\nAño Producción: " + anio + 
                "\nPlaca GSX-" + placa + "\nNúmero De Puertas: " + nPuertas + 
                "\nPrecio: " + nf.format(precio) + "\nMotor: AC-" + motor + 
                "\nPotencia Máxima: " + potenciaMax + " Km/h";
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

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getClase() {
        return clase;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public int getPlaca() {
        return placa;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public int getPrecio() {
        return precio;
    }

    public int getMotor() {
        return motor;
    }

    public int getPotenciaMax() {
        return potenciaMax;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = Math.abs(anio);
    }

    public void setPlaca(int placa) {
        this.placa = Math.abs(placa);
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = Math.abs(nPuertas);
    }

    public void setPrecio(int precio) {
        this.precio = Math.abs(precio);
    }

    public void setMotor(int motor) {
        this.motor = Math.abs(motor);
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = Math.abs(potenciaMax);
    }
}
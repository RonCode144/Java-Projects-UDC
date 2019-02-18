///summary
//Pueden encontrar este código en el repositorio GitHub: RonCode144
//Este código ha sido creado con completa originalidad y autoría del cipa
//
//
//

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Clima clima = new Clima("NN", 45, 45, 45, 45);
        
        clima.setCiudad("Cartagena");
        clima.setgCentigrados(-35.3);
        clima.setpPrecipitaciones(-30);
        clima.setHumedad(-20);
        clima.setViento(-33);
        clima.ConversorGradosAFarenheit();
        clima.MostrarDatosDelClima();
        
        //Método opcional para direccionar al repositorio de este código
        //clima.urlRepository();
    }
}
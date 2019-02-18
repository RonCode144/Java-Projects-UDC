///summary
//Pueden encontrar este código en el repositorio GitHub: RonCode144
//Este código ha sido creado con completa originalidad y autoría del cipa
//
//
//

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        automovil auto = new automovil("Ford, Toyota, Mazda, Suzuki, Renault, "
                + "Kia, Chevrolet","Campero, Camioneta, Volqueta, Camion, Bus", 
                "Camaro", 2016, 589, 4, 500000, 510, 220);
        
        auto.setMarca("Mazda");
        auto.setClase("Volqueta");
        auto.setModelo("Camaro");
        auto.setAnio(-2015);
        auto.setPlaca(-589);
        auto.setnPuertas(-4);
        auto.setPrecio(-45000000);
        auto.setMotor(-600);
        auto.setPotenciaMax(-230);
        System.out.println(auto.toString());
        
        //Método opcional para direccionar al repositorio de este código
        //auto.urlRepository();
    }
}
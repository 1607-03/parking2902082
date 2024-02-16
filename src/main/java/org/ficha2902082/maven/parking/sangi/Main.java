package org.ficha2902082.maven.parking.sangi;

//importar dependencias
import org.ficha2902082.maven.parking.sangi.entities.Carro;
import org.ficha2902082.maven.parking.sangi.entities.Cliente;
import org.ficha2902082.maven.parking.sangi.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.sangi.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
        // crear dos instancias
        // de la clase carr
        Carro carrito1 = new Carro();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;

        Carro carrito2 = new Carro();
        carrito2.placa = "RAP 527";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;

        Cliente clientecito = new Cliente();
        clientecito.nombre = "Santi";
        clientecito.apellidos = "Delgado";
        clientecito.tipoDocumento = TipoDocumento.CC;
        clientecito.numeroDocumento = 187362890L;
        clientecito.celular = 21486327863L;

        // añadir carros al cliente
        // invocar, llamar, ejecutar
        // el metodo addCar
        clientecito.addCar(carrito1);
        clientecito.addCar(carrito2);
        clientecito.addCar("ASD 456", TipoVehiculo.TAXI);

        System.out.println("cliente:" + clientecito.nombre);
        System.out.println("documento:" + clientecito.numeroDocumento);
        System.out.println("vehiculos :");

        for (Carro c : clientecito.misCarros) {

            System.out.println("placa:" + c.placa);
            System.out.println("tipo:" + c.tipoVehiculo);
            System.out.println("_______________");

        }

    }
}
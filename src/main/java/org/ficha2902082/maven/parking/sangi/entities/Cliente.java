package org.ficha2902082.maven.parking.sangi.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public long celular;

    public List<Carro> misCarros = new ArrayList<Carro>();

    // metodo 1: añadir carro al cliente
    // definir metodo:
    // - modificador acceso
    // - tipo de dato de retorno
    // - nombre del metodo
    // parametros(Entradas,inputs):
    // 1. tipo de dato del parametro
    // 2. nombre del parametro
    public void addCar(Carro c) {
        this.misCarros.add(c);
    }

    // sobrecarga metodo addcar
    public void addCar(String placa, TipoVehiculo tipoVehiculo) {
        // construir (instanciar)
        Carro c = new Carro();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;

        this.misCarros.add(c);

    }

    // sobre carga de metodos
    // en una clase se permiten metodos
    // con el mismo nombre pero
    // con diferente firma

}

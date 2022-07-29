/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testControlador;
import modelo.Distribuidor;
import controlador.MantenedorDistribuidor;

/**
 *
 * @author carlo
 */
public class TestMantenedorDistribuidor {
    public static void main(String[] args) {
        try{
        
            Distribuidor Idi2 = new Distribuidor(8, 10, "rut", "nombre", "direccion");
           MantenedorDistribuidor manteIdi = new MantenedorDistribuidor();
           
           if(manteIdi.agregar(Idi2)==1){
           System.out.println("Agregado");
           }
           
           if(manteIdi.agregar(Idi2)==1){
           System.out.println("Agregado");
           }
            for (Distribuidor tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           Idi2.setNombre("Frances");
           if(manteIdi.modificar(Idi2)==1){
            System.out.println("Modificado");
           } 
           for (Distribuidor tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           if(manteIdi.eliminar("rut")==1){
           System.out.println("Eliminado");
           }
           
           for (Distribuidor tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
        }catch(com.mysql.jdbc.exceptions.jdbc4.CommunicationsException ex){
            System.out.println("Error al Conectar con la BD");
        }
        catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException ex){
            System.out.println("No Puede agregar una PK repetida, ingrese otro dato");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}

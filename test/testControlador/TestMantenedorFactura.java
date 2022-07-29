/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testControlador;
import modelo.Factura;
import controlador.MantenedorFactura;

/**
 *
 * @author carlo
 */
public class TestMantenedorFactura {
    public static void main(String[] args) {
        try{
        
            Factura Idi2 = new Factura(144, 0, 0, 0, 0, "fecha", "hora", "distribuidor");
           MantenedorFactura manteIdi = new MantenedorFactura();
           
           if(manteIdi.agregar(Idi2)==1){
           System.out.println("Agregado");
           }
           
           if(manteIdi.agregar(Idi2)==1){
           System.out.println("Agregado");
           }
            for (Factura tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           Idi2.setFecha("Frances");
           if(manteIdi.modificar(Idi2)==1){
            System.out.println("Modificado");
           } 
           for (Factura tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           if(manteIdi.eliminar(4)==1){
           System.out.println("Eliminado");
           }
           
           for (Factura tmp : manteIdi.mostrar()) {
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

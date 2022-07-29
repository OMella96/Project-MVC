/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testControlador;
import modelo.Boleta;
import controlador.MantenedorBoleta;

/**
 *
 * @author carlo
 */
public class TestMantenedorBoleta {
    public static void main(String[] args) {
        try{
        
            Boleta Bol2 = new Boleta(1110, 20, 50, 100, 440, "fecha", "hora", "cliente", "trabajador");
           MantenedorBoleta manteIdi = new MantenedorBoleta();
           
           if(manteIdi.agregar(Bol2)==1){
           System.out.println("Agregado");
           }
           
           if(manteIdi.agregar(Bol2)==1){
           System.out.println("Agregado");
           }
            for (Boleta tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
         
           if(manteIdi.modificar(Bol2)==1){
            System.out.println("Modificado");
           } 
           for (Boleta tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           if(manteIdi.eliminar(4)==1){
           System.out.println("Eliminado");
           }
           
           for (Boleta tmp : manteIdi.mostrar()) {
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

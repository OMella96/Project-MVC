/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testControlador;
import modelo.Idioma;
import controlador.MantenedorIdioma;

/**
 *
 * @author carlo
 */
public class TestMantenedorIdioma {
    public static void main(String[] args) {
        try{
        
            Idioma Idi2 = new Idioma(6, "prueba");
           MantenedorIdioma manteIdi = new MantenedorIdioma();
           
           if(manteIdi.agregar(Idi2)==1){
           System.out.println("Agregado");
           }
           
           if(manteIdi.agregar(Idi2)==1){
           System.out.println("Agregado");
           }
            for (Idioma tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           Idi2.setDetalle("Frances");
           if(manteIdi.modificar(Idi2)==1){
            System.out.println("Modificado");
           } 
           for (Idioma tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           if(manteIdi.eliminar(4)==1){
           System.out.println("Eliminado");
           }
           
           for (Idioma tmp : manteIdi.mostrar()) {
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

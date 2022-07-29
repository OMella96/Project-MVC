/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testControlador;
import modelo.Categoria;
import controlador.MantenedorCategoria;

/**
 *
 * @author carlo
 */
public class TestMantenedorCategoria {
    public static void main(String[] args) {
        try{
        
            Categoria Cat2 = new Categoria(4, "testeo3");
           MantenedorCategoria manteIdi = new MantenedorCategoria();
           
           if(manteIdi.agregar(Cat2)==1){
           System.out.println("Agregado");
           }
           
           if(manteIdi.agregar(Cat2)==1){
           System.out.println("Agregado");
           }
            for (Categoria tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           Cat2.setDescripcion("testeo");
           if(manteIdi.modificar(Cat2)==1){
            System.out.println("Modificado");
           } 
           for (Categoria tmp : manteIdi.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           if(manteIdi.eliminar(4)==1){
           System.out.println("Eliminado");
           }
           
           for (Categoria tmp : manteIdi.mostrar()) {
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

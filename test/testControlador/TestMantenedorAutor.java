/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testControlador;
import modelo.Autor;
import controlador.MantenedorAutor;

/**
 *
 * @author carlo
 */
public class TestMantenedorAutor {
    public static void main(String[] args) {
        try{
        
            Autor Aut2 = new Autor(8, "prueba1","apellidom", "apellidop");
           MantenedorAutor manteAut = new MantenedorAutor();
           
           if(manteAut.agregar(Aut2)==1){
           System.out.println("Agregado");
           }
           
           if(manteAut.agregar(Aut2)==1){
           System.out.println("Agregado");
           }
            for (Autor tmp : manteAut.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           Aut2.setApellidom("test2");
           if(manteAut.modificar(Aut2)==1){
            System.out.println("Modificado");
           } 
           for (Autor tmp : manteAut.mostrar()) {
                System.out.println(tmp.toString());
           }
           
           if(manteAut.eliminar(4)==1){
           System.out.println("Eliminado");
           }
           
           for (Autor tmp : manteAut.mostrar()) {
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

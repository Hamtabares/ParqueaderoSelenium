package Parqueadero;
import javax.swing.*;
/**
 * Clase para hacer la gesti�n de un parqueadero a trav�s de un men� b�sico de opciones
 * @author Sandra V. Hurtado
 * @version 8-nov-2012
 */
public class ControlParqueadero 
{
    
    Parqueadero parquea = new Parqueadero();

    /**
     * M�todo para parquear un carro:
     * Primero se verifica que existan puestos disponibles. Si hay puestos 
     * se piden los datos del carro y se parquea.
     * En caso de no tener puestos disponibles se muestra un mensaje indicando esto.
     */
    public void parquearCarro() 
    {
            String placa = JOptionPane.showInputDialog("Placa del carro:");
            // Verifica que el carro ya no est� parqueadao
            if (parquea.buscarCarro(placa) == null) 
            {
                String marca = JOptionPane.showInputDialog("Marca del carro:");
                String modeloCadena = JOptionPane.showInputDialog("Modelo del carro:");
                int modelo = Integer.parseInt(modeloCadena);
                Carro nuevo = new Carro(Placa, Marca, Modelo);
                boolean pudoParquear = parquea.parquearCarro(nuevo);
                if (pudoParquear) 
                {
                   JOptionPane.showMessageDialog(null,"El carro fue parqueado exitosamente.");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null,"No fue posible parquear el carro. Intente m�s tarde");
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Ya hay un carro parqueado con esa placa.");
            }
    }
    
    /**
     * M�todo que permite buscar un carro en el parqueadero y mostrar sus datos.
     * Para buscar el carro es necesario solicitar al usuario la placa.
     * Si el carro no se encuentra se debe mostrar un mensaje indicando esto.
     */
    public void buscarCarro() {
        String placa = JOptionPane.showInputDialog("Placa del carro:");
        Carro carro = parquea.buscarCarro(placa);
        if (carro == null) 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un carro con esa placa");
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Los datos del carro son:  \n" +
                                    "Placa: "+ carro.getPlaca() + "\n"+
                                    "Marca: "+ carro.getMarca());
        }
    }

    /**
     * M�todo que permite sacar un carro del parqueadero.
     * Para sacar el carro se debe pedir la placa y luego se debe mostrar un mensaje
     * indicando si fue posible sacar el carro o si no se encontraba en el parqueadero. 
     */
    public void sacarCarro() {
        String placa = JOptionPane.showInputDialog("Placa del carro:");
        boolean pudoSacar = parquea.sacarCarro(placa);
        if (pudoSacar) 
        {
            JOptionPane.showMessageDialog(null,"El carro se retir� del parqueadero exitosamente");
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"No se encuentra parqueado un carro con esa placa");
        }
    }

    /**
     * M�todo que muestra el men� del parqueadero al usuario, para que seleccione
     * lo que desea realizar: parquear un carro, buscar un carro o sacar un carro.
     */
    public void menu() {
        
        int opcion=-1;
        do {
            // Men� con las opciones disponibles
            String valorSeleccionado = 
            JOptionPane.showInputDialog(" ---- MENU PARQUEADERO ---  \n" +
                        "1.Parquear un carro    \n" +
                        "2.Buscar un carro  \n" +
                        "3.Sacar un carro   \n" +
                        "0.Terminar     \n\n" +
                        "Opci�n seleccionada: ");
            try 
            {
                opcion = Integer.parseInt(valorSeleccionado);
                switch (opcion){
                    // Opcion 1: Parquear un carro
                    case 1: parquearCarro();
                            break;
                    
                    // Opcion 2: Buscar un carro y mostrar sus datos 
                    case 2: buscarCarro();
                            break;
                    
                    // Opcion 3: Sacar un carro del parqueadero
                    case 3: sacarCarro();
                            break;
    
                    case 0: break;
                    
                    default: JOptionPane.showMessageDialog(null,"Opci�n no disponible");    
                }
            }
            catch (NumberFormatException errorIngreso)
            {
                JOptionPane.showMessageDialog(null,"Dato ingresado incorrecto. Debe ser num�rico");   
            }
        }
        while (opcion != 0);
        JOptionPane.showMessageDialog(null," - Terminaci�n exitosa -");

    }

}  //Fin de la clase ControlParqueadero

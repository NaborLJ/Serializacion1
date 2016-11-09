
package serializacion1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author oracle
 */
public class Serializacion1 {

    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        mclase aux = new mclase("ola",-7,2.7E10);
        
        ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("/home/oracle/NetBeansProjects/Serializacion1/serial"));
        write.writeObject(aux);
        write.close();       
        
       
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("/home/oracle/NetBeansProjects/Serializacion1/serial"));
        mclase aux2 = new mclase();
        aux2=(mclase) read.readObject();
        System.out.println("Lectura: " + "string: " + aux2.getNome() + " int: " + aux2.getNumero1() + " double:" + aux2.getNumero2());
    }
    
}

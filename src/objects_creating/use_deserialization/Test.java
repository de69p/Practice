package objects_creating.use_deserialization;

import java.io.*;

/**
 * Main
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 07.06.2023.
 */
class Test {
    public static void main(String[] args) {
        ObjCreateWithDeserialization object = new ObjCreateWithDeserialization(1, "geeksforgeeks");
        String filename = "file1.ser";

        // Serialization
        try {

            // Saving of object in a file
            FileOutputStream file1 = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file1);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file1.close();

            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        ObjCreateWithDeserialization object1;

        // Deserialization
        try {

            // Reading object from a file
            FileInputStream file1 = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file1);

            // Method for deserialization of object
            object1 = (ObjCreateWithDeserialization) in.readObject();

            in.close();
            file1.close();

            System.out.println("Object has been deserialized");
            System.out.println("Employee ID = " + object1.emp_id);
            System.out.println("Employee Name = " + object1.emp_name);
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}

package com.company;

import java.io.*;

public class SerializationUtil {

    public static void serialize(Object toSerialize, String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(toSerialize);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static Object deserialize(String filename) {
        Object toDeserialize = null;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            toDeserialize = inputStream.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        return toDeserialize;
    }
}

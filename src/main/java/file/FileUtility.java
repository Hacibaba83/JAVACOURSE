/**
 * @Author:
 * @Date: 2024-08-10 21:12:33
 * @LastEditors: 
 * @LastEditTime: 2024-08-11 20:39:47
 * @FilePath: src/main/java/file/FileUtility.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package file;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtility {

    private static void writeIntoFile(String filename, String text, boolean append) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename));) { // Burada olanlar Closable olmalidir. Try bunu bilir.
            bw.write(text);
            bw.close();
        }
    }

    public static void writeIntoFile(String filename, String text) throws Exception {
        writeIntoFile(filename, text, false);
    }

    public static void appendIntoFile(String filename, String text) throws Exception {
        writeIntoFile(filename, text, true);
    }


    public static String read(String fileName) throws Exception {
        try (InputStream in = new FileInputStream(fileName); InputStreamReader r = new InputStreamReader(in); BufferedReader reader = new BufferedReader(r);) {
            String line = null;
            String result = "";

            while ((line = reader.readLine()) != null) {
                result += line + "\n";
            }
            return result;
        }
    }

    public static byte[] readBytes(String fileName) throws Exception {
        File file = new File(fileName);
        try (FileInputStream fileInputStream = new FileInputStream(file);) {
            byte[] bytesArray = new byte[(int) file.length()];
            fileInputStream.read(bytesArray);
            return bytesArray;
        }
    }

    public static void writeBytes(String filename, byte[] data) throws Exception {
        FileOutputStream fop = new FileOutputStream(filename);
        fop.write(data);
        fop.flush();
        fop.close();
        System.out.println("Done");
    }

    public static Object readFileDeserialize(String name) throws Exception {
        Object obj = null;
        FileInputStream fi = new FileInputStream(name);
        try (ObjectInputStream in = new ObjectInputStream(fi)) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }

    public static void writeObjectToFile(Serializable object, String name) throws Exception {
        try (FileOutputStream fout = new FileOutputStream(name);
             ObjectOutputStream oos = new ObjectOutputStream(fout);
        ) {
            oos.writeObject(object);
        }
    }

    public static void writeBytesNio(byte[] data, String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        Files.write(filePath, data);
    }

    public static byte[] resdBytesNio(String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        byte[] byteArray = Files.readAllBytes(filePath);
        return byteArray;
    }
    
    public static void ReadFromSite(String fromFile, String toFile)throws Exception{
        URL website = new URL(fromFile);
        ReadableByteChannel rbc = Channels.newChannel((website.openStream()));
        
        FileOutputStream fos = new FileOutputStream(toFile);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
        
    }

    public static void ReadFroSiteWithTimeOut(String fromFile, String toFile)throws Exception{
        URL url = new URL (fromFile);
        URLConnection con =url.openConnection();
        con.setConnectTimeout(10000);
        con.setReadTimeout(10000);
        InputStream in = con.getInputStream();
                
        
        ReadableByteChannel rbc = Channels.newChannel(in);

        FileOutputStream fos = new FileOutputStream(toFile);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();

    }
    
}

package util;


import com.sun.jdi.event.Event;
import model.Document;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FileUtil {
    public static void saveDocumentsToFile(List<Document> documentList,String fileName){
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileName))){
            outputStream.writeObject(documentList);
            System.out.println("Du lieu da duoc luu vao file");
        }catch (IOException e){
            System.out.println("Loi khi luu du lieu vao file: "+e.getMessage());
        }
    }
    public static List<Document> loadDocumentsFromFile(String fileName){
        try(ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileName))) {
            List<Document> documentList=(List<Document>) inputStream.readObject();
            System.out.println("Du lieu da duoc tai tu file");
            return documentList;

        } catch (IOException | ClassNotFoundException e){
            System.out.println("Loi khi tai du lieu tu file: "+e.getMessage());
            return new ArrayList<>();
        }
    }
    public static void recursiveFolderTraversal(String folderPath){
        File folder=new File(folderPath);
        File[] files=folder.listFiles();
        if (files!=null){
            for (File file:files){
                if(file.isDirectory()){
                    recursiveFolderTraversal(file.getAbsolutePath());
                }
            }
        }
    }

}

import controller.EditorController;
import model.Document;
import util.FileUtil;
import view.EditorView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Document> documentList=new ArrayList<>();
        documentList.add(new Document("Document 1"));
        documentList.add(new Document("Document 2"));
        documentList.add(new Document("Document 3"));
        EditorView editorView= new EditorView();
        EditorController editorController=new EditorController(documentList,editorView);
        editorController.addDocument(new Document("Document 4"));
        editorController.displayDocuments();
        FileUtil.saveDocumentsToFile(documentList,"data.txt");
        List<Document> loadedDocuments=FileUtil.loadDocumentsFromFile("data.txt");
        editorController=new EditorController(loadedDocuments,editorView);
        editorController.displayDocuments();
        FileUtil.recursiveFolderTraversal("E:\\HOCTAP\\KI2\\Java");
    }
}

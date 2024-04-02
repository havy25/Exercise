package controller;

import model.Document;
import view.EditorView;

import java.util.List;

public class EditorController {
    private List<Document> documentList;
    private EditorView editorView;

    public EditorController(List<Document> documentList, EditorView editorView) {
        this.documentList = documentList;
        this.editorView = editorView;
    }
    public void addDocument(Document document){
        documentList.add(document);
    }
    public void displayDocuments(){
        documentList.forEach(editorView::displayDocument);
    }
}

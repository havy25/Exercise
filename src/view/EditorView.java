package view;

import model.Document;

public class EditorView {
    public void displayDocument(Document document){
        System.out.println("Document: "+document.getContent());
    }
}

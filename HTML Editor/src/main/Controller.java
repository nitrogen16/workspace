package main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

public class Controller {
	private View view;
	private HTMLDocument document;
	private File currentFile;
	
	public HTMLDocument getDocument() {
		return document;
	}

	public Controller(View view) {
		this.view = view;
	}
	
	public void init(){
		createNewDocument();
	}
	
	public void resetDocument(){
		if(document != null){
			document.removeUndoableEditListener(view.getUndoListener());
		}
		document = (HTMLDocument) new HTMLEditorKit().createDefaultDocument();
		document.addUndoableEditListener(view.getUndoListener());
		view.update();
	}
	
	public void exit(){
		System.exit(0);
	}
	
    public void setPlainText(String text){
        resetDocument();
        StringReader stringReader = new StringReader(text);
        try {
            new HTMLEditorKit().read(stringReader, document, 0);
        } catch (IOException | BadLocationException e) {
            ExceptionHandler.log(e);
        }
    }
    
    public String getPlainText(){
    	StringWriter stringWriter = new StringWriter();
    	try {
			new HTMLEditorKit().write(stringWriter, document, 0, document.getLength());
		} catch (IOException | BadLocationException e) {
            ExceptionHandler.log(e);
        }
    	return stringWriter.toString();
    }
	
	public static void main(String[] args) {
		View view = new View();
		Controller controller = new Controller(view);
		view.setController(controller);
		view.init();
		controller.init();
	}

	public void createNewDocument() {
		view.selectHtmlTab();
		resetDocument();
		view.setTitle("HTML редактор");
		view.resetUndo();
		currentFile = null;
	}

    public void openDocument() {
        // Метод должен работать аналогично методу saveDocumentAs(), в той части, которая отвечает за выбор файла
        //Переключать представление на html вкладку
        view.selectHtmlTab();
        //Создавать новый объект для выбора файла JFileChooser
        JFileChooser jFileChooser = new JFileChooser();
        //Устанавливать ему в качестве фильтра объект HTMLFileFilter
        jFileChooser.setFileFilter(new HTMLFileFilter());
        //Показывать диалоговое окно "Save File" для выбора файла
        int n = jFileChooser.showOpenDialog(view);

        //Когда файл выбран, необходимо
        if (n == JFileChooser.APPROVE_OPTION) {
            //Установить новое значение currentFile
            currentFile = jFileChooser.getSelectedFile();
            //Сбросить документ
            resetDocument();
            //Установить имя файла в заголовок у представления
            view.setTitle(currentFile.getName());

            //Создать FileReader, используя currentFile
            try (FileReader fileReader = new FileReader(currentFile)) {
                //Вычитать данные из FileReader-а в документ document с помощью объекта класса
                new HTMLEditorKit().read(fileReader, document, 0);
                //Сбросить правки
                view.resetUndo();
            }
            catch (Exception e) {
                ExceptionHandler.log(e);
            }
        }
}

	public void saveDocument() {
		if(currentFile == null){
			saveDocumentAs();
		}else{
			view.selectHtmlTab();
			try {
				FileWriter fileWriter = new FileWriter(currentFile);
				new HTMLEditorKit().write(fileWriter, document, 0, document.getLength());
			} catch (IOException | BadLocationException e) {
				ExceptionHandler.log(e);
			}
		}
	}

	public void saveDocumentAs() {
		view.selectHtmlTab();
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.setFileFilter(new HTMLFileFilter());
		int n = jFileChooser.showSaveDialog(view);
		if(n == jFileChooser.APPROVE_OPTION){
			currentFile = jFileChooser.getSelectedFile();
			view.setTitle(currentFile.getName());
			try {
				FileWriter fileWriter = new FileWriter(currentFile);
				new HTMLEditorKit().write(fileWriter, document, 0, document.getLength());
			} catch (IOException | BadLocationException e) {
				ExceptionHandler.log(e);
			}
		}
	}
}

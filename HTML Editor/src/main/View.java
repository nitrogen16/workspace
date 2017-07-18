package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

import listeners.FrameListener;
import listeners.TabbedPaneChangeListener;
import listeners.UndoListener;

public class View extends JFrame implements ActionListener{
	private Controller controller;
	private UndoManager undoManager = new UndoManager();
	private UndoListener undoListener = new UndoListener(undoManager);
	
	public void undo(){
        try {
            undoManager.undo();
        } catch (CannotUndoException e) {
            ExceptionHandler.log(e);
        }
	}
	
	public void redo(){
        try {
            undoManager.redo();
        } catch (CannotRedoException e) {
            ExceptionHandler.log(e);
        }
	}
	
	public void resetUndo(){
		undoManager.discardAllEdits();
	}
	
	public UndoListener getUndoListener() {
		return undoListener;
	}

	public View() throws HeadlessException {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
	//это будет панель с двумя вкладками
	private JTabbedPane tabbedPane = new JTabbedPane();
	
	//это будет компонент для визуального редактирования html. Он будет размещен на первой вкладке.
	private  JTextPane htmlTextPane = new JTextPane();
	
	//это будет компонент для редактирования html в виде текста, он будет отображать код html (теги и их содержимое)
	private JEditorPane plainTextPane = new JEditorPane();  
	
	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();
		switch(command){
		case "Новый":
			controller.createNewDocument();
			break;
		case "Открыть":
			controller.openDocument();
			break;
		case "Сохранить":
			controller.saveDocument();
			break;
		case "Сохранить как...":
			controller.saveDocumentAs();
			break;
		case "Выход":
			controller.exit();
			break;
		case "О программе":
			this.showAbout();
			break;
		}
	}

	public void init(){
		//Вызывать инициализацию графического интерфейса
		initGui();
		// Добавлять слушателя событий нашего окна. В качестве подписчика создай и используй объект класса FrameListener
		FrameListener frameListener = new FrameListener(this);
		//В качестве метода для добавления подписчика используй подходящий метод из класса Window от которого наследуется и наш класс через классы JFrame и Frame.
		addWindowListener(frameListener);
		//Показывать наше окно
		setVisible(true);
	}
	
	public void exit(){
		controller.exit();
	}
	
	public void initMenuBar(){
		JMenuBar jMenuBar = new JMenuBar();
		MenuHelper.initFileMenu(this, jMenuBar);
		MenuHelper.initEditMenu(this, jMenuBar);
		MenuHelper.initStyleMenu(this, jMenuBar);
		MenuHelper.initAlignMenu(this, jMenuBar);
		MenuHelper.initColorMenu(this, jMenuBar);
		MenuHelper.initFontMenu(this, jMenuBar);
		MenuHelper.initHelpMenu(this, jMenuBar);
		getContentPane().add(jMenuBar,BorderLayout.NORTH);
	}
	
	public void initEditor(){
		htmlTextPane.setContentType("text/html");
		JScrollPane jScrollPane1 = new JScrollPane(htmlTextPane);
		tabbedPane.addTab("HTML", jScrollPane1);
		JScrollPane jScrollPane2 = new JScrollPane(plainTextPane);
		tabbedPane.addTab("Текст", jScrollPane2);
		tabbedPane.setPreferredSize(new Dimension(800, 600));
		TabbedPaneChangeListener tabbedPaneChangeListener = new TabbedPaneChangeListener(this);
		tabbedPane.addChangeListener(tabbedPaneChangeListener);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
	}

	public void initGui(){
		initMenuBar();
		initEditor();
		pack();
	}

	public void selectedTabChanged() {
		if(tabbedPane.getSelectedIndex() == 0){
			controller.setPlainText(plainTextPane.getText());
		}else if(tabbedPane.getSelectedIndex() == 1){
			plainTextPane.setText(controller.getPlainText());
		}
		resetUndo();
	}
	
	public boolean canUndo(){
		return undoManager.canUndo();
	}
	
	public boolean canRedo(){
		return undoManager.canRedo();
	}
	
	public boolean isHtmlTabSelected(){
		return tabbedPane.getSelectedIndex() == 0;
	}
	
	public void selectHtmlTab(){
		tabbedPane.setSelectedIndex(0);
		resetUndo();
	}
	
	public void update(){
		htmlTextPane.setDocument(controller.getDocument());
	}
	
	public void showAbout(){
		JOptionPane.showMessageDialog(this, "HTML Editor", "About", JOptionPane.INFORMATION_MESSAGE);
	}
}

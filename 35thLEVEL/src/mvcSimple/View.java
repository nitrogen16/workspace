package mvcSimple;

public class View {
	Controller controller = new Controller();
    public void fireEventShowData() {
        System.out.println(controller.onDataListShow());
    }
}

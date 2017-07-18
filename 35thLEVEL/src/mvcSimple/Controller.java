package mvcSimple;

import java.util.List;

public class Controller {
    private Model model = new Model();

    public List<String> onDataListShow() {
        return model.getStringDataList();
}
	
}

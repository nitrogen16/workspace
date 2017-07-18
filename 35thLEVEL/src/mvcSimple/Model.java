package mvcSimple;

import java.util.List;

public class Model {

    private Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }

}

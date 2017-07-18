package view;

import bean.User;
import controller.Controller;
import model.ModelData;

public class UsersView implements View {
	private Controller controller;

	public void setController(Controller controller) {
		this.controller = controller;
	}

	@Override
	public void refresh(ModelData modelData) {
		if(!modelData.isDisplayDeletedUserList()){
			System.out.println("All users:");	
		}else{
			System.out.println("All deleted users:");
		}
		
		for (User item : modelData.getUsers()) {
			System.out.println("\t" + item);
		}
		System.out.println("===================================================");
	}

	public void fireEventShowAllUsers() {
		controller.onShowAllUsers();
	}

	public void fireEventShowDeletedUsers() {
		controller.onShowAllDeletedUsers();
	}
	
	public void fireEventOpenUserEditForm(long id) {
		controller.onOpenUserEditForm(id);
	}


}

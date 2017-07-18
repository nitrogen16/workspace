package mainpackage;
import controller.Controller;
import model.MainModel;
import model.Model;
import view.EditUserView;
import view.UsersView;

public class Solution {

	public static void main(String[] args) {
		Model model = new MainModel();
		UsersView usersView = new UsersView();
		EditUserView editUserView = new EditUserView();
		Controller controller = new Controller();

		usersView.setController(controller);
		editUserView.setController(controller);
		
		controller.setModel(model);
		controller.setUsersView(usersView);
		controller.setEditUserView(editUserView);

		usersView.fireEventShowAllUsers();
		usersView.fireEventOpenUserEditForm(126L);
		editUserView.fireEventUserDeleted(124L);
		//editUserView.fireEventUserChanged("NEW Ivanov", 123, 1);
		//editUserView.fireEventUserChanged("NEW Petrov", 125, 1);
		editUserView.fireEventUserChanged("NEW SIDOROV", 126, 1);
		usersView.fireEventShowDeletedUsers();
	}

}

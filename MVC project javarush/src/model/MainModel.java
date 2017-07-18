package model;

import java.util.List;

import bean.User;
import service.UserService;
import service.UserServiceImpl;

public class MainModel implements Model {
	private UserService userService = new UserServiceImpl();
	private ModelData modelData = new ModelData();

	@Override
	public ModelData getModelData() {
		return modelData;
	}
	
    public List<User> getAllUsers(){
        modelData.setDisplayDeletedUserList(false);
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1, 100));
    }

	@Override
	public void loadUsers() {
		modelData.setUsers(getAllUsers());
		modelData.setDisplayDeletedUserList(false);
	}

	public void loadDeletedUsers() {
		List<User> users = userService.getAllDeletedUsers();
		modelData.setUsers(users);
		modelData.setDisplayDeletedUserList(true);
	}

	public void loadUserById(long userId) {
		User user = userService.getUsersById(userId);
		modelData.setActiveUser(user);
		getAllUsers();
	}

	@Override
	public void deleteUserById(long id) {
		User user = userService.deleteUser(id);
		modelData.setUsers(getAllUsers());
	}

	@Override
	public void changeUserData(String name, long id, int level) {
		userService.createOrUpdateUser(name, id, level);
		modelData.setUsers(getAllUsers());
	}
}

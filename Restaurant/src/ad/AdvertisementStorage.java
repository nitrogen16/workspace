package ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {

	private static AdvertisementStorage instance = new AdvertisementStorage();
	private final List<Advertisement> videos = new ArrayList<Advertisement>();
	
	private AdvertisementStorage() {
		Object someContent = new Object();
		videos.add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60));
		videos.add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60));
		videos.add(new Advertisement(someContent, "Third Video", 400, 1, 10 * 60));
	}

	public static AdvertisementStorage getInstance() {
		return instance;
	}
	
	public List<Advertisement> list(){
		return videos;
	}
	
	public void add(Advertisement advertisement){
		videos.add(advertisement);
	}
	
}
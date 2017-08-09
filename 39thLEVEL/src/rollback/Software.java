package rollback;

import java.util.*;

public class Software {
    int currentVersion;

    private Map<Integer, String> versionHistoryMap = new LinkedHashMap<>();

    public void addNewVersion(int version, String description) {
        if (version > currentVersion) {
            versionHistoryMap.put(version, description);
            currentVersion = version;
        }
    }

    public int getCurrentVersion() {
        return currentVersion;
    }

    public Map<Integer, String> getVersionHistoryMap() {
        return Collections.unmodifiableMap(versionHistoryMap);
    }


	public boolean rollback(int rollbackVersion) {
        if(!versionHistoryMap.containsKey(rollbackVersion)) {
        	return false;
        }
        Iterator<Integer> iter = versionHistoryMap.keySet().iterator();
        while(iter.hasNext()) {
        	if(iter.next() > rollbackVersion) {
        		iter.remove();
        	}
        }
        	currentVersion = rollbackVersion;
        	return true;
    }
}

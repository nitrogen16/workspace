package producer_consumer;
public class ShareItem {
    public String description;
    public int itemId;

    public ShareItem() {
        this("Test Item", 0);
    }

    public ShareItem(String description) {
        this(description, 0);
    }

    public ShareItem(int itemId) {
        this("Test Item", itemId);
    }

    public ShareItem(String description, int itemId) {
        this.description = description;
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public int getItemId() {
        return itemId;
    }

	@Override
	public String toString() {
		return "ShareItem{description=" + description + ", itemId=" + itemId + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + itemId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShareItem other = (ShareItem) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (itemId != other.itemId)
			return false;
		return true;
	}
}

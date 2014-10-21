import java.util.UUID;


public class Medical {

	private UUID mId;
	private String mTitle;
	
	public Medical(){
		mId=UUID.randomUUID();
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}

	public UUID getId() {
		return mId;
	}
}

package model.vo.complex;

public class EventTagCount {
	String tag;
	int cnt;

	public EventTagCount() {
		super();

	}

	public EventTagCount(String tag, int cnt) {
		this.tag = tag;
		this.cnt = cnt;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}

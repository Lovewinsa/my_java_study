package test.mypac;

public class PostDto {
	private int num;
	private String writer;
	private String topic;
	
	public PostDto() {}

	public PostDto(int num, String writer, String topic) {
		super();
		this.num = num;
		this.writer = writer;
		this.topic = topic;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
}

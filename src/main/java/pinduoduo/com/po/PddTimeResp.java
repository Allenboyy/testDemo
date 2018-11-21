/**
 * 
 */
package pinduoduo.com.po;

/**
 * @author sxm
 * @CreateDate:	2018年10月18日
 */
public class PddTimeResp {
	
	private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PddTimeResp [time=");
		builder.append(time);
		builder.append("]");
		return builder.toString();
	}
	
}

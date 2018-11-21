/**
 * 
 */
package pinduoduo.com.po;

/**
 * @author sxm
 * @CreateDate:	2018年9月25日
 */
public class ReqlogisticsTempate extends PddBaseParam{
	
	private String type = "pdd.goods.logistics.template.get";
	
	private Integer page;
	
	private Integer page_size;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPage_size() {
		return page_size;
	}

	public void setPage_size(Integer page_size) {
		this.page_size = page_size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("logisticsTempate [type=");
		builder.append(type);
		builder.append(", page=");
		builder.append(page);
		builder.append(", page_size=");
		builder.append(page_size);
		builder.append("]");
		return builder.toString();
	}
	
	
}

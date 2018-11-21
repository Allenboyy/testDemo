/**
 * 
 */
package pinduoduo.com.po;

/**
 * @author sxm
 * @CreateDate:	2018年9月23日
 */
public class ReqCountryParam extends PddBaseParam{
	
	private String type="pdd.goods.country.get";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReqCountryParam [type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

	
	
}

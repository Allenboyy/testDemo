/**
 * 
 */
package pinduoduo.com.po;

/**
 * @author sxm
 * @CreateDate: 2018年9月23日
 */
public class AuthorizationCats extends PddBaseParam {


	private String type="pdd.goods.authorization.cats" ;

	private Integer parent_cat_id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getParent_cat_id() {
		return parent_cat_id;
	}

	public void setParent_cat_id(Integer parent_cat_id) {
		this.parent_cat_id = parent_cat_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Goods [type=");
		builder.append(type);
		builder.append(", parent_cat_id=");
		builder.append(parent_cat_id);
		builder.append("]");
		return builder.toString();
	}

}

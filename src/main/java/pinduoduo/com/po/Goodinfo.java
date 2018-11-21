/**
 * 
 */
package pinduoduo.com.po;

import java.io.Serializable;

/**
 * @author sxm
 * @CreateDate:	2018年10月8日
 */
public class Goodinfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cat_name;

	private int cat_id;

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Goodinfo [cat_name=");
		builder.append(cat_name);
		builder.append(", cat_id=");
		builder.append(cat_id);
		builder.append("]");
		return builder.toString();
	}

}


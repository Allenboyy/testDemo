/**
 * 
 */
package pinduoduo.com.po;

import java.io.Serializable;
import java.util.List;

/**
 * @author sxm
 * @CreateDate: 2018年9月23日
 */

public class AuthCatsResp {

	private ResponseCats goods_auth_cats_get_response;

	public class ResponseCats {

		private List<Goodinfo> goods_cats_list;

		public List<Goodinfo> getGoods_cats_list() {
			return goods_cats_list;
		}

		public void setGoods_cats_list(List<Goodinfo> goods_cats_list) {
			this.goods_cats_list = goods_cats_list;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ResponseGoods [goods_cats_list=");
			builder.append(goods_cats_list);
			builder.append("]");
			return builder.toString();
		}

		
	}
	
	
	public ResponseCats getGoods_auth_cats_get_response() {
		return goods_auth_cats_get_response;
	}


	public void setGoods_auth_cats_get_response(ResponseCats goods_auth_cats_get_response) {
		this.goods_auth_cats_get_response = goods_auth_cats_get_response;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthCatsResp [goods_auth_cats_get_response=");
		builder.append(goods_auth_cats_get_response);
		builder.append("]");
		return builder.toString();
	}
	
}

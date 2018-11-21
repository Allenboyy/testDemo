/**
 * 
 */
package pinduoduo.com.po;

import java.util.List;

/**
 * @author sxm
 * @CreateDate: 2018年9月23日
 */

public class CountryResp {

	private CountryList goods_country_get_response;

	public class CountryList {

		private List<CountryInfo> country_list;

		public  class CountryInfo {

			private Integer country_id;

			private String country_name;

			public Integer getCountry_id() {
				return country_id;
			}

			public void setCountry_id(Integer country_id) {
				this.country_id = country_id;
			}

			public String getCountry_name() {
				return country_name;
			}

			public void setCountry_name(String country_name) {
				this.country_name = country_name;
			}

			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("CountryInfo [country_id=");
				builder.append(country_id);
				builder.append(", country_name=");
				builder.append(country_name);
				builder.append("]");
				return builder.toString();
			}

		}

		public List<CountryInfo> getCountry_list() {
			return country_list;
		}

		public void setCountry_list(List<CountryInfo> country_list) {
			this.country_list = country_list;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("CountryList [country_list=");
			builder.append(country_list);
			builder.append("]");
			return builder.toString();
		}

		
	}

	public CountryList getGoods_country_get_response() {
		return goods_country_get_response;
	}

	public void setGoods_country_get_response(CountryList goods_country_get_response) {
		this.goods_country_get_response = goods_country_get_response;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryResp [goods_country_get_response=");
		builder.append(goods_country_get_response);
		builder.append("]");
		return builder.toString();
	}
	
}

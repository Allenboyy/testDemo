/**
 * 
 */
package pinduoduo.com.po;

import java.util.List;

/**
 * @author sxm
 * @CreateDate:	2018年10月18日
 */
public class PddAddressResp {
	
	private List <Address> address_list ;
	
	public class Address{
		
		private  Integer is_enabled;
		private  Integer national_code;
		private  Integer region_type;
		private  String  region_name;
		private  Integer parent_idv;
		private  Integer id;
		public Integer getIs_enabled() {
			return is_enabled;
		}
		public void setIs_enabled(Integer is_enabled) {
			this.is_enabled = is_enabled;
		}
		public Integer getNational_code() {
			return national_code;
		}
		public void setNational_code(Integer national_code) {
			this.national_code = national_code;
		}
		public Integer getRegion_type() {
			return region_type;
		}
		public void setRegion_type(Integer region_type) {
			this.region_type = region_type;
		}
		public String getRegion_name() {
			return region_name;
		}
		public void setRegion_name(String region_name) {
			this.region_name = region_name;
		}
		public Integer getParent_idv() {
			return parent_idv;
		}
		public void setParent_idv(Integer parent_idv) {
			this.parent_idv = parent_idv;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Address [is_enabled=");
			builder.append(is_enabled);
			builder.append(", national_code=");
			builder.append(national_code);
			builder.append(", region_type=");
			builder.append(region_type);
			builder.append(", region_name=");
			builder.append(region_name);
			builder.append(", parent_idv=");
			builder.append(parent_idv);
			builder.append(", id=");
			builder.append(id);
			builder.append("]");
			return builder.toString();
		}
		
	}

	public List<Address> getAddress_list() {
		return address_list;
	}

	public void setAddress_list(List<Address> address_list) {
		this.address_list = address_list;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PddAddressResp [address_list=");
		builder.append(address_list);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}

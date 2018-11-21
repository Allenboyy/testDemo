/**
 * 
 */
package pinduoduo.com.po;

import java.util.List;

/**
 * @author sxm
 * @CreateDate:	2018年9月25日
 */
public class RespLogisticsTempate {
	
	private  LoisticsTempate  goods_logistics_template_get_response;
	
	public class LoisticsTempate{
		
		private Integer total_count;
		private List<Logstic> logistics_template_list;
		public Integer getTotal_count() {
			return total_count;
		}
		public void setTotal_count(Integer total_count) {
			this.total_count = total_count;
		}
		public List<Logstic> getLogistics_template_list() {
			return logistics_template_list;
		}
		public void setLogistics_template_list(List<Logstic> logistics_template_list) {
			this.logistics_template_list = logistics_template_list;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("LoisticsTempate [total_count=");
			builder.append(total_count);
			builder.append("]");
			return builder.toString();
		}
		public class Logstic{
			private Integer template_id;
			private String template_name;
			private Integer cost_type;
			private Boolean free_deliver_house;
			private List<CostTemplate> cost_template_list;
			private List<FreeDeliverHouse> free_deliver_house_area_list;
			private List<FreeProvice> free_province_list;
			
			public class CostTemplate{
				 private List<CostProvince> cost_province_list;
				 private Integer first_standard;
				 private Integer first_cost;
				 private Integer add_standard;
				 private Integer add_cost;
				 private Boolean is_have_free_min_count;
				 private Integer have_free_min_count;
				 private Boolean is_have_free_min_amount;
				 private Integer have_free_min_amount;
				public List<CostProvince> getCost_province_list() {
					return cost_province_list;
				}
				public void setCost_province_list(List<CostProvince> cost_province_list) {
					this.cost_province_list = cost_province_list;
				}
				public Integer getFirst_standard() {
					return first_standard;
				}
				public void setFirst_standard(Integer first_standard) {
					this.first_standard = first_standard;
				}
				public Integer getFirst_cost() {
					return first_cost;
				}
				public void setFirst_cost(Integer first_cost) {
					this.first_cost = first_cost;
				}
				public Integer getAdd_standard() {
					return add_standard;
				}
				public void setAdd_standard(Integer add_standard) {
					this.add_standard = add_standard;
				}
				public Integer getAdd_cost() {
					return add_cost;
				}
				public void setAdd_cost(Integer add_cost) {
					this.add_cost = add_cost;
				}
				public Boolean getIs_have_free_min_count() {
					return is_have_free_min_count;
				}
				public void setIs_have_free_min_count(Boolean is_have_free_min_count) {
					this.is_have_free_min_count = is_have_free_min_count;
				}
				public Integer getHave_free_min_count() {
					return have_free_min_count;
				}
				public void setHave_free_min_count(Integer have_free_min_count) {
					this.have_free_min_count = have_free_min_count;
				}
				public Boolean getIs_have_free_min_amount() {
					return is_have_free_min_amount;
				}
				public void setIs_have_free_min_amount(Boolean is_have_free_min_amount) {
					this.is_have_free_min_amount = is_have_free_min_amount;
				}
				public Integer getHave_free_min_amount() {
					return have_free_min_amount;
				}
				public void setHave_free_min_amount(Integer have_free_min_amount) {
					this.have_free_min_amount = have_free_min_amount;
				}
				@Override
				public String toString() {
					StringBuilder builder = new StringBuilder();
					builder.append("CostTemplate [first_standard=");
					builder.append(first_standard);
					builder.append(", first_cost=");
					builder.append(first_cost);
					builder.append(", add_standard=");
					builder.append(add_standard);
					builder.append(", add_cost=");
					builder.append(add_cost);
					builder.append(", is_have_free_min_count=");
					builder.append(is_have_free_min_count);
					builder.append(", have_free_min_count=");
					builder.append(have_free_min_count);
					builder.append(", is_have_free_min_amount=");
					builder.append(is_have_free_min_amount);
					builder.append(", have_free_min_amount=");
					builder.append(have_free_min_amount);
					builder.append("]");
					return builder.toString();
				}
				public class CostProvince{
					private String province;
					private Integer province_id;
					public String getProvince() {
						return province;
					}
					public void setProvince(String province) {
						this.province = province;
					}
					public Integer getProvince_id() {
						return province_id;
					}
					public void setProvince_id(Integer province_id) {
						this.province_id = province_id;
					}
					@Override
					public String toString() {
						StringBuilder builder = new StringBuilder();
						builder.append("CostProvince [province=");
						builder.append(province);
						builder.append(", province_id=");
						builder.append(province_id);
						builder.append("]");
						return builder.toString();
					}
					
				} 
				 
			}
			
			public class FreeDeliverHouse{
				private String town_id;
				private String city_id;
				private String province_id;
				private String province;
				private String city;
				private String town;
				public String getTown_id() {
					return town_id;
				}
				public void setTown_id(String town_id) {
					this.town_id = town_id;
				}
				public String getCity_id() {
					return city_id;
				}
				public void setCity_id(String city_id) {
					this.city_id = city_id;
				}
				public String getProvince_id() {
					return province_id;
				}
				public void setProvince_id(String province_id) {
					this.province_id = province_id;
				}
				public String getProvince() {
					return province;
				}
				public void setProvince(String province) {
					this.province = province;
				}
				public String getCity() {
					return city;
				}
				public void setCity(String city) {
					this.city = city;
				}
				public String getTown() {
					return town;
				}
				public void setTown(String town) {
					this.town = town;
				}
				@Override
				public String toString() {
					StringBuilder builder = new StringBuilder();
					builder.append("FreeDeliverHouse [town_id=");
					builder.append(town_id);
					builder.append(", city_id=");
					builder.append(city_id);
					builder.append(", province_id=");
					builder.append(province_id);
					builder.append(", province=");
					builder.append(province);
					builder.append(", city=");
					builder.append(city);
					builder.append(", town=");
					builder.append(town);
					builder.append("]");
					return builder.toString();
				}
				
			}
			
			public class FreeProvice{
				private String province;

				public String getProvince() {
					return province;
				}

				public void setProvince(String province) {
					this.province = province;
				}

				@Override
				public String toString() {
					StringBuilder builder = new StringBuilder();
					builder.append("FreeProvice [province=");
					builder.append(province);
					builder.append("]");
					return builder.toString();
				}
				
			}
			
			public Integer getTemplate_id() {
				return template_id;
			}
			public void setTemplate_id(Integer template_id) {
				this.template_id = template_id;
			}
			public String getTemplate_name() {
				return template_name;
			}
			public void setTemplate_name(String template_name) {
				this.template_name = template_name;
			}
			public Integer getCost_type() {
				return cost_type;
			}
			public void setCost_type(Integer cost_type) {
				this.cost_type = cost_type;
			}
			public Boolean getFree_deliver_house() {
				return free_deliver_house;
			}
			public void setFree_deliver_house(Boolean free_deliver_house) {
				this.free_deliver_house = free_deliver_house;
			}
			public List<CostTemplate> getCost_template_list() {
				return cost_template_list;
			}
			public void setCost_template_list(List<CostTemplate> cost_template_list) {
				this.cost_template_list = cost_template_list;
			}
			public List<FreeDeliverHouse> getFree_deliver_house_area_list() {
				return free_deliver_house_area_list;
			}
			public void setFree_deliver_house_area_list(List<FreeDeliverHouse> free_deliver_house_area_list) {
				this.free_deliver_house_area_list = free_deliver_house_area_list;
			}
			public List<FreeProvice> getFree_province_list() {
				return free_province_list;
			}
			public void setFree_province_list(List<FreeProvice> free_province_list) {
				this.free_province_list = free_province_list;
			}
			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("Logstic [template_id=");
				builder.append(template_id);
				builder.append(", template_name=");
				builder.append(template_name);
				builder.append(", cost_type=");
				builder.append(cost_type);
				builder.append(", free_deliver_house=");
				builder.append(free_deliver_house);
				builder.append("]");
				return builder.toString();
			}
			
			
		}
		
	}

	public LoisticsTempate getGoods_logistics_template_get_response() {
		return goods_logistics_template_get_response;
	}

	public void setGoods_logistics_template_get_response(LoisticsTempate goods_logistics_template_get_response) {
		this.goods_logistics_template_get_response = goods_logistics_template_get_response;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RespLogisticsTempate [goods_logistics_template_get_response=");
		builder.append(goods_logistics_template_get_response);
		builder.append("]");
		return builder.toString();
	}
	
	
}

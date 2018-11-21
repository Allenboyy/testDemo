/**
 * 
 */
package pinduoduo.com.po;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;

/**
 * @author sxm
 * @CreateDate: 2018年9月23日
 */
public class PddBaseParam implements Serializable {

	private static final long serialVersionUID = 1L;

	private String type;

	private String client_id = "d45c63d375eb4a96bccf54daec4ea2a6";
	                            
							      
	private String access_token= "de6a7f8d388142a79c169f5058b0935767a47a78";

	private Long timestamp = System.currentTimeMillis() ;

	private String data_type;

	private String version;

	private String sign;
	
	
	@JsonIgnore
	public Map<String, Object> getParams() {
		Map<String, Object> result = new HashMap<>();
		List<Field> fields = Lists.newArrayList(this.getClass().getSuperclass().getDeclaredFields());
		fields.addAll(Lists.newArrayList(this.getClass().getDeclaredFields()));
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				Object obj = field.get(this);
				if (obj != null) {
					result.put(field.getName(), obj);
				}
			} catch (IllegalAccessException e) {
				throw new IllegalStateException(e);
			} finally {
				field.setAccessible(false);
			}
		}
		return result;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("baseGoods [type=");
		builder.append(type);
		builder.append(", client_id=");
		builder.append(client_id);
		builder.append(", access_token=");
		builder.append(access_token);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", data_type=");
		builder.append(data_type);
		builder.append(", version=");
		builder.append(version);
		builder.append(", sign=");
		builder.append(sign);
		builder.append("]");
		return builder.toString();
	}
	

}

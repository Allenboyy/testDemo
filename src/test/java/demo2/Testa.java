/**
 * 
 */
package demo2;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.poi.poifs.filesystem.EntryUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;

import net.sf.json.JSONObject;

/**
 * @author sxm
 * @CreateDate:	2018年9月23日
 */
public class Testa {
	
	@Test
	public void testDemo() {
		String uid="12345678";
		String title = "test";
		String content = "test a content";
		String rst = sendSms(uid,title,content);
		System.out.println(rst);
		if(rst.indexOf("失败")<0 ){
			System.out.println("发送sms成功");
		}else {
			System.out.println("发送失败");
		}
	}

	/**
	 * @param uid
	 * @param title
	 * @param content
	 * @return
	 */
	private String sendSms(String uid, String title, String content) {

		String smsUrl = "http://192.168.0.1/service/sendsms";
		String resultStr="";
		
		try {
			List<NameValuePair>nameValuePairs = new ArrayList<>();
			JSONObject obj = new JSONObject();
			obj.put("uid", uid);
			obj.put("title", title);
			obj.put("content", content);
			
			nameValuePairs.add(new BasicNameValuePair("msg", getStringFromJson(obj)));
			
			HttpPost httppost = new HttpPost(smsUrl);
			httppost.addHeader("Content-type","appliction/x-www-form-urlencoded");
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			
			HttpClient httpClient=new  DefaultHttpClient();
			HttpResponse respone = httpClient.execute(httppost);
			
			if(respone.getStatusLine().getStatusCode()==200) {
				String conResult = EntityUtils.toString(respone.getEntity());
				JSONObject jso = new JSONObject();
				jso = jso.fromObject(conResult);
				String result = jso.getString("result");
				String code = jso.getString("code");
				if(result.equals("1")) {
					resultStr += "发送成功";
				}else {
					resultStr += "发送失败"+code;
				}
				
			}else {
				String err = respone.getStatusLine().getStatusCode()+" ";
				resultStr += "发送失败"+err;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return resultStr;
	}

	/**
	 * @param obj
	 * @return
	 */
	private String getStringFromJson(JSONObject obj) {
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for (Object key: obj.keySet()) {
			sb.append("\""+key+"\":\""+obj.get(key)+"\",");
		}
		String ss = sb.toString().substring(0,sb.toString().length()-1)+"}";
		return ss;
	}
	
	
	
	@Test
	public void testb() {
		Map<String, String> map  = new HashMap<String,String>();
		map.put("aa", "孙悟空");
		map.put("bb", "猪八戒");
		map.put("cc", "沙和尚");
		map.put("dd", "白龙马");
		
	/*	Gson g = new Gson();
		String json = g.toJson(map);
		System.out.println(json);*/
		
		JSONObject jobj = JSONObject.fromObject(map);
		System.out.println(jobj);
		System.out.println("=============");
		System.out.println(jobj.toString());
		
		System.out.println("jsonArray==============");
		Object aobj =  JSONArray.toJSON(map);
		System.out.println(aobj);
		System.out.println(aobj.toString());
		System.out.println("---------------------");
		Map<String,String> map2 = (Map) JSONObject.toBean(jobj, Map.class);
		System.out.println(map2);
		for (Entry<String, String> m : map2.entrySet()) {
			System.out.println(m);
		}
	}
	
}

/**
 * 
 */
package pdd.util;

import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * @author sxm
 * @CreateDate: 2018年9月23日
 */
public class HttpUtil {

	public static String postJson(String url, String jsonContent) {

		String content = null;

		try {
			HttpPost httppost = new HttpPost(url);
			httppost.addHeader("Content-type", "appliction/x-www-form-urlencoded");
			httppost.setEntity(new StringEntity(jsonContent, "UTF-8"));

			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse respone = httpClient.execute(httppost);

			if (respone.getStatusLine().getStatusCode() == 200) {
				content = EntityUtils.toString(respone.getEntity());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return content;
	}

	public static String TestPostJson(String url, String jsonContent) {
		String content = null;

		try {
			HttpPost httpPost = new HttpPost(url);
			httpPost.addHeader("Content-type", "appliction/x-www-form-urlencoded");
			httpPost.setEntity(new StringEntity(jsonContent, "UTF-8"));

			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse response = httpClient.execute(httpPost);
			if (response.getStatusLine().getStatusCode() == 200) {
				content = EntityUtils.toString(response.getEntity());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return content;

	}
}

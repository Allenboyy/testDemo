/**
 * 
 */
package pdd.test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

import pdd.util.HttpUtil;
import pinduoduo.com.po.AuthCatsResp;
import pinduoduo.com.po.AuthorizationCats;
import pinduoduo.com.po.CountryResp;
import pinduoduo.com.po.Goodinfo;
import pinduoduo.com.po.PddAddressResp;
import pinduoduo.com.po.PddBaseParam;
import pinduoduo.com.po.PddTimeResp;
import pinduoduo.com.po.ReqCountryParam;
import pinduoduo.com.po.ReqlogisticsTempate;
import pinduoduo.com.po.RespLogisticsTempate;
import pinduoduo.com.po.RespLogisticsTempate.LoisticsTempate.Logstic;
import pinduoduo.com.po.RespLogisticsTempate.LoisticsTempate.Logstic.CostTemplate;
import pinduoduo.com.po.RespLogisticsTempate.LoisticsTempate.Logstic.CostTemplate.CostProvince;
import pinduoduo.com.po.RespLogisticsTempate.LoisticsTempate.Logstic.FreeDeliverHouse;
import pinduoduo.com.po.RespLogisticsTempate.LoisticsTempate.Logstic.FreeProvice;

/**
 * @author sxm
 * @CreateDate:	2018年9月23日
 */
public class PinDuoDuoTest {
	            
	String url="http://gw-api.pinduoduo.com/api/router";
                               	
	private String clientSecret="76b40cc2655d1b862874e850b24c39d1b628c07d";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PinDuoDuoTest.class);
	
	@Test
	public void testDome() {
		
		AuthorizationCats authorizationCats = new AuthorizationCats() ;
		Map<String, Object> params =  authorizationCats.getParams();
		
		LOGGER.debug("请求",authorizationCats);
        params.put("client_id", authorizationCats.getClient_id());
        params.put("access_token", authorizationCats.getAccess_token());
        String sign = getSign(params, clientSecret);
        params.put("sign", sign);
		String jsonString = JSONObject.toJSONString(params);
//		System.out.println(jsonString);
		
		
		
		String json = HttpUtil.postJson(url, jsonString);
		System.err.println(json);
		
		AuthCatsResp resp = JSONObject.parseObject(json, AuthCatsResp.class);
		System.out.println(resp);
		List<Goodinfo> list = resp.getGoods_auth_cats_get_response().getGoods_cats_list();
		
	/*	for (Goodinfo goodinfo : list) {
			System.out.println(goodinfo);
		}*/
			
	}
	
	@Test
	public void testCountry() {
		ReqCountryParam req = new ReqCountryParam();
		Map<String,Object> params  = req.getParams();
		params.put("client_id", req.getClient_id());
		params.put("access_token", req.getAccess_token());
		String sign = getSign(params,clientSecret);
		params.put("sign", sign);
		String jsonObject = JSONObject.toJSONString(params);
		
//		System.out.println(jsonObject);
		
		String json = HttpUtil.TestPostJson(url,jsonObject);
//		String json = HttpUtil.postJson(url,jsonObject);
		System.out.println(json);
		
		CountryResp resp = JSONObject.parseObject(json, CountryResp.class);
		System.out.println(resp);
		List<pinduoduo.com.po.CountryResp.CountryList.CountryInfo> country_list = resp.getGoods_country_get_response().getCountry_list();
		for (pinduoduo.com.po.CountryResp.CountryList.CountryInfo countryInfo : country_list) {
			System.out.println(countryInfo);
		}
	}
	
	
	@Test
	public void testLogisticsTempate() {
		ReqlogisticsTempate req = new ReqlogisticsTempate();
		Map <String,Object>map  = req.getParams();
		map.put("client_id", req.getClient_id());
		map.put("access_token", req.getAccess_token());
		String sign = getSign(map,clientSecret);
		map.put("sign", sign);
		
		String jsonObject = JSONObject.toJSONString(map);
//		System.out.println(jsonObject);
		
		String json = HttpUtil.postJson(url, jsonObject);
		System.out.println(json);
		RespLogisticsTempate object = JSONObject.parseObject(json, RespLogisticsTempate.class);
//		System.out.println(object);
		List<Logstic> logistics_template_list = object.getGoods_logistics_template_get_response().getLogistics_template_list();
		System.out.println(object.getGoods_logistics_template_get_response().getTotal_count());
		for (Logstic logstic : logistics_template_list) {
			List<CostTemplate> cost_template_list = logstic.getCost_template_list();
			for (CostTemplate costTemplate : cost_template_list) {
				List<CostProvince> cost_province_list = costTemplate.getCost_province_list();
				for (CostProvince costProvince : cost_province_list) {
					System.out.println("    "+costProvince);
				}
				System.out.println("  "+costTemplate.getAdd_cost());
				System.out.println("  "+costTemplate.getAdd_standard());
				System.out.println("  "+costTemplate.getFirst_cost());
				System.out.println("  "+costTemplate.getFirst_standard());
				System.out.println("  "+costTemplate.getHave_free_min_amount());
				System.out.println("  "+costTemplate.getHave_free_min_count());
				System.out.println("  "+costTemplate.getIs_have_free_min_amount());
				System.out.println("  "+costTemplate.getIs_have_free_min_count());
				
				
			}
			List<FreeDeliverHouse> free_deliver_house_area_list = logstic.getFree_deliver_house_area_list();
			for (FreeDeliverHouse freeDeliverHouse : free_deliver_house_area_list) {
				System.out.println("  "+freeDeliverHouse.getCity());
				System.out.println("  "+freeDeliverHouse.getCity_id());
				System.out.println("  "+freeDeliverHouse.getProvince());
				System.out.println("  "+freeDeliverHouse.getProvince_id());
				System.out.println("  "+freeDeliverHouse.getTown());
				System.out.println("  "+freeDeliverHouse.getTown_id());
			}
			List<FreeProvice> free_province_list = logstic.getFree_province_list();
			for (FreeProvice freeProvice : free_province_list) {
				
				System.out.println("  "+freeProvice);
			}
			System.out.println(logstic.getTemplate_name());
			System.out.println(logstic.getCost_type());
			System.out.println(logstic.getFree_deliver_house());
			System.out.println(logstic.getTemplate_id());
					
		}
			
	}
	
	@Test
	public void getTime() {
		
		String url="https://gw-api.pinduoduo.com/api/router";
		PddBaseParam baseParam = new PddBaseParam();
		baseParam.setType("pdd.time.get");
		Map<String,Object>params = baseParam.getParams();
		params.put("client", baseParam.getClient_id());
		params.put("access_token", baseParam.getAccess_token());
		String sign = getSign(params,clientSecret);
		params.put("sign", sign);
		String jsonString = JSONObject.toJSONString(params);
		String json = HttpUtil.postJson(url, jsonString);
		PddTimeResp timeResp = JSONObject.parseObject(json, PddTimeResp.class);
		System.out.println(timeResp);
	}
	
	@Test
	public void getAddress() {
		
		PddBaseParam baseParam = new PddBaseParam();
		baseParam.setType("pdd.logistics.address.get");
		Map<String, Object>params = baseParam.getParams();
		params.put("client", baseParam.getClient_id());
		params.put("access_token", baseParam.getAccess_token());
		String sign = getSign(params,clientSecret);
		params.put("sign", sign);
		String jsonString = JSONObject.toJSONString(params);
		String json = HttpUtil.postJson(url, jsonString);
		PddAddressResp addResp = JSONObject.parseObject(json, PddAddressResp.class);
		System.out.println(addResp);
	}
	
	
	private String getSign(Map<String, Object> params, String clientSecret) {
        Set<String> SortedParames = new TreeSet<>(params.keySet());
        StringBuilder result = new StringBuilder();
        for (String key : SortedParames) {
            String value = params.get(key).toString();
            result.append(key).append(value);
        }
        return DigestUtils.md5Hex(clientSecret + result + clientSecret).toUpperCase();
    }
}

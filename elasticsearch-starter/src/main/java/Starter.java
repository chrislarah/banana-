import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.elasticsearch.action.ActionListener;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import model.Restaurant;

public class Starter {

	
	//https://www.baeldung.com/spring-data-elasticsearch-tutorial
	public static void main(String[] args) throws IOException {
		RestHighLevelClient client = new RestHighLevelClient(
				RestClient.builder(new HttpHost("localhost", 9200, "http"), new HttpHost("localhost", 9201, "http")));

		Restaurant restaurant = new Restaurant();
		restaurant.setName("Les trois brasseurs");
		restaurant.setRank(4);
		
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(restaurant);
		System.err.println("Trying to save: " + json);
		IndexRequest indexRequest = new IndexRequest("restaurant", "doc", "1").source(json,XContentType.JSON);

		ActionListener<IndexResponse> listener = new ActionListener<IndexResponse>() {
			@Override
			public void onResponse(IndexResponse indexResponse) {
				System.err.println(indexResponse);
			}

			@Override
			public void onFailure(Exception e) {
				System.err.println(e);
			}
		};
		
		// Il faudra dire ici qu'on ne va pas s'amuser à tout ré-écrire et qu'on va pas réinveter la roue
		// Remember, nous voulons écrire une application permettant d'ajouter / supprimer des restaurant et 
		client.indexAsync(indexRequest, RequestOptions.DEFAULT, listener);

	}

}

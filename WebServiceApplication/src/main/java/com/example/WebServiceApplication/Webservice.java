package com.example.WebServiceApplication;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class Webservice {
//	public String getExternalData() {
//       // String url = "https://jsonplaceholder.typicode.com/posts/1";
//
////        RestTemplate restTemplate = new RestTemplate();
////        String response = restTemplate.getForObject(url, String.class);
////
////       return response;
//        //WebClient webClient = WebClient.create("https://jsonplaceholder.typicode.com");
//		WebClient webClient = WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
//
//        String response = webClient
//                .get()
//                .uri("/posts")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//        return response;
//    }
  
//	public List<String> getExternalData(){
//		WebClient webClient = WebClient.create("https://jsonplaceholder.typicode.com");
//		//WebClient webClient = WebClient.builder().baseUrl("https://jsonplaceholder.typicode.com").build();
//
//        Flux<String> response = webClient
//                .get()
//                .uri("/posts")
//                .retrieve()
//                .bodyToFlux(String.class);
//        return response.collectList().block();
//		
//	}
	
	public List<Map<String, Object>> getPosts() {

	    RestTemplate restTemplate = new RestTemplate();

	    List<Map<String, Object>> response = restTemplate.getForObject(
	            "https://jsonplaceholder.typicode.com/posts",
	            List.class); // directly map to List

	    return response;
	}
	
}


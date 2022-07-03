package com.flipkart.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.flipkart.dummyEntities.Book;
import com.flipkart.model.FlipkartEntity;
import com.flipkart.repository.FlipkartRepository;

@Service
public class FlipkartServiceImpl implements FlipkartService {

	@Autowired
	FlipkartRepository flipkartRepository;

	@Override
	public FlipkartEntity addFlipkartEntity(FlipkartEntity flipkartEntity) {
		return flipkartRepository.save(flipkartEntity);
	}

	@Override
	public FlipkartEntity addBookToFkEntity(FlipkartEntity flipkartEntity) {
		Integer id = flipkartEntity.getId();
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<Book> entity=new HttpEntity<>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Book> book = restTemplate.exchange("http://localhost:7088/getbook/"+id, HttpMethod.GET,entity,Book.class);
		FlipkartEntity entity2 = flipkartRepository.findById(id).get();
		entity2.setBook(book.getBody());
		return flipkartRepository.save(entity2);
	}


}

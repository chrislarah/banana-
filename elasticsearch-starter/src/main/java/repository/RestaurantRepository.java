package repository;

import java.util.Optional;

import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import model.Restaurant;

public class RestaurantRepository implements ElasticsearchRepository<Restaurant, String> {

	@Override
	public Iterable<Restaurant> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Restaurant> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Restaurant> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Restaurant> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Restaurant> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Restaurant> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Restaurant> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Restaurant entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Restaurant> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Restaurant> S index(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Restaurant> search(QueryBuilder query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Restaurant> search(QueryBuilder query, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Restaurant> search(SearchQuery searchQuery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Restaurant> searchSimilar(Restaurant entity, String[] fields, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<Restaurant> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}

}

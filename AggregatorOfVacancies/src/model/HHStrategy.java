package model;

import java.util.Collections;
import java.util.List;

import vo.Vacancy;

public class HHStrategy implements Strategy {
	
	private final String URL_FORMAT = "http://hh.ru/search/vacancy?text=java+%s&page=%d";

	@Override
	public List<Vacancy> getVacancies(String searchString) {
		return  Collections.emptyList();
	}
}

package model;

import java.util.List;

import vo.Vacancy;

public class Provider {
	private Strategy strategy;

	public Provider(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public List<Vacancy> getJavaVacancies(String searchString){
		return strategy.getVacancies(searchString);
	}
	
}

package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Provider;
import vo.Vacancy;

public class Controller {

	private Provider[] providers;

	public Controller(Provider... providers) {
		if (providers == null || providers.length == 0) {
			throw new IllegalArgumentException();
		}
		this.providers = providers;
	}

	@Override
	public String toString() {
		return "Controller{" + "providers=" + Arrays.toString(providers) + '}';
	}

	public void scan() {
		try {
			List<Vacancy> vacancies = new ArrayList<>();
			for (Provider p : providers) {
				vacancies.addAll(p.getJavaVacancies("Kiev"));
			}
			System.out.print(vacancies.size());
		} catch (NullPointerException e) {
		}
	}

}

package model;

import java.util.List;
import vo.Vacancy;

public interface Strategy {
	List<Vacancy> getVacancies(String searchString);
}

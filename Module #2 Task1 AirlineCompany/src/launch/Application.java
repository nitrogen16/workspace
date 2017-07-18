package launch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import planes.AirlineCompany;
import planes.Airliner;
import planes.FreightAircraft;
import planes.Plane;
public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		////////////������������ �����
		Airliner airliner1 = new Airliner("Boeing 747", 1500, 250);
		Airliner airliner2 = new Airliner("Boeing 737", 1350, 180);
		Airliner airliner3 = new Airliner("Suhoi SuperJet 200", 1800, 150);
		Airliner airliner4 = new Airliner("Airbus 300", 5000, 350);
		Airliner airliner5 = new Airliner("IL 96", 3500, 270);
		Airliner airliner6 = new Airliner("YAK 40", 1300, 100);
		Airliner airliner7 = new Airliner("Boeing 757", 2500, 315);

		////////////�������� �����
		FreightAircraft freightAircraft1 = new FreightAircraft("Antey 400", 3500, 40.5);
		FreightAircraft freightAircraft2 = new FreightAircraft("Boeing 800", 3300, 30.5);
		FreightAircraft freightAircraft3 = new FreightAircraft("AN 24", 2000, 15.2);
		FreightAircraft freightAircraft4 = new FreightAircraft("IL 86", 2500, 23.8);
		FreightAircraft freightAircraft5 = new FreightAircraft("IL 86M", 3000, 27.1);
		FreightAircraft freightAircraft6 = new FreightAircraft("Jet 123", 2500, 10);
		FreightAircraft freightAircraft7 = new FreightAircraft("SU 135", 1200, 8);
		
		List<Plane> parkPlanes= new ArrayList<Plane>();
		parkPlanes.add(airliner1);
		parkPlanes.add(airliner2);
		parkPlanes.add(airliner3);
		parkPlanes.add(airliner4);
		parkPlanes.add(airliner5);
		parkPlanes.add(airliner6);
		parkPlanes.add(airliner7);
		parkPlanes.add(freightAircraft1);
		parkPlanes.add(freightAircraft2);
		parkPlanes.add(freightAircraft3);
		parkPlanes.add(freightAircraft4);
		parkPlanes.add(freightAircraft5);
		parkPlanes.add(freightAircraft6);
		parkPlanes.add(freightAircraft7);
		
		AirlineCompany company = new AirlineCompany("United Airs", parkPlanes);
		System.out.println(company);
		company.getPlanes();

///////////// ����� �������� � ����������� ���������� �����
		
		int sumCapacity = 0;
		double sumFreight = 0;
		
		for(Plane item : parkPlanes){
			
			if(item instanceof Airliner){ 
				int capacity = ((Airliner) item).getAirlinerCapacity();
				sumCapacity += capacity;
			}
			else if(item instanceof FreightAircraft){
				double freight = ((FreightAircraft) item).getPlaneFreight();
				sumFreight += freight;
			}
			else{
				System.out.println("Exception");
			}
		}
		System.out.println("����� ����������� ��������� ���������� " + sumCapacity + " ����������.");
		System.out.println("����� ���������������� ��������� ���������� " + sumFreight + " ����.");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		
//////////////////////////////////////////////////////////////////////////////		
		System.out.println("�������� ��������, ��������������� �� ��������� ����� �����:");
				Collections.sort(parkPlanes, new Comparator <Plane>(){
					@Override
					public int compare(Plane p1, Plane p2) {
						if(p1.getFreightAircraftFlyingRange() > p2.getFreightAircraftFlyingRange()){
							return 1;
						}
						else if(p1.getFreightAircraftFlyingRange() < p2.getFreightAircraftFlyingRange()){
							return -1;
						}
						return 0;
					}
				});
				for(int i = 0; i < parkPlanes.size(); i++){
				System.out.println(parkPlanes.get(i));
		}
				System.out.println("-----------------------------------------------------------------------------------------------------------");
	}
}

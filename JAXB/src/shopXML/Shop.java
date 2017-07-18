package shopXML;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(name = "shop") @XmlRootElement
public class Shop {
	public Goods goods;
	public int count;
	public double profit;
	public String[] secretData;
	static class Goods{
		public List names = new ArrayList();
	}
}

package commentInsideXML;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "anExample")
@XmlRootElement
public class Example {
    public String[] needCDATA = new String[]{"need CDATA because of < and >", ""};
}
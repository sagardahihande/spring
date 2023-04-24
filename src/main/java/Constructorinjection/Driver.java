package Constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {
		Resource resoure = new ClassPathResource("Mobile1.xml");
		BeanFactory bf = new XmlBeanFactory(resoure);
		 Mobile mobile1   =   (Mobile) bf.getBean("mobile1");
		 System.out.println(mobile1);
	}

}

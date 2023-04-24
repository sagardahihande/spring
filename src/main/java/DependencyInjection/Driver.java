package DependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Mobile2.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		Mobile2 mobile2 =  (Mobile2) bf.getBean("mobile2");
		System.out.println(mobile2);
	}

}

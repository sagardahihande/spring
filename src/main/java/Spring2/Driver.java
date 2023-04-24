package Spring2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Mobile.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		Mobile mobile = (Mobile) bf.getBean("mobile");
		System.out.println(mobile);
	}

}

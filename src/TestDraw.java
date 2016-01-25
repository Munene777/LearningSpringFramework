import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class TestDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Triangle tri= new Triangle();
//@SuppressWarnings("deprecation")
		//BeanFactory facto= new XmlBeanFactory(new FileSystemResource("blue.xml"));
		//AbstractApplicationContext appc= new ClassPathXmlApplicationContext("blue.xml");
		ApplicationContext appc= new ClassPathXmlApplicationContext("blue.xml");
		//appc.registerShutdownHook();
		Shape shape= (Shape)appc.getBean("circle");
		//System.out.println(appc.getMessage("hi",null, "Default Hi sms",null));
		
		
    shape.draw();
	}

}

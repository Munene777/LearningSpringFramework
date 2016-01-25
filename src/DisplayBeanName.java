import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class DisplayBeanName implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String Bname)
			throws BeansException {
		System.out.println("Called after initializing bean "+ Bname);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String Bname)
			throws BeansException {
		System.out.println("Called before initializing bean "+ Bname);
		return bean;
	}

}

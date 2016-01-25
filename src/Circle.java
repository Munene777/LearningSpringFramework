import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
//import org.springframework.beans.factory.annotation.Required;

/*@Component used to declare a class as a bean
@Service specifies the bean as a service class
@Repository a data bean 
@Controller when dealing with mvc pattern*/
public class Circle  implements Shape,ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	private Point centre;
	private MessageSource txt;
	public MessageSource getTxt() {
		return txt;
	}
	@Autowired
	public void setTxt(MessageSource txt) {
		this.txt = txt;
	}
	public Point getCentre() {
		return centre;
	}
	//@Required
	//@Autowired
	//@Qualifier("CR")
	@Resource(name="p1")
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a  circle");
		//System.out.println("Centre point is : (" + centre.getX() +" ,"+ centre.getY()+")");
		System.out.println(this.txt.getMessage("points",new Object[] {centre.getX(),centre.getY()},"Sorry an error occured",null));
		DrawEvent myEvent= new DrawEvent(this);
		publisher.publishEvent(myEvent);
	}
	@PostConstruct
	public void initCircle(){
		System.out.println("Init method for bean Circle");
	}
	@PreDestroy
	public void killCircle(){
		System.out.println("Last method for bean Circle");
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher= publisher;
		
	}
}

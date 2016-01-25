
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,Shape, BeanNameAware,InitializingBean,DisposableBean{
	/*private String type;

	private int height;
	
	public int getHeight() {
		return height;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	public Triangle(int height){
		this.height=height;
	}
	public Triangle(String type){
		this.type=type;
	}
	
	public Triangle(String type, int height){
		this.type=type;
		this.height=height;
		
	}
*/

	/*private Point p1;
	private Point p2;
	private Point p3;
	
	
	public Point getP1() {
		return p1;
	}


	public void setP1(Point p1) {
		this.p1 = p1;
	}


	public Point getP2() {
		return p2;
	}


	public void setP2(Point p2) {
		this.p2 = p2;
	}


	public Point getP3() {
		return p3;
	}


	public void setP3(Point p3) {
		this.p3 = p3;
	}*/


	private List<Point> points;
	private ApplicationContext context = null;
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw(){
	for( Point point: points){
			System.out.println("( Point : "+ point.getX() + ","+ point.getY()+")");
		}
		/*System.out.println("("+ getP1().getX() + ","+ getP1().getY()+")");
		System.out.println("("+ getP2().getX() + ","+ getP2().getY()+")");
		System.out.println("("+ getP3().getX() + ","+ getP3().getY()+")");*/
		//System.out.println(getType() +"  Triangle Drawn of height " + getHeight());
	}

	@Override
	public void setBeanName(String beanName) {
	 System.out.println("The bean name is : " + beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context= context;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing my Bean.");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying my Bean.");
		
	}
	public void create(){
		System.out.println("Creating bean using xml config, my Bean.");
	}
	public void clean(){
		System.out.println("Destroying bean using xml config, my Bean.");
	}
}

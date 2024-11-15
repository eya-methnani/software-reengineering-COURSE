package aspects;


import java.util.logging.Logger;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class log1Aspect {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Pointcut("call (* *.*.rretirer(..))")
	public void log() {	}
	
	
	@Before("log()")
	public void avant() {
		logger.info("Avant (aspect avec annotations)....");		
	}	
	@After("log()")
	public void après() {
		logger.info("Après (aspect avec annotations).....");
	}
	
	
	
	@Pointcut("call (* *.*.ddeposer(..))")
	public void log2() {	}
	
	
	@Before("log2()")
	public void avant2() {
		logger.info("Avant (aspect avec annotations)....");		
	}	
	@After("log2()")
	public void après2() {
		logger.info("Après (aspect avec annotations).....");
	}


}

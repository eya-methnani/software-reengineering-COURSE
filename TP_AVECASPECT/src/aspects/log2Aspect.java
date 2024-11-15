package aspects;


import java.util.logging.Logger;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


import metier.CompteBancaire;


@Aspect
public class log2Aspect {
	
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Pointcut("call (* *.*.rretirer(..)) && target(c)")
	public void log(CompteBancaire c) { }
	
	
	@Before("log(c)")
	public void avant(CompteBancaire c) {
		logger.info("Avant (aspect avec annotations target)...." + c.getSolde());
	}	
	@After("log(c)")
	public void après(CompteBancaire c) {
		logger.info("Après (aspect avec annotations target)....."+c.getSolde());
		
	}
	
	
	
	
	@Pointcut("call (* *.*.ddeposer(..)) && target(c)")
	public void log2(CompteBancaire c) { }
	
	
	@Before("log2(c)")
	public void avant2(CompteBancaire c) {
		logger.info("Avant (aspect avec annotations target)...." + c.getSolde());
	}	
	@After("log2(c)")
	public void après2(CompteBancaire c) {
		logger.info("Après (aspect avec annotations target)....."+c.getSolde());
		
	}
}

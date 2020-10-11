package home.train.sevice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class lifeCycleDemoBean implements InitializingBean, DisposableBean , BeanNameAware ,
        BeanFactoryAware , ApplicationContextAware {

    public lifeCycleDemoBean() {
        System.out.println("###from Constructor lifeCycleDemoBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(color.ANSI_BLUE+"from after Properties set method in initializingBean ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(color.ANSI_GREEN+"from destroy method from DisposableBean interface");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(color.ANSI_PURPLE+"from setBeanName method from BeanNameAware interface");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(color.ANSI_RED+"from setBeanFactory method from BeanFactoryAware ");
        System.out.println(color.ANSI_RED+beanFactory.toString());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(color.ANSI_YELLOW+"from setApplicationContext method from ApplicationContextAware");
        System.out.println(color.ANSI_YELLOW+applicationContext.getDisplayName());
    }
    @PostConstruct
    public void postConstructor(){
        System.out.println(color.ANSI_CYAN+"from method whit @postConstruct");
    }
    @PreDestroy
    public void preDestroyed(){
        System.out.println(color.ANSI_CYAN+"from preDestroyed method");
    }

    public void beforeInit(){
        System.out.println(color.ANSI_RESET+"@from beforeInit called by bean post process");
    }
    public void afterInit(){
        System.out.println(color.ANSI_RESET+"@from after init method called by Bean post process");
    }


}

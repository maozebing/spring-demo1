package rhea.demo.utility;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 描述 ：
 *
 * @author : mzb
 * @version : v1.00
 * @CreationDate : 16-5-30 下午5:13
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class SpringContextUtil {
    private static ApplicationContext context;
    private static SpringContextUtil springContextUtil;
    public SpringContextUtil(){
        context=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
    }
    public static SpringContextUtil getInstance(){
        if (springContextUtil==null){
            springContextUtil=new SpringContextUtil();
        }
        return springContextUtil;
    }
    private static ApplicationContext getContext(){
        return context;
    }
    /**
     * 获取bean对象
     * @param beanId bean的id
     * @return bean对象
     */
    public static Object getBean(String beanId){
        if (beanId == null) {
            throw new NullPointerException();
        }
        return getContext().getBean(beanId);
    }
}

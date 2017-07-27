package rhea.demo.initialization;

import rhea.demo.utility.SpringContextUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

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
public class ContextLoader implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        SpringContextUtil.getInstance();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

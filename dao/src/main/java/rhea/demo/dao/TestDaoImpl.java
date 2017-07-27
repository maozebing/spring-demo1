package rhea.demo.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import rhea.demo.dbentity.TestEntity;

import java.util.List;

/**
 * 描述 ：
 *
 * @author : maozebing
 * @version : v1.00
 * @CreationDate : 2017/5/3 9:40
 * @Description :
 * @update : 修改人，修改时间，修改内容
 * @see :[相关类/方法]
 */
public class TestDaoImpl extends HibernateDaoSupport implements TestDao {
    public TestEntity getTest(long id) {
        return this.getHibernateTemplate().get(TestEntity.class, id);
    }

    public List<TestEntity> listTest() {
        return this.getHibernateTemplate().loadAll(TestEntity.class);
    }
}

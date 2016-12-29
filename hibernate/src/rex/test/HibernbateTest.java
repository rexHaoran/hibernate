package rex.test;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

public class HibernbateTest {

	@Test
	public void testSessionFactory() {
		//
		// Configuration cfg = new Configuration();
		// cfg.configure();// 从classpath路径下加载hibernate.cfg.xml
		//
		// ServiceRegistryBuilder srb = new ServiceRegistryBuilder();
		// srb.applySettings(cfg.getProperties());
		//
		// ServiceRegistry serviceRegistry = srb.buildServiceRegistry();
		// SessionFactory sessionFactory =
		// cfg.buildSessionFactory(serviceRegistry);

		// ①加载配置
		Configuration cfg = new Configuration();
		cfg.configure(); // 从classpath路径下加载hibernate.cfg.xml

		ServiceRegistryBuilder srb = new ServiceRegistryBuilder();
		srb.applySettings(cfg.getProperties());

		ServiceRegistry serviceRegistry = srb.buildServiceRegistry();
		// ②创建SessionFactory
		SessionFactory sessionFactory = cfg
				.buildSessionFactory(serviceRegistry);

	}

}

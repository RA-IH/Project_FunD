package cat.FunD.config;

// root-context.xml과 같은 역할

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
//@ComponentScan(basePackages= {"cat.FunD.service"})
//@MapperScan(basePackages= {"cat.FunD.mapper"})
public class RootConfig {

	 // spring의 context 안에 hikariConfig와 dataSource
	 // dataSource는 hikariConfig에 의존적?
	  @Bean
	  public DataSource dataSource() {
	    HikariConfig hikariConfig = new HikariConfig();
//	    hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//	    hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");

	    hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
	    hikariConfig.setJdbcUrl("jdbc:log4jdbc:oracle:thin:@localhost:1521:XE");

	    hikariConfig.setUsername("FunD");
	    hikariConfig.setPassword("1234");

	    HikariDataSource dataSource = new HikariDataSource(hikariConfig);

	    return dataSource;
	  }
	  
	  @Bean
	  public SqlSessionFactory sqlSessionFactory() throws Exception {
	    SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
	    sqlSessionFactory.setDataSource(dataSource());
	    return (SqlSessionFactory) sqlSessionFactory.getObject();
	  }
	  

}
package uy.com.cvaucher.services.config;




import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
/*
import javax.sql.DataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
*/
/**
 * @author Raul Hernandez
 *
 */
@Configuration
@MapperScan(value="uy.com.cvaucher.services.mappers")
public class Config 
{

}

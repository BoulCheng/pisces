package so.dian.pisces.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.*;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "so.dian.pisces.dao.mapper", sqlSessionTemplateRef = "mysqlSessionTemplate")
public class MysqlDataSourceConfiguration {

    @Bean(name = "mysqlDatasource")
    @ConfigurationProperties(prefix = "druid.datasource.mysql")
    @Primary
    public DataSource mysqlDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "mysqlSessionFactory")
    public SqlSessionFactory mysqlSqlSessionFactory(@Qualifier("mysqlDatasource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:so/dian/pisces/dao/mapper/*.xml"));
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setUseGeneratedKeys(true);
        configuration.setUseColumnLabel(true);
        configuration.setMapUnderscoreToCamelCase(true);
        bean.setConfiguration(configuration);
        bean.setVfs(SpringBootVFS.class);
        TypeHandler[] typeHandlers = new TypeHandler[]{new InstantTypeHandler(), new LocalDateTimeTypeHandler(),
                new LocalDateTypeHandler(), new LocalTimeTypeHandler(), new OffsetDateTimeTypeHandler(),
                new OffsetTimeTypeHandler(), new ZonedDateTimeTypeHandler()};
        bean.setTypeHandlers(typeHandlers);
        return bean.getObject();
    }

    @Bean(name = "mysqlTransaction")
    @Primary
    public DataSourceTransactionManager mysqlTransactionManager(@Qualifier("mysqlDatasource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "mysqlSessionTemplate")
    @Primary
    public SqlSessionTemplate mysqlSqlSessionTemplate(
            @Qualifier("mysqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}

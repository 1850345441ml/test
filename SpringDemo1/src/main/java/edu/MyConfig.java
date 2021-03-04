package edu;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;



//@Configuration
@ComponentScan
@Import(DataSourceConfig.class)
public class MyConfig {

}

package tk.mybatis.simple.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import tk.mybatis.simple.model.Country;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class CountryMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try{
            Reader reader  = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();

        }catch (IOException ignore){
            ignore.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){


        SqlSession sqlsession = sqlSessionFactory.openSession();
        try{
            List<Country> countryList = sqlsession.selectList("selectAll");
            printCountryList(countryList);
        }finally {
            sqlsession.close();
        }

    }

    private void printCountryList(List<Country> countryList){
        for (Country cy :countryList) {
            System.out.printf("%-4d%4s%4s\n",
            cy.getId(),cy.getCountryname(),cy.getCountrycode()
            );
        }
    }
}

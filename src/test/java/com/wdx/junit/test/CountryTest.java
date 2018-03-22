package com.wdx.junit.test;

import com.wdx.junit.model.Country;
import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by wdx on 2018/3/22.
 */

@RunWith(Feeder.class)
public class CountryTest {


    @Test
    public void testCounrty(@Source("test.csv") Country country){
        System.out.println(country.getName());
    }
}

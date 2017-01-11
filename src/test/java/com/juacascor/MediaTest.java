package com.juacascor;

import org.junit.Assert;
import org.junit.Test;

public class MediaTest {
    
    @Test
    public void testMedia1(){
     
         Assert.assertTrue(5.0 == App.media(5.0,5.0));
    }
    
    @Test
    public void testMedia2(){
     
         Assert.assertTrue(2.0 == App.media(2.0,2.0));
    }
    
    @Test
    public void testMedia3(){
     
         Assert.assertTrue(3.0 == App.media(3.0,3.0));
    }
    
    @Test
    public void testMedia4(){
     
         Assert.assertTrue(7.5 == App.media(5.0,10.0));
    }
    
    @Test
    public void testMedia5(){
     
         Assert.assertTrue(5.0 == App.media(0.0,10.0));
    }

    
    @Test(expected = AssertionError.class)
    public void testMediaNegativo(){
        
    	 Assert.assertTrue(0.0 == App.media(5.0,5.0));
    }

    
}
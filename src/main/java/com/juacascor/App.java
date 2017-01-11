package com.juacascor;

import org.uncommons.maths.statistics.DataSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

  public static Double media(Double d1, Double d2) 
  {
	 DataSet ds = new DataSet();
	 ds.addValue(d1);
	 ds.addValue(d2);
     return ds.getArithmeticMean();
     }

}
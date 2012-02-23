// fasts3 is an Amazon S3 up/download and sync tool.
// Zoltan Olah (zol@me.com) released under the MIT license on Feb 23 2012.
package com.zol.fasts3;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

/**
 * fasts3
 *
 */
public class App 
{
  static Logger logger = Logger.getLogger(App.class);
      
  public static void main( String[] args )
  {
    // init logging (to console)
    BasicConfigurator.configure();
    
    logger.info("fasts3 starting...");
  }
}

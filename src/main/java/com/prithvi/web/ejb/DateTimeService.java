package com.prithvi.ejb;

import javax.ejb.Stateless;
import java.util.Date;

/**
 * @author <ul>
 *         <li>Prithviraj Diddahalli Ramegowda (prithvi@prithvid.com)</li>
 *         </ul>       
 */

@Stateless
public class DateTimeService {
    public String getCurrentDateTime() {
        return "Current Date & Time is : " + new Date().toString();
    }
}
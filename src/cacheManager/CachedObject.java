package cacheManager;

import java.util.Calendar;
import java.util.Date;

public class CachedObject implements Cacheable{
	private Date dateOfExpiration = null;
	
	private Object identifier = null;
	
	
	private Object object = null; 	// real value that will be cached and shared
	
	public CachedObject(Object obj, Object id, int minuteToLive){
			object = obj;
			identifier = id;
			
			// if minuteToLive is 0 means Object will live forever
			if(minuteToLive!=0){
				dateOfExpiration=new Date();
				Calendar cal = Calendar.getInstance();
				cal.setTime(dateOfExpiration);
				cal.add(Calendar.MINUTE, minuteToLive);		// adding minuteToLive to Current Time
				
				dateOfExpiration = cal.getTime();
				System.out.println("date of expiration is: "+dateOfExpiration);
			}
	}
	
	@Override
	public boolean isExpired() {
		if(dateOfExpiration!=null){
			if(dateOfExpiration.before(new Date())){
				System.out.println("CachedResultSet.isExpired:  Expired from Cache! EXPIRE TIME: "
			+dateOfExpiration.toString()+" CURRENT TIME: "+new Date().toString());
				return true;
			}else{
					System.out.println("CachedResultSet.isExpired:  Expired not from Cache!");
					return false;
			}
		}
		return false;		// means it will live forever
	}
	
	@Override
	public Object getIdentifier() {
		return identifier;
	}
	
	
}

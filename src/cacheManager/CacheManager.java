package cacheManager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CacheManager {
	private static HashMap<Object, Object> cachedMap = new HashMap<>();
	
	static {
		System.out.println("Static block called....................");
		try {
			Thread threadCleanerUpper = new Thread(new Runnable() {
				final int milliSecondsSleepTime = 5000;

				public void run() {
					try {
						while (true) {
							System.out.println("threadCleanerUpper is sweeping for Expired Objects.........");

							Set keySet = cachedMap.keySet();

							Iterator itr = keySet.iterator();

							while (itr.hasNext()) {
								Object key = itr.next();
								Cacheable cachedObj = (Cacheable) cachedMap.get(key);

								// check if cached obj has expired
								if (cachedObj.isExpired()) {
									System.out.println("Cached Obj: " + cachedObj.getIdentifier() + "is expired");
									cachedMap.remove(key);
								}
							}
							Thread.sleep(milliSecondsSleepTime);
						}
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
			});
			threadCleanerUpper.setPriority(Thread.MIN_PRIORITY);
			threadCleanerUpper.start();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}	// end of static block
	
	public static void putCache(Cacheable obj){
		System.out.println("put Object in cache");
		cachedMap.put(obj.getIdentifier(), obj);
	}
	
	public static Cacheable getCache(Object id){
		System.out.println("get from cache");
		Cacheable cachedObj =(Cacheable) cachedMap.get(id);
		
		if(cachedObj==null){
			return null;
		}
		
		if(cachedObj.isExpired()){
			System.out.println("object has been expired");
			cachedMap.remove(id);
			return null;
		}else{
			return cachedObj;
		}
	}
}

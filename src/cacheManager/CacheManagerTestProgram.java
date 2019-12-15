package cacheManager;

public class CacheManagerTestProgram {

	public static void main(String[] args) {
		CacheManagerTestProgram test1 = new CacheManagerTestProgram();
		
		String val = new String("ABCDEFGHIJKLMNOP");
		
		CachedObject cachedObj = new CachedObject(val, new Long(1234), 1);
		
		CacheManager.putCache(cachedObj);
		
		Cacheable retObj = CacheManager.getCache( new Long(1234));
		
		if(retObj==null){
			System.out.println("Object Not Found!!!!!!");
		}else{
			System.out.println("Object Found");
			retObj.toString();
		}
	}

}

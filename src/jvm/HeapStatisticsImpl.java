package jvm;

public class HeapStatisticsImpl {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("max memory: "+rt.maxMemory());
		System.out.println("free memory: "+rt.freeMemory());
		System.out.println("total memory: "+rt.totalMemory());
		System.out.println("memory consumed: "+(rt.totalMemory()-rt.freeMemory()));
	}

}

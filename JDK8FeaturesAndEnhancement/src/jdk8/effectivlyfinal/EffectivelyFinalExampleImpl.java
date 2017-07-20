package jdk8.effectivlyfinal;

public class EffectivelyFinalExampleImpl {
	
	public void effectivelyFinalExampleImpl() {
		
		String greets = "EffectiveFinalExample";
		
		//greets="hey effectivelyFinalExample () you can’t use me now";
		
		new EffectivelyFinalExample() {
			@Override
			public void effectivelyFinalExample() {
				System.out.println(greets);
			}
		}.effectivelyFinalExample();
	}
}
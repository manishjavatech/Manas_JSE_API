package jdk8.lambdaexpressions.parameterization_ambiguity;

@FunctionalInterface
interface LongCalculator {
	long calculate(long x, long y);
}
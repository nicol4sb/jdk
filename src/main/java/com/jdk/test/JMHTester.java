package com.jdk.test;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

public class JMHTester {

	@Benchmark
	@Fork(value = 1, warmups = 2)
	@BenchmarkMode(Mode.Throughput)
	public static void init() {
		// Do nothing
	}

	public static void main(String[] args) throws Exception {
		org.openjdk.jmh.Main.main(args);
	}

}

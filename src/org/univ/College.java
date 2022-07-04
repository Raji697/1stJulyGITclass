package org.univ;

public class College extends University {

	@Override
	public void ug() {
		System.out.println("ug: Bsc");
	}

	@Override
	public void pg() {
		System.out.println("pg: MBA");
	}

	public static void main(String[] args) {
		College c = new College();
		c.pg();
		c.ug();

	}
}

package com.dingtao.leetcode;
public class Test {
	public static void main(String[] args){
		Point p1 = new Point(84,250);
		Point p2 = new Point(0,0);
		Point p3 = new Point(1,0);
		Point p4 = new Point(0,-70);
		Point p5 = new Point(0,-70);
		Point p6 = new Point(1,-1);
		Point p7 = new Point(21,10);
		Point p8 = new Point(42,90);
		Point p9 = new Point(-42,-230);
		Point[] points = {p1,p2,p3,p4,p5,p6,p7,p8,p9};
		Solution s = new Solution();
		int maxCount = s.maxPoints(points);
		System.out.println(maxCount);
		
		
	}
}

package com.dingtao.leetcode;
 class Point {
      int x;
      int y;
      Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
 }

 public class Solution {
		public int maxPoints(Point[] points) {
	        //首先穷举所有的两点集合,然后再次遍历其他店，查询其中是否有在一条line上的
	        //至于怎么判断，可以使用斜率来判断是否斜率相同
	        if(points.length==0){
	            return 0;
	        }else if(points.length ==1){
	            return 1;
	        }else if(points.length ==2){
	            return 2;
	        }
	        int maxCount =2;
	        for(int i=0;i<points.length;i++){
	            for(int j=i+1;j<points.length;j++){
	                //除去i和j这两个点
	                int count =2;
	                for(int k=0;k<points.length;k++){
	                    if(k == i || k ==j){
	                        continue;
	                    }else if(this.isSamePoint(points[i],points[j])){
	                        count++;
	                    }else{
	                        if(this.isSameLine(points[i], points[j], points[k])){
	                    		count++;
	                    	}
	                    }
	                }
	                if(count>maxCount){
	                    maxCount=count;
	                }
	            }
			}
			return maxCount;
	    }

		public  boolean isSameLine(Point p1, Point p2, Point p3) {
			// 但是要考虑特殊情况，即垂直情况，垂直时，斜率为无穷大，因为分母此时为0

	        //如果其中有2个点是相同的话，那就肯定是一条线
	        
	        if(isSamePoint(p1,p2) || isSamePoint(p2,p3) ||isSamePoint(p1,p3)){
	            return true;
	        }
	        
			if (p1.x == p2.x && p2.x == p3.x) {
				return true;
			}else if(p1.x-p2.x ==0 || p1.x-p3.x ==0){
				return false;
			}
			else if ((p1.y - p2.y) / (p1.x - p2.x) == (p1.y - p3.y)
					/ (p1.x - p3.x)) {
				return true;
			} else {
				return false;
			}

		}
	    
	    public boolean isSamePoint(Point p1,Point p2){
	        if(p1.x ==p2.x && p1.y == p2.y){
	            return true;
	        }else{
	            return false;
	        }
	    }
	}
package com.dingtao.leetcode;
 class Point {
      int x;
      int y;
      Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
 }

 public class Solution {
		public int maxPoints(Point[] points) {
	        //����������е����㼯��,Ȼ���ٴα��������꣬��ѯ�����Ƿ�����һ��line�ϵ�
	        //������ô�жϣ�����ʹ��б�����ж��Ƿ�б����ͬ
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
	                //��ȥi��j��������
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
			// ����Ҫ�����������������ֱ�������ֱʱ��б��Ϊ�������Ϊ��ĸ��ʱΪ0

	        //���������2��������ͬ�Ļ����ǾͿ϶���һ����
	        
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
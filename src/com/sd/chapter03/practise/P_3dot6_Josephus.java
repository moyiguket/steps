package com.sd.chapter03.practise;

/**
 * Josephus problem:N个人编号从1到N，围成一个圈。从1号开始传递土。经过M此传递后，拿着土豆的人被清除。圆圈缩紧，下一个人拿起土豆继续游戏。
 * 最后剩下的人取胜。例如M=1,N=5,清楚顺序：2,4,1,5。
 * @author da.sun
 *
 */
public class P_3dot6_Josephus {
	
	public static void main(String[] args) {
		ArraySolution array_solution = new ArraySolution(5, 1);
		array_solution.start();
	}
	
	/**
	 * 数组实现
	 * @author da.sun
	 *
	 */
	private static class ArraySolution{
		
		/**
		 * 总共有多少人
		 */
		int people_count;
		
		/**
		 * 传递多少次
		 */
		int step;
		
		/**
		 * 传递到什么地方。
		 */
		int current;

		int[] circle;
		
		int size;
		
		/**
		 * 移除标记。
		 */
		static int remove_flag = -1;
		
		public ArraySolution(int people_count, int step) {
			super();
			this.people_count = people_count;
			this.step = step;
			size = people_count;
			circle = new int[size];
		}
		
		private void fill_people(){
			for(int i = 0 ; i < circle.length;i++){
				circle[i] = i+1;
			}
		}
		
		/**
		 * 开始游戏
		 */
		public void start(){
			this.current = 0;
			fill_people();
			while(this.circle.length > 1){
				int next = getNext(this.circle, this.current, this.step);
				int remove = remove(this.circle, next);
				System.out.println("remove :"+remove);
				this.current = next;
			}
			
		}
		
		
		public int getNext(int[] circle,int current,int step){
			int next = current+step;
			if(next >= circle.length){
				next = next-circle.length;
			}
			return next;
		}
		
		public int remove(int[] circle,int index){
			if(index > circle.length-1){
				throw new IllegalAccessError("index out of range");
			}
			int remove = circle[index];
			circle[index] = remove_flag;
			this.size--;
			reSize(this.circle, this.size);
			return remove;
		}
		
		public void reSize(int[] circle,int size){
			int[] result = new int[size];
			int index = 0;
			for(int i = 0 ; i < circle.length ; i ++){
				if(circle[i] != remove_flag){
					result[index] = circle[i];
					index++;
				}
			}
			this.circle = result;
		}
	}
	
	
	private static class ListSolution{
		
		
		
		
	}
	
	
}

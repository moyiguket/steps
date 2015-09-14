package com.sd.chapter03.practise;

/**
 * Josephus problem:N���˱�Ŵ�1��N��Χ��һ��Ȧ����1�ſ�ʼ������������M�˴��ݺ������������˱������ԲȦ��������һ������������������Ϸ��
 * ���ʣ�µ���ȡʤ������M=1,N=5,���˳��2,4,1,5��
 * @author da.sun
 *
 */
public class P_3dot6_Josephus {
	
	public static void main(String[] args) {
		ArraySolution array_solution = new ArraySolution(5, 1);
		array_solution.start();
	}
	
	/**
	 * ����ʵ��
	 * @author da.sun
	 *
	 */
	private static class ArraySolution{
		
		/**
		 * �ܹ��ж�����
		 */
		int people_count;
		
		/**
		 * ���ݶ��ٴ�
		 */
		int step;
		
		/**
		 * ���ݵ�ʲô�ط���
		 */
		int current;

		int[] circle;
		
		int size;
		
		/**
		 * �Ƴ���ǡ�
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
		 * ��ʼ��Ϸ
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

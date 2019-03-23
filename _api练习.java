package test;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _api练习 {
	public static void main(String[] args) {
		//stack
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(1);
		Integer pop = stack.pop();
		System.out.println(pop);
		System.out.println(stack.isEmpty());
		
		//queue
		Queue<Integer>queue=new LinkedList<Integer>();
		queue.add(1);
		Integer poll = queue.poll();
		System.out.println(poll);
		System.out.println(queue.isEmpty());
		
		//Calendar
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/**月份从0开始，星期从周日开始（值为1）**/
		
		//BigInteger
		BigInteger a = new BigInteger("111111111");
//		BigInteger b = new BigInteger("222222222222222222222222222222222222");
		a = a.pow(134);
//		a = a.multiply(b);
		System.out.println(a);
		
		//DecimalFormat
		DecimalFormat decimalFormat = new DecimalFormat("#.0");
		String format = decimalFormat.format(125.29);//四舍五入
		System.out.println(format);
		
		
	}
}

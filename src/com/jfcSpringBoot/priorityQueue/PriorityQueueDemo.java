package com.jfcSpringBoot.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> priorityQueue=new PriorityQueue<>();
		priorityQueue.add("anil");
		priorityQueue.add("sunil");
		//priorityQueue.add(null);
		
		PriorityQueue<Integer> priorityQueueI=new PriorityQueue<>();
		System.out.println(priorityQueue);
		
		priorityQueue.poll();
		
		System.out.println(priorityQueue);
		
		priorityQueueI.add(30);
		priorityQueueI.add(40);
		priorityQueueI.add(22);
		System.out.println(priorityQueueI);
		priorityQueueI.poll();
		System.out.println(priorityQueueI);
		priorityQueueI.poll();
		System.out.println(priorityQueueI);
		
		
		

	}

}

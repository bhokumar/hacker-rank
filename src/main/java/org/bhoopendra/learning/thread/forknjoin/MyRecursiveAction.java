package org.bhoopendra.learning.thread.forknjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {
	private static final long serialVersionUID = -2148223408778350600L;
	
	private long workLoad = 0;
	
	public MyRecursiveAction(final long workLoad) {
		this.workLoad = workLoad;
	}

	@Override
	protected void compute() {
		if(this.workLoad>16){
			System.out.println("Splitting workLoad : " + this.workLoad);
			List<MyRecursiveAction> subTasks = new ArrayList<>();
			subTasks.addAll(createSubTasks());
		}
	}
	
	private List<MyRecursiveAction> createSubTasks(){
		List<MyRecursiveAction> subtasks = new ArrayList<>();
		MyRecursiveAction subTask1 = new MyRecursiveAction(this.workLoad/2);
		MyRecursiveAction subTask2 = new MyRecursiveAction(this.workLoad/2);
		subtasks.add(subTask1);
		subtasks.add(subTask2);
		return subtasks;
	}

}

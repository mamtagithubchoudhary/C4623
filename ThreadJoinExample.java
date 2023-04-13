package corejava1;

public class ThreadJoinExample {

	 public static void main(String[] args) throws InterruptedException {
	  System.out.println("main thread started execution. Current thread name : " + Thread.currentThread().getName());
	  PrintNumbers t1 = new PrintNumbers(1, 10);
	  PrintNumbers t2 = new PrintNumbers(11, 20);
	  PrintNumbers t3 = new PrintNumbers(21, 30);

	  t1.start();
	  t1.join();

	  t2.start();
	  t2.join();

	  t3.start();
	  t3.join();

	  System.out.println("All threads completed excution.");
	  System.out.println(Thread.currentThread().getName() + " complete execution");
	 }

	}

	class PrintNumbers extends Thread {

	 private int start;
	 private int end;

	 public PrintNumbers(int start, int end) {
	  this.start = start;
	  this.end = end;
	 }

	 @Override
	 public void run() {
	  for (int i = start; i <= end; i++) {
	   System.out.println(Thread.currentThread().getName() + " - " + i);
	  }
	  System.out.println(Thread.currentThread().getName() + " thread execution completed.");
	 }
	
}
	
//	Output:-
//	main thread started execution. Current thread name : main
//	Thread-0 - 1
//	Thread-0 - 2
//	Thread-0 - 3
//	Thread-0 - 4
//	Thread-0 - 5
//	Thread-0 - 6
//	Thread-0 - 7
//	Thread-0 - 8
//	Thread-0 - 9
//	Thread-0 - 10
//	Thread-0 thread execution completed.
//	Thread-1 - 11
//	Thread-1 - 12
//	Thread-1 - 13
//	Thread-1 - 14
//	Thread-1 - 15
//	Thread-1 - 16
//	Thread-1 - 17
//	Thread-1 - 18
//	Thread-1 - 19
//	Thread-1 - 20
//	Thread-1 thread execution completed.
//	Thread-2 - 21
//	Thread-2 - 22
//	Thread-2 - 23
//	Thread-2 - 24
//	Thread-2 - 25
//	Thread-2 - 26
//	Thread-2 - 27
//	Thread-2 - 28
//	Thread-2 - 29
//	Thread-2 - 30
//	Thread-2 thread execution completed.
//	All threads completed excution.
//	main complete execution


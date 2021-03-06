package Thread;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); // 스레드 상태 얻기
			System.out.println("타겟 스레드 상태 : " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();		// 객체 생성 상태이면 실행 대기 상태로 만듦
			}
			
			if(state == Thread.State.TERMINATED) {
				break;						// 종료 상태일 경우 while문을 빠져나옴
			}
			
			try {
				//0.5초간 일시 정지
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
			
		}
	}
}


public class Animation extends MyFrame {
	public void run() {
//		練習問題5-1
//		int y = 100;
//		int x = 30;
//		while(y >= 40) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			y -= 5;
//			sleep(0.1);
//		}
//		while(x <=170) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x += 5;
//			sleep(0.1);
//		}
		
//		練習問題5-2
//		int y = 50;
//		int x = 30;
//		while(y <= 270) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x+=7;
//			y+=5;
//			sleep(0.1);
//		}
//		while(x >= 30) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x -=5;
//			sleep(0.1);
//		}
//		while(y >= 50) {
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x+=7;
//			y-=5;
//			sleep(0.1);
//		}
		
//		練習問題5-3
		int y = 100;
		int x = 30;
		for(int i = 0; i < 3; i++) {
			while(x <= 170) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x+= 5;
				sleep(0.1);
			}
			while(x >= 30) {
				clear();
				setColor(0,128,0);
				fillRect(x,y,10,100);
				x-= 5;
				sleep(0.1);
			}
		}
		
		
		
	}

}

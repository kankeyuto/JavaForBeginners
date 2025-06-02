
public class RectIf extends MyFrame {
	public void run() {
//		setColor(0,128,0);
//		int x = 30;
//		int i;
//		for(i= 0; i < 9; i++) {
//			
//			if(i == 4) {
//				fillRect(x,100,10,100);
//			}
//			else {
//				fillRect(x,80,10,100);
//			}
//			x+=20;
//		}
		
//		練習問題4-1
//		setColor(0,128,0);
//		int x = 30;
//		for(int i= 0; i < 9; i++) {
//			System.out.println(x);
//			fillRect(x,x*1.5,10,100);
//			x+=20;
//		}
		
//		練習問題4-2
//		setColor(0,128,0);
//		int x = 30;
//		for(int i = 0; i < 9; i++) {
//			System.out.println(x);
//			fillRect(x,20,10,x*1.2);
//			x+=20;
//		}
		
//		練習問題4-3
		int r = 0,b = 0,g = 0;
		int x = 30;
		for(int i = 0; i < 9; i++) {
			setColor(r,b,g);
			System.out.println(x);
			fillRect(x,50,10,100);
			x+=20;
			r +=20;
			g +=20;
			b +=20;
		}
	}

}

package week2;

public class clockCheck {
public static void main(String[] args) throws InterruptedException {

	public void run(){
        try{
            int hour=0, minute=0, second=0;
            for(int i=0; i<=1000; i++){
                second++;
                if(second == 60){
                    minute++;
                    second = 0;
                }
                if(minute == 60){
                    hour ++;
                    minute=0;
                }
                System.out.format("%02d : %02d : %02d\r",hour, minute, second );
                Thread.sleep(1000);
            }
}
}

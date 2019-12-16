class Yigong{
	private String place;   //地点
	private String banji;    //负责班级
	private String looker;    //负责人
	private String time;  //时间
	int record = 0;
	public Yigong(){
		record++;
	}
	public Yigong(String place,String banji,String looker,String time){     //调用自己的内部方法完成构造器功能
		setPlace(place);
		setBanji(banji);
		setLooker(looker);
		setTime(time);
		record++;
	}
	public void setPlace(String place){
		this.place = place;
	}
	public String getPlace(){
		return place;
	}
	public void setBanji(String banji){
		this.banji = banji;
	}
	public String getBanji(){--------------------------
		return this.banji;
	}
	public void setLooker(String looker){
		this.looker = looker;
	}
	public String getLooker(){
		return this.looker;
	}
	public void setTime(String time){
		this.time = time;
	}
	public String getTime(){
		return this.time;
	}
	public String toString(){
		return "教室："+getPlace()+"  班级："+getBanji()
		+"  负责人："+getLooker()+"  时间:"+getTime();
	}
}
public class TestYigong{
	public static void main(String[] args){
		Yigong yigong = new Yigong();
		System.out.println(yigong.toString());
		System.out.println(yigong.record);
	}
}

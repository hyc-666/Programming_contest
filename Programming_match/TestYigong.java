class Yigong{
	private String place;   //�ص�
	private String banji;    //����༶
	private String looker;    //������
	private String time;  //ʱ��
	int record = 0;
	public Yigong(){
		record++;
	}
	public Yigong(String place,String banji,String looker,String time){     //�����Լ����ڲ�������ɹ���������
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
		return "���ң�"+getPlace()+"  �༶��"+getBanji()
		+"  �����ˣ�"+getLooker()+"  ʱ��:"+getTime();
	}
}
public class TestYigong{
	public static void main(String[] args){
		Yigong yigong = new Yigong();
		System.out.println(yigong.toString());
		System.out.println(yigong.record);
	}
}

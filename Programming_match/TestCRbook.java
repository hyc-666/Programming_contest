//���������ͽ���ԤԼ
class CRbook{
	private String id;     //����/�������
	boolean book;      //�Ƿ�ԤԼ
	private String time;
	public CRbook(){
	}
	public CRbook(String id,boolean book){
		setId(id);
		setBook(book);
		setTime(time);
	}
	//���������޸���
	public CRbook(String id,String time){
		this.id = id;
		this.time = time;
	}
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	public void setBook(boolean book){
		this.book = book;
	}
	public boolean getBook(){
		return this.book;
	}
	public void setTime(String time){
		this.time = time;
	}
	public String getTime(){
		return this.time;
	}
	public String isBook(){
		if(this.book)
			return "��";
		else
			return "��";
	}
	public String toString(){
		return "���ұ�ţ�"+getId()+"  ʱ�䣺"+getTime()+"  �Ƿ�ԤԼ��"+isBook();
	}
}
public class TestCRbook{      //����
	public static void main(String[] args){
		CRbook cr1 = new CRbook();
		System.out.println(cr1.toString());
	}
}

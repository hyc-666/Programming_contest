import java.util.Date;
class Xinli{
	private String Sname;      //ѧ����
	private String Tname;      //��ʦ��
	private String Tel;     //��ϵ��ʽ
	private String office;     //�칫��
	private String date;     //ʱ��
	private boolean book;     //�Ƿ�ԤԼ
	public Xinli(){     //�޲ι�����
	}
	public Xinli(String Tname,String Tel,String office,String date){
		
		setTname(Tname);
		setTel(Tel);
		setOffice(office);
		setDate(date);
	}
	public void setSname(String Sname){
		this.Sname = Sname;
	}
	public String getSname(){
		return Sname;
	}
	public void setTname(String Tname){
		this.Tname = Tname;
	}
	public String getTname(){
		return Tname;
	}
	public void setTel(String Tel){
		this.Tel = Tel;
	}
	public String getTel(){
		return Tel;
	}
	public void setOffice(String office){
		this.office = office;
	}
	public String getOffice(){
		return office;
	}
	public void setDate(String date){
		this.date = date;
	}
	public String getDate(){
		return date;
	}
	public boolean getBook(){
		return this.book;
	}
	public void setBook(boolean book){
		this.book = book;
	}
	public String isBook(){
		if(this.book)
			return "��ԤԼ";
		else
			return "";
	}
	public String toString(){
		return "ѧ��������"+getSname()+"  ��ʦ������"+getTname()
		+"  ��ϵ��ʽ:"+getTel()+"  �칫�ң�"+getOffice()+"  ʱ�䣺"
		+getDate()+"  "+isBook(); 
	}
	public String show(){
		return "��ʦ������"+getTname()
		+"  ��ϵ��ʽ:"+getTel()+"  �칫�ң�"+getOffice()+"  ʱ�䣺"
		+getDate();
	}
	
}
public class TestXinli{
	public static void main(String[] args){
		Xinli test = new Xinli();
		System.out.println(test.toString());
	}
}

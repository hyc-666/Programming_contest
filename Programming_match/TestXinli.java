import java.util.Date;
class Xinli{
	private String Sname;      //学生名
	private String Tname;      //教师名
	private String Tel;     //联系方式
	private String office;     //办公室
	private String date;     //时间
	private boolean book;     //是否预约
	public Xinli(){     //无参构造器
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
			return "已预约";
		else
			return "";
	}
	public String toString(){
		return "学生姓名："+getSname()+"  教师姓名："+getTname()
		+"  联系方式:"+getTel()+"  办公室："+getOffice()+"  时间："
		+getDate()+"  "+isBook(); 
	}
	public String show(){
		return "教师姓名："+getTname()
		+"  联系方式:"+getTel()+"  办公室："+getOffice()+"  时间："
		+getDate();
	}
	
}
public class TestXinli{
	public static void main(String[] args){
		Xinli test = new Xinli();
		System.out.println(test.toString());
	}
}

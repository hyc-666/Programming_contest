//公共机房和教室预约
class CRbook{
	private String id;     //教室/机房编号
	boolean book;      //是否预约
	private String time;
	public CRbook(){
	}
	public CRbook(String id,boolean book){
		setId(id);
		setBook(book);
		setTime(time);
	}
	//访问器和修改器
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
			return "是";
		else
			return "否";
	}
	public String toString(){
		return "教室编号："+getId()+"  时间："+getTime()+"  是否预约："+isBook();
	}
}
public class TestCRbook{      //测试
	public static void main(String[] args){
		CRbook cr1 = new CRbook();
		System.out.println(cr1.toString());
	}
}

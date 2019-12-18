class Student{
	private String id;     //学号
	private String name;     //姓名
	private String dept;      //系/学院
	private String banji;       //班级
	private String match;    //比赛信息
	private String honor;        //获奖情况，荣誉等
	public Student(){        //显式无参构造器
	}
	public Student(String id,String name,String dept,String banji){
		setId(id);
		setName(name);
		setDept(dept);
		setBanji(banji);
	}
	/*访问器和修改器 */
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	public String getDept(){
		return this.dept;
	}
	public void setBanji(String banji){
		this.banji = banji;
	}
	public String getBanji(){
		return this.banji;
	}
	public void setMatch(String match){
		this.match = match;
	}
	public String getMatch(){
		return this.match;
	}
	public void setHonor(String honor){
		this.honor = honor;
	}
	public String getHonor(){
		return this.honor;
	}
	public String toString(){
		return "学号："+getId()+"  姓名："+getName()+"  院系："+getDept()
		+"  班级："+getBanji()+"  竞赛信息："+getMatch()+"  荣誉："+getHonor();
	}
}
public class TestStudent{
	public static void main(String[] args){
		Student student = new Student();
		System.out.println(student.toString());
	}
}

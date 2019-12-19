import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
public class MainMenu{
	public static String PASSWORD = "mima123"; //默认的管理员密码
	public static ArrayList<Xinli> xinli = new ArrayList<>();    //心辅导
	public static ArrayList<Yigong> yigong = new ArrayList<>();   //义工活动
	public static ArrayList<CRbook> crbook = new ArrayList<>();     //机房和教室预定
	public static ArrayList<Student> students = new ArrayList<>();    //学生信息
	public static ArrayList<String> ziyuan = new ArrayList<>();     //公共资源
	public static int num1 = -1;  //心理辅导记录
	public static int num2 = -1;     //记录条数
	public static int num3 = -1;      //各自列表的长度
	public static int num4 = -1;      //全局变量
	public static int num5 = -1;
	public static void main(String[] args){

		while(true){  //运行就不能停
		String select = mainMenu();   //从主菜单传回的参数
		switch(select){
			case "1":{          //选项1
				Scanner input = new Scanner(System.in);
				boolean mn1 = true;   //不返回继续循环
				while(mn1){   //子循环
					menu1();   //子菜单1
					System.out.println("  0.返回上一级\t\t任意键继续");
					String go = input.next();  //接受输入的选择
					if(go.equals("0"))     //0退出
						mn1 = false;      //返回退出循环
				}
				break;
			}
			case "2":{         //选项2
				Scanner input = new Scanner(System.in);
				boolean mn2 = true;       //选项2的循环
				while(mn2){
					menu2();    //调用子菜单2
					System.out.println("  0.返回上一级\t\t任意键继续");
					String go = input.next();
					if(go.equals("0")) //0退出
						mn2 = false;
				}
				break;
			}
			case "3":{         //选项3
				Scanner input = new Scanner(System.in);
				boolean mn3 = true;  //选项3的循环
				while(mn3){
					menu3();   //子菜单3
					System.out.println("  0.返回上一级\t\t任意键继续");
					String go = input.next();  //接受控制台的数据决定是否继续
					if(go.equals("0"))     //0则退出子菜单3
						mn3 = false;  //循环标志量
				}
				break;
			}
			case "4":{           //选项4
				Scanner input = new Scanner(System.in);
				boolean mn4 = true; //选项4的循环
				while(mn4){
					menu4();   //子菜单4
					System.out.println("  0.返回上一级\t\t任意键继续");
					String go = input.next();
					if(go.equals("0"))  //0则退出
						mn4 = false;
				}
				break;
			}
			case "5":{           //选项5
				System.out.print("请输入管理员密码：");
				Scanner input = new Scanner(System.in);
				String password = input.next();   //需要从控制台输入管理员密码
				if(key(password)){       //密码正确
					boolean mn5 = true;   //进入子菜单5的循环
					while(mn5){    
						menu5(); //调用子菜单5
						System.out.println("  0.返回上一级\t\t任意键继续"); //提示是否继续
						String go = input.next();     //接受参数
						if(go.equals("0"))      //输入0
							mn5 = false;         //退出
					}
				}
				break;
			}
		}
		}
	}
	public static String mainMenu(){            //主菜单
		System.out.println("*******************************************");
		System.out.println("************** 学生管理系统 ***************");        //标题
		System.out.println("*******************************************");          //子菜单选项
		System.out.println("******** 1.心里咨询预约平台 ***************");
		System.out.println("******** 2.义工岗、义务劳动安排平台 *******");
		System.out.println("******** 3.公共机房、教室预约平台 *********");
		System.out.println("******** 4.公共资源共享平台 ***************");
		System.out.println("******** 5.学生信息管理 *******************");
		System.out.println("*******************************************");
		Scanner input = new Scanner(System.in);
		String x = null;   //可选项
		boolean goon  = false;    //主菜单之外的选项
		while(!goon){
				System.out.print("***请选择：");
				x = input.next();    //接受从控制台的数据
			
			if(!x.equals("1")&&!x.equals("2")&&!x.equals("3")&&!x.equals("4")&&!x.equals("5")){
				System.out.println("选择无效，请重新选择！");         //主菜单只有5个选项
			}
			else  //没有选择5个选项
				goon = true;    //重新选
		}		
		return x;		//返回所选项的参数
	}
	public static void menu1(){      //子菜单1
		System.out.println("************* 心理咨询平台 ****************");
		System.out.println("** 1.心理辅导预约 ");
		System.out.println("** 2.添加可预约项 ");
		System.out.println("** 3.查看预约 ");
		Scanner input = new Scanner(System.in);
		/*File heart = new File("heart.txt");
		if(heart.exists()){
			System.exit(0);
		}*/
		String s = input.next();     //子菜单选项
		
		switch(s){
			case "3":{
				for(int i = 0;i<xinli.size();i++){  //显示已添加的对象列表
					System.out.println(xinli.get(i).toString()); //类内部的方法
				}
				if(xinli.size() ==0)     //如果列表长度为0
					System.out.println("暂时没有预约相关信息");   //没有相关的预约信息
				break;
			}
			case "2":{         //依次输入信息
				//System.out.print("学生姓名：");
				//String Sname = input.next();
				System.out.print("教师姓名：");
				String Tname = input.next();
				System.out.print("教师电话：");
				String Tel = input.next();
				System.out.print("办公室：");
				String office = input.next();
				System.out.print("时间：");
				String date = input.next();
				xinli.add(new Xinli(Tname,Tel,office,date)); //将输入的项添加到列表里
				num1++;  //列表长度加1
				System.out.println(xinli.get(num1).show());//显示已添加
				
				/*String temp = xinli.get(num1).toString();  
				try(
					PrintWriter hearts = new PrintWriter(heart);
				){
				hearts.print(temp+"\n");
				}*/
				System.out.println("已添加");  //已添加
			    break;
			}
			
			case "1":{        //填写预约信息
				if(xinli.size()==0){
					System.out.println("暂时没有可选预约项");
					break;
				}
				else{
				/*System.out.print("学生姓名：");
				String Sname = input.next();
				System.out.print("教师姓名：");
				String Tname = input.next();
				System.out.print("联系方式：");
				String Tel = input.next();
				System.out.print("办公室：");
				String office = input.next();
				System.out.print("时间：");
				String date = input.next();
				System.out.println("已预约");*/
				for(int i = 0;i<xinli.size();i++){
					System.out.println(i+": "+xinli.get(i).show());   //显示已经添加过的和预约
				}
				System.out.print("请选择操作选项：");
				int i = input.nextInt();
				if(i>=0&&i<=xinli.size()){
					System.out.println(xinli.get(i).show());
					System.out.print("学生姓名：");
					String Sname = input.next();
					xinli.get(i).setSname(Sname);
					System.out.println(xinli.get(i).toString());       //显示预约内容
					xinli.get(i).setBook(true);        //设置为已预约
					System.out.println("已预约");       //提示预约成功
				}					
				else
					System.out.println("没有此可选项");	//如果超出列表上下限
				
				}
			break;	
			}
		}
	}
	public static void menu2(){        //子菜单2
		System.out.println("********** 义工岗、义务劳动安排平台 *******");
		System.out.println("** 1.义工岗安排查看 ");
		System.out.println("** 2.义务劳动安排 ");
		Scanner input = new Scanner(System.in);
		String s =input.next();     //子菜单2的选项参数
		switch(s){
			case "1":{       //显示已添加过的
				for(int i = 0;i<yigong.size();i++){
					System.out.println(yigong.get(i).toString());//打印已添加的列表
				}
				if(yigong.size() == 0)	         //初始时没有相关信息
					System.out.println("暂时没有相关信息");
				break;
			}
			case "2":{          //依次添加可选项
				System.out.print("教室：");
				String place = input.next();
				System.out.print("负责班级：");
				String banji = input.next();
				System.out.print("负责人：");
				String looker = input.next();
				System.out.print("活动时间：");
				String time = input.next();
				yigong.add(new Yigong(place,banji,looker,time)); //添加到列表
				num2++;     //记录加1
				System.out.println(yigong.get(num2).toString()); //显示已添加
				System.out.println("已添加");
				break;
			}
		}
	}
	public static void menu3(){       //子菜单3
		System.out.println("********** 公共机房、教室预约平台 *********");
		System.out.println("** 1.公共机房、教室预约 ");
		System.out.println("** 2.查看预约 ");
		System.out.println("** 3.添加可预约项 ");
		Scanner input = new Scanner(System.in);
		String s = input.next();      //接受从控制台传回的子菜单3的选项参数
		switch(s){
			case "1":{
				System.out.print("教室/机房编号：");
				String id = input.next();
				System.out.print("预约时间：");
				String time = input.next();
				for(int i = 0;i<crbook.size();i++){      //搜索是否已预约
					if(id.equals(crbook.get(i).getId())){    //如果编号与已预约的相同
					if(crbook.get(i).book)     //并且已经被预约
						System.out.println("此教室/机房已被预约");   //已被预约
					else
						System.out.println("预约成功");
						crbook.get(i).setBook(true);    //设置为已预约
						System.out.println(crbook.get(i).toString());   //显示出预约信息
				}
			}
				break;
			}
			case "2":{
				for(int i = 0;i<crbook.size();i++){          //输出已预约和添加的所有信息
					System.out.println(crbook.get(i).toString());     //依次输出
				}
				if(crbook.size() == 0) 		//初始时没有相关信息
					System.out.println("暂时没有相关信息");
				break;
			}
			case "3":{
				boolean t = true;     //是否继续添加
				while(t){
					System.out.print("教室/机房编号：");
					String id = input.next();     //把机房编号输入即可
					System.out.print("预约时间：");
					String time = input.next();
					crbook.add(new CRbook(id,time));     //新创建的对象添加到列表里
					num3++;        //列表长度加1
					System.out.println(crbook.get(num3).toString());    //确认添加信息
					System.out.println("已添加");
					System.out.println("\t0.返回\t任意键继续添加");     //0则退出
					String g = input.next();  //否则继续添加
					if(g.equals("0")){
						t = false;     //退出结束添加
					}
				}
				break;
			}
		}
		
	}
	public static void menu4(){        //子菜单4
		System.out.println("********** 公共资源共享平台 ***************");
		System.out.println("** 1.查看公共资源 ");
		System.out.println("** 2.添加公共资源 ");
		Scanner input = new Scanner(System.in);
		String s = input.next();       //子菜单4的循环
		switch(s){
			case "2":{       //设置为字符串对象列表
				String ziyuan1 = input.next();
				ziyuan.add(ziyuan1);     //输入的资源添加到列表
				num4++;     //列表长度加1
				break;
			}
			case "1":{        //显示已添加过的所有资源
				for(int i = 0;i<ziyuan.size();i++){
					System.out.println(ziyuan.get(i));
				}
				if(ziyuan.size() == 0)      //如果列表长度为0
					System.out.println("尚未添加资源");     //则说明列表里暂时没有资源
				break;
			}
		}
	}
	public static void menu5(){         //子菜单5
		System.out.println("************** 学生信息管理 ***************");
		System.out.println("** 1.添加学生信息 ");
		System.out.println("** 2.修改学生信息 ");
		System.out.println("** 3.删除学生信息 ");
		System.out.println("** 4.查看学生信息 ");
		System.out.println("** 5.修改管理员密码 ");
		Scanner input = new Scanner(System.in);
		String s = input.next();       //子菜单5的循环
		boolean exit = false;   //输入的学号没有被添加
		//boolean z = true;
		switch(s){
			case "1":{
				boolean go = true;   //是否继续添加
				while(go){
				System.out.print("学号：");
				String id = input.next();      //输入学号
				for(int i = 0;i<students.size();i++){     //搜索是否已经添加过
					if(id.equals(students.get(i).getId())){    //如果与已添加的学号重复
						System.out.println("此学号已存在！");
						exit = true;    //此学号已存在
					}
				}
				if(exit)  //若学号存在则退出
					break;      //提前结束信息录入
				System.out.print("姓名：");      //不存在继续添加且不报错
				String name = input.next();
				System.out.print("院系：");
				String dept = input.next();
				System.out.print("班级：");
				String banji = input.next();
				students.add(new Student(id,name,dept,banji));      //将学生信息添加到学生列表里
				num5++;   //列表元素加1
				System.out.println(students.get(num5).toString());       //确认已添加
				System.out.println("已添加");
				System.out.println("**0键退出，任意键继续添加");   //非0继续录入
				String tian = input.next();    //是否继续添加
				if(tian.equals("0"))  //否，则退出
					go = false;
			}
				break;
			}
			case "2":{
				boolean z = true;       //是否搜索到匹配项
				System.out.print("输入学号：");      //按学号查找信息
				String gai = input.next();     //接受输入的学号
				for(int i = 0;i<students.size();i++){     //校验是否是已经在列表里录入的
					if(gai.equals(students.get(i).getId())){      //如果学号相同
						System.out.println(students.get(i).toString()); //列出学生信息
						z = false;     //如果搜索到匹配项
						boolean x = true;  //是否继续修改
						while(x){
						System.out.println("选择修改项:");
						System.out.println("1.姓名   2.院系   3.班级   4.比赛信息   5.获奖情况");
						String g = input.next();     //接受选项信息
						//boolean x = true;
						//while(x){ 
						switch(g){
							case "1":{   //如果需要修改姓名
								System.out.print("更新姓名：");
								String name = input.next();
								students.get(i).setName(name);
								break;
							}
							case "2":{    //如需修改学院信息（比如转专业转院的）
								System.out.print("更新院系：");
								String dept = input.next();
								students.get(i).setDept(dept);
								break;
							}
							case "3":{
								System.out.print("更新班级：");    //本系内转专业的，留级的
								String banji = input.next();
								students.get(i).setBanji(banji);   //班级信息变更
								break;
							}
							case "4":{
								System.out.print("更新比赛信息：");
								String match = input.next();
								students.get(i).setMatch(match);
								break;
							}
							case "5":{
								System.out.print("更新获奖情况：");
								String honor = input.next();
								students.get(i).setHonor(honor);
								break;
							}
						}
						System.out.println("任意键继续修改，0键返回");     //是否继续修改
						String c = input.next();
						if(c.equals("0"))   //0退出
							x = false;  //否则继续选择修改哪一项
						}
					}
				}
				if(z)      //如果没有搜索到匹配项
					System.out.println("没有搜索到匹配项");
				break;
			}
			case "3":{
				boolean z1 = true;      //如果没有搜索到匹配项
				System.out.print("输入学号：");  //根据学号查找
				String xue = input.next();     //输入学号
				for(int i = 0;i<students.size();i++){    //列表内搜索
					if(xue.equals(students.get(i).getId())){   //有学号相同的
						z1 = false;    //已搜索到
						System.out.println(students.get(i).toString()); //显示搜索到的信息
						students.remove(i);        //删除此条记录
						num5--;                   //移除一条记录后列表长度减1
						System.out.println("已删除");
					}
					
						//System.out.println("没有搜索到匹配项");
				}
				if(z1)       //如果没有搜索到
					System.out.println("没有搜索到匹配项");
				break;
			}
			case "4":{        //显示所有已导入的学生信息
				for(int i = 0;i<students.size();i++){
					System.out.println(students.get(i).toString());
				}
				if(students.size() == 0)    //如果列表里没有信息
					System.out.println("暂时没有导入相关学生信息");
				break;
			}
			case "5":{
				System.out.print("输入旧密码：");
				String mima = input.next();
				if(key(mima)){     //旧密码输入正确
				System.out.print("输入新密码：");
				String newmima = input.next();
				PASSWORD = newmima;     //管理员密码更新
				System.out.println("密码已修改");
				}
				break;
			}
		}
	}
	public static boolean key(String password){       //验证管理员密码正确的方法
			if(PASSWORD.equals(password)){    //若接收到的密码正确
				System.out.println("密码正确");
				return true;      //返回true
			}
			else{
				System.out.println("密码错误");    //密码错误返回false
				return false;
			}
	}
}

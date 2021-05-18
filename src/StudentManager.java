import java.util.*;

public class StudentManager { /*8 StudentManager类，管理所有Student*/
    public  List<Student> studentList=new ArrayList<>();
    public void printf(){
        System.out.println("请选择操作                    ");
        System.out.println("*****************************");
        System.out.println("*        1 插入             *");
        System.out.println("*        2 查找             *");
        System.out.println("*        3 删除             *");
        System.out.println("*        4 修改             *");
        System.out.println("*        5 输出             *");
        System.out.println("*        6 退出             *");
        System.out.println("*****************************");
    }

    public  void insert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请依次输入学生的学号，姓名，生日，性别(true为男)");
        int ID = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        String birDate = scanner.nextLine();
        boolean gender = scanner.nextBoolean();
        Student student = new Student(ID, name, birDate, gender);
        studentList.add(student);
        Collections.sort(studentList, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getID()-o2.getID();
                    }
                }
        );
        System.out.println("添加成功");
    }


    public  void show(){
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }

    }


    public  void find(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找人的姓名");
        String name = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if(name.equals(studentList.get(i).getName())){ /*4 5 查找人名的判断结果，如果找到就输出人物信息*/
                System.out.println(studentList.get(i).toString());
                break;
            }else if(i==(studentList.size()-1)){
                System.out.println("未找到此人");
            }
        }
    }

    public  void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除人的姓名");
        String name = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if(name.equals(studentList.get(i).getName())){  /*4 5 删除此人的查找结果*/
                studentList.remove(i);
                break;

            }else  if(i==studentList.size()){
                System.out.println("未找到此人");
            }
        }
        Collections.sort(studentList, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getID()-o2.getID();
                    }
                }
        );

    }

    public  void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改人的姓名然后输入修改后的日期");
        String name = scanner.nextLine();
        String birDate = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if(name.equals(studentList.get(i).getName())){ /*4 5 修改人的查找结果*/
                studentList.get(i).setBirDate(birDate);
                break;

            }else  if(i==studentList.size()-1){
                System.out.println("未找到此人");
            }
        }
        Collections.sort(studentList, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.getID()-o2.getID();
                    }
                }
        );

    }

    public void error(){
        System.out.println("请输入正确的操作");
    }

    public  void App(){ /*8 App方法，负责程序的整个控制流程 */
        while (true){ /*4 5 当输入操作正确的时候，依次执行操作*/
            Scanner scanner = new Scanner(System.in);
            printf();
            int a=scanner.nextInt();
            switch (a){
                case 1:insert();
                break;
                case 2:find();
                break;
                case 3:delete();
                break;
                case 4:update();
                break;
                case 5:show();
                break;
                case 6:
                    System.exit(0);
                default:
                    error();
            }
        }

    }



}/* 6 {对应line3*/

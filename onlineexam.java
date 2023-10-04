
import java.util.*;
public class onlineexam {
    HashMap<String,Integer>info=new HashMap<String,Integer>();
    Scanner sc =new Scanner(System.in);
    public void login(){
        info.put("A",100);
        info.put("B",200);
        info.put("C",300);
        info.put("D",400);
        System.out.println("Enter USER ID:");
        String uid= sc.nextLine();
        System.out.println("Enter PASSWORD");
        int mm=sc.nextInt();
        if(info.containsKey(uid)&&info.get(uid)==mm){
            System.out.println("Successfully logged.in!");
        }
        else{
            System.out.println("try again!");
            login();

        }
    }
    public void menu(){
        System.out.println("\n select any one");
        System.out.println("1 Update profile and password\n2. Start the exam\n3.logout");
        System.out.println("\n enter your option:");
        int option=sc.nextInt();
        switch(option)

        {
            case 1:
                info = update();
                menu();
                break;
            case 2:
                Exam();
                menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("INVALID OPTION");
        }
    }
    public HashMap<String,Integer>update(){
        System.out.println("Update Profile");
        System.out.println("Enter Username :");
        Scanner sc=new Scanner(System.in);
        String newuid = sc.nextLine();
        if(info.containsKey(newuid)){
            System.out.println("Enter new password");
            int newpw =sc.nextInt();
            info.replace(newuid,newpw);
        }
        else{
            System.out.println("user does not exist");
        }
        System.out.println(".. your profile updated successfully !|");
        return info ;
    }
    public void Exam(){
        long start = System.currentTimeMillis();
        long end1=start+20*1000;
        long end2=start+25*1000;
        int score1=0,score2=0;
        int cnt1=0,cnt2=0;
        char ans;
        System.out.println("Start the exam");
        System.out.println("You have just 20 second to answer each question in section 1.");
        System.out.println("You habe just 25 second to answer each question in section 2.");
        System.out.println("In section 1: 4 marks for correct and -1 for incorret");
        System.out.println("In section 2:10 marks for correct and -2 for incorrect");
        System.out.println("All the best!");
        while(System.currentTimeMillis()<end1){
            System.out.println("SECTION 1");
            System.out.println("1. Who is called Father of Computer?");
            System.out.println("a.JAMES GOSLING\nb.DENNINS RITHCE\nc.Charlse babbage\nd.Mark Zuckerburg");
            System.out.println("Enter your answer");
            ans=sc.next().charAt(0);
            if(ans=='c'){
                cnt1+=1;
            }
            System.out.println("2.What is the brain of Computer ?");
            System.out.println("a.RAM\nb.CPU\nc.ROM\nd.KEYBOARD");
            ans=sc.next().charAt(0);
            if(ans=='b'){
                cnt1+=1;
            }
            System.out.println("3.Which of the following smallest unit of memory?");
            System.out.println("a. Byte\nb.Bit\nc.Kb\nd.Mb");
            System.out.println("Enter your answer");
            ans=sc.next().charAt(0);
            if(ans=='b'){
                cnt1+=1;
            }
            System.out.println("4.What is known as temporary memory?");
            System.out.println("a.RAM\nb.ROM\nc.SSD\nd.HDD");
            System.out.println("Enter your answer");
            ans=sc.next().charAt(0);
            if(ans=='a'){
                cnt1+=1;
            }
            break;

        }
        while(System.currentTimeMillis()<end2){
            System.out.println("SECTION 2");
            System.out.println("5.Guess the output");
            System.out.println("public static vpoid main(String args[]{\n\tint x=5;\n\tint y=x++ + ++x;\n\tSystem.out.println(y)");
            System.out.println("a.\10nb.11\nc.12\nd13");
            System.out.println("Enter your number");
            ans=sc.next().charAt(0);
            if (ans=='c'){
                score2+=10;
                cnt2+=1;
            }
            else score2-=2;
            break;
        }
        System.out.println("You have completed the exam|");
        score1=cnt1*5-((4-cnt1)*1);
        System.out.println("correct question in section 1:"+cnt1);
        System.out.println("correct question in section 2:"+cnt2);
        System.out.println("Total score is:"+(score1+score2)+"out of 30");
    }
    //public classonlineExamination{
    public static void main(String[]args){
        onlineexam can=new onlineexam();
        can.login();
        can.menu();
    }
}
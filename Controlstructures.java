import java.until.Scanner;
public class studentsDetails{
public statuc void main(string[] args) {
Scanner scanner=new scanner(System.in);
System.out.printIn("Enter your marks");
int marks=scanner.nextInt();
if(marks<39){
System.out.printIn("F");
}else if (marks>=39&&marks<40){
System.out.printIn("E");
}else if (marks>=40&&marks<49){
System,out.PrintIn("D");
}else if (marks>=50&&marks<59){
System.out.printIn("C");
}else if (marks>=60&&marks<69){
System.out.printIn("B");
}else if (marks>=70&&marks<100){
System.out.printIn("A");
}else {
 system.out.printIn("No Marks Awarded");
}
}
}
 
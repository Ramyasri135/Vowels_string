import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine(); 
        int vowelcount=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++ ){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelcount++;
            }
        }
        System.out.println("no of vowels in the string: "+(vowelcount));
    }
}
    

import java.util.Scanner;


public class calcPercentage {
    

// calculate percentage
    public static float percentage(){

        //creating Scanner object sc
        Scanner sc = new Scanner(System.in);

        float TotalMarks = 0;
        float MarksObtained = 0;

        // array of subject Names
        String[] subjectName = {"English","Hindi" ,"Maths" , "Science" , "Social"};

        //Maximum marks in every sub is 100 
        // 

        for (byte i = 0 ; i < subjectName.length ; i++){
            System.out.println("Enter marks of " + subjectName[i] + " Subject");
            MarksObtained += sc.nextFloat();
            System.out.println("Enter maximum marks in " + subjectName[i]);
            TotalMarks += sc.nextFloat();

        }


        return ((MarksObtained/TotalMarks)*100); 
    }


    public static void main(String[] args){
        
         System.out.println(percentage());
    
    }

}

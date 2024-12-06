import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int index=0;
        int sum = 0;
        int num1=0;
        int num2=0;
        boolean first=true;
        ArrayList<String> fileData = getFileData("src/file");
        String nums=fileData.get(0);
        while(index<nums.length()) {
            if(!first) {
                nums = nums.substring(nums.indexOf(" ") + 1);
            }
            first=false;
            num1 = Integer.parseInt(nums.substring(index,nums.indexOf(" ")));
            nums=nums.substring(nums.indexOf(" ")+1);
            if(nums.contains()) {
                num2=Integer.parseInt((nums));
                index=Integer.MAX_VALUE;
            }else {
                num2 = Integer.parseInt(nums.substring(index, nums.indexOf(" ")));
            }
            sum+=num1*num2;
            System.out.println(sum);
        }
    }
    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}
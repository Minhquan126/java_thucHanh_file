import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String path) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()){
               throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e){
            throw new Exception();
        }
return numbers;
    }
    public void writeFile(String path,int max){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("gia tri lon nhat : " + max);
            bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

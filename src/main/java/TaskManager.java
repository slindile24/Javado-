import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3
    private static final String TEST_FILE= "tasks.csv";
    private TaskManager taskManager;




    public TaskManager() {
        // Initialize tasks list
         tasks = new ArrayList<>();

         try{
             File file = new File(TEST_FILE);
             if(file.createNewFile()){
                 System.out.println(file);
             }else{
                 Files.deleteIfExists(Paths.get(TEST_FILE));
                 taskManager = new TaskManager();
             }
         }catch(IOException e){
             System.out.println("Error occured");
             e.printStackTrace();
         }

    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> listTasks() {
        return tasks;
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        try{
            Files.write(Paths.get(TEST_FILE), tasks);
        }catch(IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
        // leave for iteration 2
//        File.write(Paths.get(TEST_FILE),tasks);
        
    }
}
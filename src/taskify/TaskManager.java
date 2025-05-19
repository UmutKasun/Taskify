package taskify;

// Burası görevleri yöneten sınıf. Görevleri listeye ekliyoruz, gösteriyoruz ve tamamlıyoruz.
// Normalde listeyi ayrı yerde tutmak yerine bu sınıfın içinde ArrayList olarak saklıyoruz.

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();


    // Bu metot yeni görev eklememizi sağlıyor. Parametre olarak görev ismini alıyor.
    public void addTask(String title) {
        tasks.add(new Task(title));
    }


    // Bu metot görevleri sıralıyor. Tamamlananlara ✓ koyuyorum, yapılmayanlar boş kutu gibi görünüyor.
    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            System.out.println((i+1) + ". " + t.getTitle() + (t.isCompleted() ? " [✓]" : " [ ]"));
        }
    }

    // Bu metot verilen sıradaki görevi tamamlanmış olarak işaretliyor.
    // Kullanıcı 1 yazınca aslında 0. indexteki görevi tamamlıyoruz, o yüzden -1 yapıyoruz.
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
        }
    }
}

package taskify;

// Ana program burası. Kullanıcıdan veri alıp TaskManager üzerinden işlem yaptırıyoruz.
// Scanner ile kullanıcıdan input alıyoruz.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {

            // Burada kullanıcıya 4 seçenek sunuyorum:
            // 1: Görev ekle, 2: Görevleri listele, 3: Görev tamamlama, 4: Çıkış
            // Kullanıcının seçimine göre switch-case ile işlemleri yönlendiriyorum.
            System.out.println("\n1. Add task\n2. List tasks\n3. Complete task\n4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // temizle

            switch (choice) {
                case 1:// Kullanıcıdan görev ismi alıp ekliyorum.
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    break;
                case 2:// Görevleri ekrana yazdırıyorum. Listeleme kısmı bu.
                    manager.listTasks();
                    break;
                case 3:// Görev numarasını alıp o görevi tamamlıyoruz.
                    System.out.print("Enter task number to complete: ");
                    int index = scanner.nextInt() - 1;
                    manager.completeTask(index);
                    break;
                case 4:// Programdan çıkış.
                    return;
            }
        }
    }
}

package taskify;

// Bu sınıf her bir görevi (task) temsil ediyor.
// Görevin başlığı (title) ve tamamlanıp tamamlanmadığını tutuyoruz.


public class Task {
    private String title;
    private boolean isCompleted;

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}

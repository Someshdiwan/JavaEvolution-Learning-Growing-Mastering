class Pen {
    public synchronized void writeWithPenAndPaper(NoteNook noteNook) {
        System.out.println(Thread.currentThread().getName() + " is using pen");
        noteNook.finishWritinig();
    }

    public synchronized void finishWritinig() {
        System.out.println(Thread.currentThread().getName() + " finished using " + this);
    }
}

class NoteNook {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + "is using Paper " + this + " and trying to use pen" + this);
        pen.finishWritinig();
    }

    public synchronized void finishWritinig() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

class Task1 implements Runnable {
    private Pen pen;
    private NoteNook noteNook;

    public Task1(Pen pen, NoteNook noteNook) {
        this.pen = pen;
        this.noteNook = noteNook;
    }

    public void run() {
        pen.writeWithPenAndPaper(noteNook); //Thread1 locks pen and tries to lock the notebook.
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private NoteNook notebook;

    public Task2(Pen pen, NoteNook noteNook) {
        this.pen = pen;
        this.notebook = noteNook;
    }

    public void run() {
        //Preventing deadlocks
        synchronized (pen){
            notebook.writeWithPaperAndPen(pen); //Thread1 locks paper and tries to lock pen.
        }
        // notebook.writeWithPaperAndPen(pen); //Thread1 locks paper and tries to lock pen.
    }
}

public class DeadLock {
    public static void main(String[] args) {
        Pen pen = new Pen();
        NoteNook notebook = new NoteNook();

        //Via constructor, we are sending objects check above code.
        Thread thread1 = new Thread(new Task1(pen, notebook), "Thread One is running");
        Thread thread2 = new Thread(new Task2(pen, notebook), "Thread Two is  running");

        thread1.start();
        thread2.start();
    }
}

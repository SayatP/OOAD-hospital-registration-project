import java.time.LocalDate;


import static java.lang.System.out;
public class Checkup {
    private LocalDate date;
    private String content;

    public Checkup(LocalDate d, String c) {
        date = d;
        content = c;
        out.println("Checkup created with given content: " + c);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

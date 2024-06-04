package Model;

public class ListToDo {
    private int id;
    private String dateTime;
    private String text;

    public ListToDo(int id, String dateTime, String text) {
        this.id = id;
        this.dateTime = dateTime;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        dateTime = dateTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

package traffic;

public class Road {
    String name;
    int seconds;
    boolean open;

    public Road(String name) {
        this.name = name;
        open = false;
    }

    public String getName() {
        return name;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isOpen() {
        return open;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    @Override
    public String toString() {
        String str = "Road \"" + name + "\" will be ";
        if (open) str += "\u001B[32m" + "open for " + seconds + "s." + "\u001B[0m";
        else str += "\u001B[31m" + "closed for " + seconds + "s." + "\u001B[0m";
        return str;
    }
}

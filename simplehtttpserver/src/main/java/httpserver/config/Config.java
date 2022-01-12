package httpserver.config;

public class Config {
    private int p;
    private String wroot;
    public int getPort() {
        return p;
    }

    public String getWebroot() {
        return wroot;
    }
    public void setWebroot(String wroot) {
        this.wroot = wroot;
    }

    public void setPort(int p) {
        this.p = p;
    }
}

package XYZ.InputString.model;

public class Analyze {
    private String analyze;

    public Analyze(String analyze) {
        this.analyze = analyze;
    }

    public String getAnalyze() {
        return analyze;
    }

    public void setAnalyze(String analyze) {
        this.analyze = analyze;
    }

    @Override
    public String toString() {
        return "Analyze [analyze=" + analyze + "]";
    }
}

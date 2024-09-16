package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    // コンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率メソッド　
    public double getRate() {
        // 勝ち数/（勝ち数＋負け数）
        return (double)win / (win + lose);
    }
    public void report() {
    // チームの成績をレポートするメソッド
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝 " + this.lose + "敗" + this.draw + "分、勝率は" + getRate() + "です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }





}

package models;

public class Mesa {

    private int id;


    private String num;
    private String local;

    public Mesa(String num, String local) {
        this.num = num;
        this.local = local;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

    // ✅ Exibição amigável
    @Override
    public String toString() {
        return "Mesa " + num + " - Local: " + local;
    }
}
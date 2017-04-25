package sg.edu.rp.c346.demolistview;

/**
 * Created by 15056158 on 25/4/2017.
 */

public class food {

    private String name;
    private boolean star;

    public food(String name, boolean star) {
        this.name = name;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public boolean isStar() {
        return star;
    }
}


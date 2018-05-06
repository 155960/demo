package demo.pojo;

public class Demo {
    private Integer id;

    private String name;

    private Integer orderBy;

    public Demo(Integer id, String name, Integer orderBy) {
        this.id = id;
        this.name = name;
        this.orderBy = orderBy;
    }

    public Demo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }
}
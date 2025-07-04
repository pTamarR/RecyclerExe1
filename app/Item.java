public class Item {

    private String name;
    private int imageResourse;
    private String description;

    public Item(String name,int imageResourse,String description) {
        this.name = name;
        this.imageResourse = imageResourse;
        this.description = description;
    }
    public String getName() {
        return this.name;
    }
    public int getimageResourse()
    {
        return this.imageResourse;
    }
    public String getdescription()
    {
        return this.description;
    }

}

package lesson5.part1;

public class Categories {
    private long categoryId;
    private String categoryName;
    private String description;
    private String picture;

    public Categories(long categoryId, String categoryName, String description, String picture) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.picture = picture;
    }

    public Categories(long categoryId) {
        this.categoryId = categoryId;
    }
}
